package org.webler.zsolt.springtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.webler.zsolt.springtest.model.Comment;
import org.webler.zsolt.springtest.model.Post;
import org.webler.zsolt.springtest.model.User;
import org.webler.zsolt.springtest.service.BlogService;

import java.util.List;

@RestController
public class BlogController {


    @Autowired
    BlogService blogService;

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User user) {
        return blogService.createUser(user);
    }

    @GetMapping("/users")
    public List<User> getAllUser() {
        return blogService.getAllUser();
    }

    @DeleteMapping("/users/{id}")
    public boolean deleteUser(@PathVariable Long id) {
        return blogService.deleteUser(blogService.getUserById(id));
    }

    @PostMapping("/users/{user_id}/posts")
    @ResponseStatus(HttpStatus.CREATED)
    public Post publishPost(@PathVariable Long user_id, @RequestBody Post post) {
        return blogService.publishPost(blogService.getUserById(user_id), post);
    }

    @PostMapping("/users/{user_id}/posts/{post_id}/comments")
    @ResponseStatus(HttpStatus.CREATED)
    public Post publishPost(@PathVariable Long user_id, @PathVariable Long post_id, @RequestBody Comment comment) {
        return blogService.addCommentToPost(
                blogService.getUserById(user_id),
                blogService.getPostById(post_id),
                comment);
    }

    @GetMapping("/users/most")
    public User getMostPublishedAuthor() {
        return blogService.mostPublishedAuthor();
    }

    @GetMapping("/posts/most")
    public Post getMostCommentedPost() {
        return blogService.getMostCommentedPost();
    }


}

