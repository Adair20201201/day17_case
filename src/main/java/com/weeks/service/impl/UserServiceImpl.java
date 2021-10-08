package com.weeks.service.impl;

import com.weeks.dao.UserDao;
import com.weeks.dao.impl.UserDaoImpl;
import com.weeks.domain.User;
import com.weeks.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
