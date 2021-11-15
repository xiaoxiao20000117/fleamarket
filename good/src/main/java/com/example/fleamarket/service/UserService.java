package com.example.fleamarket.service;

import com.example.fleamarket.pojo.Admin;
import com.example.fleamarket.pojo.Goods;
import com.example.fleamarket.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public User userLogin(User user);
    public boolean register(User user);
    public boolean updateUser(User user);
    public int updateUserStatus(User user);
    public User selectUserByUserId(Integer userId);
    public List<User> selectAll();
    public int deleteUser(Integer userId);
}
