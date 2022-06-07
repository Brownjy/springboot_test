package com.example.springboot_test.dao;

import com.example.springboot_test.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
    int addUser(User user);
}
