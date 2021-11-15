package com.example.fleamarket.service;

import com.example.fleamarket.mapper.AdminMapper;
import com.example.fleamarket.pojo.Admin;
import com.example.fleamarket.pojo.AdminExample;
import com.example.fleamarket.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    AdminMapper adminMapper;

    @Override
    public List<Admin> selectAll() {
        return adminMapper.selectByExample(null);
    }

    @Override
    public Admin adminLogin(Admin admin){
        AdminExample adminExample=new AdminExample();
        AdminExample.Criteria criteria=adminExample.or();
        criteria.andNameEqualTo(admin.getName());
        criteria.andPasswordEqualTo(admin.getPassword());
        List<Admin> list=adminMapper.selectByExample(adminExample);
        if (list.size()>=1){
            return list.get(0);
        }
        return null;
    }

    @Override
    public int insertAdmin(Admin admin) {
        return adminMapper.insertSelective(admin);
    }

    @Override
    public int updateAdmin(Admin admin) {
        return adminMapper.updateByPrimaryKeySelective(admin);
    }

    @Override
    public int deleteAdmin(Integer adminId) {
        return adminMapper.deleteByPrimaryKey(adminId);
    }
}
