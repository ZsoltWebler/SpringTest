package org.webler.zsolt.springtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.webler.zsolt.springtest.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
