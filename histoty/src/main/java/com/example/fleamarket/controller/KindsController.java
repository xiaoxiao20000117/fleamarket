package com.example.fleamarket.controller;

import com.example.fleamarket.pojo.Kinds;
import com.example.fleamarket.pojo.ServerResult;
import com.example.fleamarket.service.KindsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class KindsController {
    @Autowired
    KindsService kindsService;

    @RequestMapping("/selectAllKinds")
    public ServerResult selectAllKinds(){
        List<Kinds> list=kindsService.selectAllKinds();
        ServerResult serverResult=new ServerResult(000,"找到当事人",list);
        return serverResult;
    }
    @RequestMapping("/deleteKindsById")
    public ServerResult deleteKindsById(Integer kindsId){
        int deleteRow=kindsService.deleteKinds(kindsId);
        if(deleteRow>=1){
            return new ServerResult(000,"删除成功",null);
        }else{
            return new ServerResult(204,"删除失败",null);
        }
    }

    @RequestMapping("/insertKinds")
    public ServerResult insertKinds(Kinds kinds){
        int insertRow=kindsService.insertKinds(kinds);
        if(insertRow>=1){
            return new ServerResult(000,"添加成功",null);
        }else{
            return new ServerResult(204,"添加失败",null);
        }
    }

}
