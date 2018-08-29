package com.example.demo.controller;

import com.example.demo.api.Testservice;
import com.example.demo.entiy.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.function.Predicate;

@RestController()
public class UserController {

    @Autowired
    private Testservice testService;

    @GetMapping("/All")
    public Object queryAll(User user) {

        //创建匹配器，即如何使用查询条件
        //构建对象
        ExampleMatcher matcher=ExampleMatcher.matching()
                //改变默认字符串匹配方式：模糊查询
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING)
                //改变默认大小写忽略方式：忽略大小写
                .withIgnoreCase(true)
                //地址采用“开始匹配”的方式查询
                .withMatcher("address", ExampleMatcher.GenericPropertyMatchers.startsWith())
                //忽略属性：是否关注。因为是基本类型，需要忽略掉
                .withIgnorePaths("focus");

        Example<User> ex = Example.of(user, matcher);

        List<User> userList = testService.queryAll(ex);
        return userList;
    }

    @GetMapping("/by")
    public List<User> findBynameAndsex(String name,String sex) {
        List<User> userList = testService.findByNameAndsex(name,sex);
        return userList;
    }

    @GetMapping("/page")
    public Page<User> findAll(Integer page,Integer size) {
        Page<User> users =testService.findAll(page,size);
        return users;
    }

    @PostMapping("/save")
    public void saveUser(User user){
        testService.saveUser(user);
    }

    @GetMapping("/p")
    public Page<User> findByPageAndParam(User param, int pageNumber, int pageSize) {
        return testService.findByPageAndParam(param,pageNumber,pageSize);
    }

    @GetMapping("/one")
    public User findOneById(String id) {
        return testService.findOneById(id);
    }

    @GetMapping("/pa")
    public Page<User> findAllLikePage(User user,int page,int size) {

        //创建匹配器，即如何使用查询条件
        //构建对象
        ExampleMatcher matcher=ExampleMatcher.matching()
                //改变默认字符串匹配方式：模糊查询
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING)
                //改变默认大小写忽略方式：忽略大小写
                .withIgnoreCase(true)
                //地址采用“开始匹配”的方式查询
                .withMatcher("address", ExampleMatcher.GenericPropertyMatchers.startsWith())
                //忽略属性：是否关注。因为是基本类型，需要忽略掉
                .withIgnorePaths("focus");

        Example<User> ex = Example.of(user, matcher);

        Pageable pageable=new PageRequest(page,size);

        return testService.findAllLikePage(ex,pageable);
    }



}
