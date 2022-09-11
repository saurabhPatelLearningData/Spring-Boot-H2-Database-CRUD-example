package com.bt.spring.jpa.h2.repository;

import com.bt.spring.jpa.h2.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
