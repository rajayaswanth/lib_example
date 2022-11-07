package com.ws2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws2.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
