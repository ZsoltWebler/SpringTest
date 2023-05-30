package org.webler.zsolt.springtest.service;

import org.webler.zsolt.springtest.model.Comment;
import org.webler.zsolt.springtest.model.Post;
import org.webler.zsolt.springtest.model.User;

public class BlogService implements IBlogService{

    @Override
    public Post getMostCommentedPost() {
        return null;
    }

    @Override
    public User mostPublishedAuthor() {
        return null;
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }

    @Override
    public Post publishPost(User user, Post post) {
        return null;
    }

    @Override
    public Post addCommentToPost(User user, Post post, Comment comment) {
        return null;
    }
}
