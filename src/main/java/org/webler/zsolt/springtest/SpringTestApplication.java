package org.webler.zsolt.springtest;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.webler.zsolt.springtest.model.Comment;
import org.webler.zsolt.springtest.model.Post;
import org.webler.zsolt.springtest.model.User;
import org.webler.zsolt.springtest.repository.CommentRepository;
import org.webler.zsolt.springtest.repository.PostRepository;
import org.webler.zsolt.springtest.repository.UserRepository;

import java.util.List;

@SpringBootApplication
public class SpringTestApplication {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PostRepository postRepository;

    @Autowired
    CommentRepository commentRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringTestApplication.class, args);
    }

    @Bean
    InitializingBean initDatabase() {
        return () -> {

            User user_1 = new User("John", "Doe", "john_doe@gmail.com");
            User user_2 = new User("Jane", "Doe", "jane_doe@gmail.com");
            User user_3 = new User("John", "Smith", "john_smith@gmail.com");
            User user_4 = new User("Jane", "Smith", "jane_smith@gmail.com");

            userRepository.saveAll(List.of(user_1, user_2, user_3, user_4));

            Post post_1 = new Post(user_1, "Post_1 Content");
            Post post_2 = new Post(user_2, "Post_2 Content");

            postRepository.saveAll(List.of(post_1, post_2));

            Comment comment_1 = new Comment(user_3, post_1, "Test comment_1");
            Comment comment_2 = new Comment(user_4, post_2, "Test comment_2");

            commentRepository.saveAll(List.of(comment_1, comment_2));

        };
    }

}
