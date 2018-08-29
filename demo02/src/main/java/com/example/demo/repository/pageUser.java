package com.example.demo.repository;

import com.example.demo.entiy.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface pageUser extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

    User findOneById(String id);

}
