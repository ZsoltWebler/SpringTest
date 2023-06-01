package org.webler.zsolt.springtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.webler.zsolt.springtest.model.Post;

public interface PostRepository extends JpaRepository<Post,Long> {
}
