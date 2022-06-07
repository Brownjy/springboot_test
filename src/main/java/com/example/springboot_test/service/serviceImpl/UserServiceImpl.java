package com.example.springboot_test.service.serviceImpl;

import com.example.springboot_test.dao.UserDao;
import com.example.springboot_test.entity.User;
import com.example.springboot_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }
}
