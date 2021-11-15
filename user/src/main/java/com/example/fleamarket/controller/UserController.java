package com.example.fleamarket.controller;

import com.example.fleamarket.pojo.Goods;
import com.example.fleamarket.pojo.ServerResult;
import com.example.fleamarket.pojo.User;
import com.example.fleamarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/userLogin")
    public ServerResult userLogin(User user) {
        User dbUser = userService.userLogin(user);
        if (dbUser != null) {
            Integer status = dbUser.getStatus();
            dbUser.setPassword("");//密码不能发给浏览器
            if (status == 0) {
                return new ServerResult(000, "登陆成功", dbUser);
            } else {
                return new ServerResult(301, "账号被封禁", null);
            }
        } else
            return new ServerResult(302, "登陆失败", null);
    }
    @RequestMapping("/register")
    public ServerResult register(User user){
        boolean isSuccess=userService.register(user);
        if (isSuccess){
            return new ServerResult(000,"登陆成功",null);
        }else {
            return new ServerResult(303,"登陆失败",null);
        }
    }

    @RequestMapping("/update")
    public ServerResult update(User user){
        boolean updateRow=userService.updateUser(user);
        if(updateRow){
            return new ServerResult(000,"更新成功",null);
        }else{
            return new ServerResult(304,"更新失败",null);
        }
    }

    @RequestMapping("/updateUserStatus")
    public ServerResult updateUserStatus(User user){
        int updateRow=userService.updateUserStatus(user);
        if(updateRow>=1){
            return new ServerResult(000,"更新成功",null);
        }else{
            return new ServerResult(305,"更新失败",null);
        }
    }

    @RequestMapping("/selectUserByUserId")
    public ServerResult selectUserByUserId(Integer userId){
        User user = userService.selectUserByUserId(userId);
        return new ServerResult(000,"查询成功",user);
    }

    @RequestMapping("/selectAllUser")
    public ServerResult selectAllUser(){
        List<User> list=userService.selectAll();
        ServerResult serverResult=new ServerResult(000,"查询成功",list);
        return  serverResult;
    }

    @RequestMapping("/deleteUser")
    public ServerResult deleteUser(Integer userId){
        int deleteRow=userService.deleteUser(userId);
        if(deleteRow>=1){
            return new ServerResult(000,"删除成功",null);
        }else{
            return new ServerResult(204,"删除失败",null);
        }
    }

}
