package org.webler.zsolt.springtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webler.zsolt.springtest.model.Comment;
import org.webler.zsolt.springtest.model.Post;
import org.webler.zsolt.springtest.model.User;
import org.webler.zsolt.springtest.repository.CommentRepository;
import org.webler.zsolt.springtest.repository.PostRepository;
import org.webler.zsolt.springtest.repository.UserRepository;

import java.util.Comparator;
import java.util.List;

@Service
public class BlogService implements IBlogService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PostRepository postRepository;

    @Autowired
    CommentRepository commentRepository;

    @Override
    /* GET /posts/most */
    public Post getMostCommentedPost() {

        return postRepository.findAll().stream().max(Comparator.comparingInt(post -> post.getComments().size())).orElseThrow();
    }

    @Override
    public User mostPublishedAuthor() {

        return userRepository.findAll().stream().max(Comparator.comparingInt(post -> post.getPosts().size())).orElseThrow();
    }

    @Override
    public User createUser(User user) {

        return userRepository.save(user);
    }

    public List<User> getAllUser() {

        return userRepository.findAll();
    }

    public User getUserById(Long id) {

        return userRepository.findById(id).orElseThrow();
    }

    public Post getPostById(Long id) {

        return postRepository.findById(id).orElseThrow();
    }


    @Override
    public boolean deleteUser(User user) {

        try {
            userRepository.delete(user);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public Post publishPost(User user, Post post) {
        Post post_ = new Post(user, post.getContent());

        return postRepository.save(post_);
    }

    @Override
    public Post addCommentToPost(User user, Post post, Comment comment) {

        Comment comment_ = new Comment(user, post, comment.getMessage());
        commentRepository.save(comment_);

        return postRepository.save(post);
    }
}
