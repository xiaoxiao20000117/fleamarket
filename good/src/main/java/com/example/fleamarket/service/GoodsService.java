package com.example.fleamarket.service;

import com.example.fleamarket.pojo.Goods;
import com.example.fleamarket.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GoodsService {
    public List<Goods> selectAll();
    public List<Goods> selectByPriceAsc();
    public List<Goods> selectByPriceDesc();
    public List<Goods> selectByKindsId(Integer kindsId);
    public List<Goods> selectByStatus(Integer status);
    public Goods selectByGoodsId(Integer goodsId);
    public List<Goods> selectByUserId(Integer userId);
    public int insertGoods(Goods goods);
    public int updateStatus(Goods goods);
    public int updateGoods(Goods goods);
    public int deleteGoods(Integer goodsId);
    public List<Goods> selectGoodsByGoodName(String goodName);
    public List<Goods> selectKindsAsc(Integer kindsId);
    public List<Goods> selectKindsDesc(Integer kindsId);
}
