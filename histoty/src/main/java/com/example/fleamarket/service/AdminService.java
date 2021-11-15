package com.example.fleamarket.service;

import com.example.fleamarket.pojo.Admin;
import com.example.fleamarket.pojo.Goods;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    public List<Admin> selectAll();
    public Admin adminLogin(Admin admin);
    public int insertAdmin(Admin admin);
    public int updateAdmin(Admin admin);
    public int deleteAdmin(Integer adminId);
}
