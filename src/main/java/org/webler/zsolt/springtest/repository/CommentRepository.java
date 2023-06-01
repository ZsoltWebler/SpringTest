package org.webler.zsolt.springtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.webler.zsolt.springtest.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
