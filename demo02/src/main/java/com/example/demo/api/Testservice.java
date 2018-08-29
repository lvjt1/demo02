package com.example.demo.api;

import com.example.demo.entiy.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Testservice {

    List<User> queryAll(Example<User> ex);

    List<User> findByNameAndsex(String name, String sex);

    Page<User> findAll(Integer page, Integer size);

    void saveUser(User user);

    void saveById(String id,String name,String sex);

    User findByNameLike(String name);

    Page<User> findByPageAndParam(final User param, int pageNumber,int pageSize);

    User findOneById(String id);

    Page<User> findAllLikePage(Example<User> ex, Pageable pageable);
}
