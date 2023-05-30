package org.webler.zsolt.springtest.service;

import org.webler.zsolt.springtest.model.Comment;
import org.webler.zsolt.springtest.model.Post;
import org.webler.zsolt.springtest.model.User;

public interface IBlogService {


    public Post getMostCommentedPost();

    public User mostPublishedAuthor();

    public User createUser(User user);

    public boolean deleteUser(User user);

    public Post publishPost(User user, Post post);

    public Post addCommentToPost(User user, Post post, Comment comment);

}
