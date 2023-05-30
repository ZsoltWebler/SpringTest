package org.webler.zsolt.springtest.model;

import java.util.Set;


public class Post {

    private User author;

    private String content;

    private Set<Comment> comments;
}
