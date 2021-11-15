package com.example.fleamarket.service;

import com.example.fleamarket.mapper.UserMapper;
import com.example.fleamarket.pojo.Admin;
import com.example.fleamarket.pojo.AdminExample;
import com.example.fleamarket.pojo.User;
import com.example.fleamarket.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;

    @Override
    public User userLogin(User user) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.or();
        criteria.andNameEqualTo(user.getName());
        criteria.andPasswordEqualTo(user.getPassword());
//        criteria.andStatusEqualTo(0);
        List<User> list=userMapper.selectByExample(userExample);
        if (list.size()>=1){
            return list.get(0);
        }
        return null;
    }

    @Override
    public boolean register(User user) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.or();
        criteria.andNameEqualTo(user.getName());
        List<User> list=userMapper.selectByExample(userExample);
        if(list.size()>=1){
            return false;
        }
        else {
            user.setStatus(0);
            int insertRow=userMapper.insertSelective(user);
            if(insertRow>=1){
//          判断是否注册成功
                return true;
            }else {
                return false;
            }
        }
    }

    @Override
    public boolean updateUser(User user) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.or();
        criteria.andIdNotEqualTo(user.getId());
        List<User> list=userMapper.selectByExample(userExample);
        if(list.size()>=1){

            int insertRow = userMapper.updateByPrimaryKeySelective(user);
            if(insertRow>=1){
//          判断是否更新成功
                return true;
            }else {
                return false;
            }

        }
        else {
            return false;
        }
    }

    @Override
    public int updateUserStatus(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User selectUserByUserId(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectByExample(null);
    }

    @Override
    public int deleteUser(Integer userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }

}
