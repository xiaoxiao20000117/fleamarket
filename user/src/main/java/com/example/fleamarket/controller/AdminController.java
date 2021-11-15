package com.example.fleamarket.controller;

import com.example.fleamarket.pojo.Admin;
import com.example.fleamarket.pojo.Goods;
import com.example.fleamarket.pojo.ServerResult;
import com.example.fleamarket.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class AdminController {
    @Autowired
    AdminService adminService;

    @RequestMapping("/adminLogin")
    public ServerResult adminLogin(Admin admin){
        Admin dbAdmin=adminService.adminLogin(admin);
        if (dbAdmin!=null){
            dbAdmin.setPassword("");//密码不能发给浏览器
            return new ServerResult(000,"上帝早上好!",admin);
        }
        return new ServerResult(001,"上帝的记错啦!",null);
    }

    @RequestMapping("/selectAllAdmin")
    public ServerResult selectAll(){
        List<Admin> list=adminService.selectAll();
        ServerResult serverResult=new ServerResult(000,"查询成功",list);
        return  serverResult;
    }

    @RequestMapping("/insertAdmin")
    public ServerResult insertAdmin(Admin admin){
        int insertRow=adminService.insertAdmin(admin);
        if(insertRow>=1){
            return new ServerResult(000,"添加成功",null);
        }else{
            return new ServerResult(201,"添加失败",null);
        }
    }

    @RequestMapping("/updateAdmin")
    public ServerResult updateAdmin(Admin admin){
        int updateRow=adminService.updateAdmin(admin);
        if(updateRow>=1){
            return new ServerResult(000,"更新成功",null);
        }else{
            return new ServerResult(202,"更新失败",null);
        }
    }

    @RequestMapping("/deleteAdmin")
    public ServerResult deleteAdmin(Integer adminId){
        int deleteRow=adminService.deleteAdmin(adminId);
        if(deleteRow>=1){
            return new ServerResult(000,"删除成功",null);
        }else{
            return new ServerResult(204,"删除失败",null);
        }
    }

}
