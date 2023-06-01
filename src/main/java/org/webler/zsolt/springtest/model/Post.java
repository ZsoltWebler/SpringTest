package org.webler.zsolt.springtest.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "POSTS")
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User author;

    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "post")
    private Set<Comment> comments = new HashSet<>();

    public Post(User user, String content) {
        this.author = user;
        this.content = content;

        this.author.addPost(this);
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

}
