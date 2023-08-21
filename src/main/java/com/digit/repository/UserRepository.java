package com.digit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digit.entity.LogIn;
@Repository
public interface UserRepository extends JpaRepository<LogIn, Integer> {

}
