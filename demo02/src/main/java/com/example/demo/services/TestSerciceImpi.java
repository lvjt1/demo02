package com.example.demo.services;

import com.example.demo.api.Testservice;
import com.example.demo.entiy.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.pageUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.*;
import java.util.List;


@Service
@Transactional(readOnly = true)
@CacheConfig
public class TestSerciceImpi implements Testservice {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private pageUser pageUser;

    @Override
    public List<User> queryAll(Example<User> ex) {
        List<User> list = userRepository.findAll(ex);
        return list;
    }

    @Override
    public List<User> findByNameAndsex(String name, String sex) {
        List<User> list = userRepository.findByNameLikeAndSex(name, sex);
        return list;
    }

    @Override
    public Page<User> findAll(Integer page,Integer size) {
        Page<User> users =pageUser.findAll(new PageRequest(page,size));
        return users;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void saveById(String id, String name, String sex) {
    }

    @Override
    public User findByNameLike(String name) {
        User user=userRepository.findByNameLike(name);
        return user;
    }

    @Override
    public Page<User> findByPageAndParam(final User param, int pageNumber, int pageSize) {

        Sort sort = new Sort(Sort.Direction.DESC, "name");

        Specification<User> spec = new Specification<User>() {        //查询条件构造

            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query,CriteriaBuilder cb) {

                Path<String> name = root.get("name");

                Path<String> sex = root.get("sex");

                Predicate like = cb.like(name, "%"+param.getName()+"%");
                Predicate p2 = cb.like(sex,"%"+param.getSex()+"%");

                Predicate p = cb.and(like, p2);

                return p;

           }
        };

        PageRequest pageRequest = new PageRequest(pageNumber, pageSize, sort);

        return pageUser.findAll(spec, pageRequest);

    }

    @Override
    public User findOneById(String id) {
        return pageUser.findOneById(id);
    }

    @Override
    public Page<User> findAllLikePage(Example<User> ex, Pageable pageable) {
        return pageUser.findAll(ex,pageable);
    }


}
