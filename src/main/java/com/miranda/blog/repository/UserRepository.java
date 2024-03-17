package com.miranda.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miranda.blog.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
