package com.example.fleamarket.controller;

import com.example.fleamarket.pojo.Goods;
import com.example.fleamarket.pojo.History;
import com.example.fleamarket.pojo.ServerResult;
import com.example.fleamarket.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class HistoryController {
    @Autowired
    HistoryService historyService;

    @RequestMapping("/selectAllHistory")
    public ServerResult selectAllHistory(){
        List<History> list=historyService.selectAllHistory();
        ServerResult serverResult=new ServerResult(000,"查询成功",list);
        return  serverResult;
    }

    @RequestMapping("/selectByHistoryUserId")
    public ServerResult selectByHistoryUserId(Integer userId){
        History history=historyService.selectByHistoryUserId(userId);
        return new ServerResult(000,"查询成功",history);
    }

    @RequestMapping("/selectByHistoryGoodsId")
    public ServerResult selectByHistoryGoodsId(Integer goodsId){
        History history=historyService.selectByHistoryGoodsId(goodsId);
        return new ServerResult(000,"查询成功",history);
    }

    @RequestMapping("/deleteByHistoryUserId")
    public ServerResult deleteByHistoryUserId(Integer userId){
        int deleteRow=historyService.deleteByHistoryUserId(userId);
        if(deleteRow>=1){
            return new ServerResult(000,"删除成功",null);
        }else{
            return new ServerResult(101,"删除失败",null);
        }
    }

    @RequestMapping("/deleteByHistoryGoodsId")
    public ServerResult deleteByHistoryGoodsId(Integer goodsId){
        int deleteRow=historyService.deleteByHistoryGoodsId(goodsId);
        if(deleteRow>=1){
            return new ServerResult(000,"删除成功",null);
        }else{
            return new ServerResult(102,"删除失败",null);
        }
    }

}
