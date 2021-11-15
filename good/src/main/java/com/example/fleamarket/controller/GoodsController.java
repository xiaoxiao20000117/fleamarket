package com.example.fleamarket.controller;

import com.example.fleamarket.pojo.Goods;
import com.example.fleamarket.pojo.ServerResult;
import com.example.fleamarket.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class GoodsController {
    @Autowired
    GoodsService goodsService;

    @RequestMapping("/selectGoodsByGoodName")
    public ServerResult selectGoodsByGoodName(String goodName){
        List<Goods> list=goodsService.selectGoodsByGoodName(goodName);
        ServerResult serverResult=new ServerResult(000,"查询成功",list);
        return  serverResult;
    }

    @RequestMapping("/selectKindsAsc")
    public ServerResult selectKindsAsc(Integer kindsId){
        List<Goods> list=goodsService.selectKindsAsc(kindsId);
        ServerResult serverResult=new ServerResult(000,"查询成功",list);
        return  serverResult;
    }

    @RequestMapping("/selectKindsDesc")
    public ServerResult selectKindsDesc(Integer kindsId){
        List<Goods> list=goodsService.selectKindsDesc(kindsId);
        ServerResult serverResult=new ServerResult(000,"查询成功",list);
        return  serverResult;
    }


    @RequestMapping("/updateStatusBuy")
    public ServerResult updateStatusBuy(Goods goods){
        Goods goods1=goodsService.selectByGoodsId(goods.getId());
        if(goods1.getStatus().equals("1")){
            int updateRow=goodsService.updateGoods(goods);
            if(updateRow>=1){
                return new ServerResult(000,"更新成功",null);
            }else{
                return new ServerResult(205,"更新失败",null);
            }
        }else {
            return new ServerResult(206,"更新失败",null);
        }

    }

    @RequestMapping("/selectByUserId")
    public ServerResult selectByUserId(Integer userId){
        List<Goods> list=goodsService.selectByUserId(userId);
        for (int i=0;i<list.size();i++) {
            if(list.get(i).getStatus().equals("0")){
                list.get(i).setStatus("申请上架");
            }else if(list.get(i).getStatus().equals("1")){
                list.get(i).setStatus("正在出售");
            }else if(list.get(i).getStatus().equals("-1")){
                list.get(i).setStatus("申请失败");
            }else if(list.get(i).getStatus().equals("2")){
                list.get(i).setStatus("已售出");
            }
        }
        return new ServerResult(000,"查询成功",list);
    }

    @RequestMapping("/selectAll")
    public ServerResult selectAll(){
        List<Goods> list=goodsService.selectAll();
        ServerResult serverResult=new ServerResult(000,"查询成功",list);
        return  serverResult;
    }

    @RequestMapping("/selectByPriceAsc")
    public ServerResult selectByPriceAsc(){
        List<Goods> list=goodsService.selectByPriceAsc();
        ServerResult serverResult=new ServerResult(000,"查询成功",list);
        return  serverResult;
    }

    @RequestMapping("/selectByPriceDesc")
    public ServerResult selectByPriceDesc(){
        List<Goods> list=goodsService.selectByPriceDesc();
        ServerResult serverResult=new ServerResult(000,"查询成功",list);
        return  serverResult;
    }

    @RequestMapping("/selectByKindsId")
    public ServerResult selectByKindsId(Integer kindsId){
        List<Goods> list=goodsService.selectByKindsId(kindsId);
        ServerResult serverResult=new ServerResult(000,"查询成功",list);
        return  serverResult;
    }

    @RequestMapping("/selectByStatus")
    public ServerResult selectByStatus(Integer status){
        List<Goods> list=goodsService.selectByStatus(status);
        ServerResult serverResult=new ServerResult(000,"查询成功",list);
        return  serverResult;
    }

    @RequestMapping("/selectByGoodsId")
    public ServerResult selectByGoodsId(Integer goodsId){
        Goods goods=goodsService.selectByGoodsId(goodsId);
        return new ServerResult(000,"查询成功",goods);
    }

    @RequestMapping("/insertGoods")
    public ServerResult insertGoods(Goods goods){
        int insertRow=goodsService.insertGoods(goods);
        if(insertRow>=1){
            return new ServerResult(000,"添加成功",null);
        }else{
            return new ServerResult(201,"添加失败",null);
        }
    }

    @RequestMapping("/updateGoods")
    public ServerResult updateGoods(Goods goods){
        int updateRow=goodsService.updateGoods(goods);
        if(updateRow>=1){
            return new ServerResult(000,"更新成功",null);
        }else{
            return new ServerResult(202,"更新失败",null);
        }
    }

    @RequestMapping("/updateStatus")
    public ServerResult updateStatus(Goods goods){
        int updateRow=goodsService.updateStatus(goods);
        if(updateRow>=1){
            return new ServerResult(000,"更新成功",null);
        }else{
            return new ServerResult(203,"更新失败",null);
        }
    }

    @RequestMapping("/deleteGoods")
    public ServerResult deleteGoods(Integer goodsId){
        int deleteRow=goodsService.deleteGoods(goodsId);
        if(deleteRow>=1){
            return new ServerResult(000,"删除成功",null);
        }else{
            return new ServerResult(204,"删除失败",null);
        }
    }

}
