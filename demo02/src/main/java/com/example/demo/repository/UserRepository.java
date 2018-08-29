package com.example.demo.repository;

import com.example.demo.entiy.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    List<User> findByNameLikeAndSex(String name,String sex);

    User findByNameLike(String name);

    List<User> findAll();


//    @Query("SELECT u FROM test u WHERE LOWER(u.name) = LOWER(:name)")
//    User findByUsernameCaseInsensitive(@Param("name") String username);

}
