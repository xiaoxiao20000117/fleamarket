package com.example.fleamarket.service;

import com.example.fleamarket.mapper.GoodsMapper;
import com.example.fleamarket.pojo.Goods;
import com.example.fleamarket.pojo.GoodsExample;
import jdk.net.SocketFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService{

    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public List<Goods> selectAll() {
        return goodsMapper.selectByExample(null);
    }

    @Override
    public List<Goods> selectByPriceAsc() {
        GoodsExample goodsExample=new GoodsExample();
        GoodsExample.Criteria criteria=goodsExample.or();
        criteria.andStatusEqualTo(1);
        goodsExample.setOrderByClause("price asc");
        return goodsMapper.selectByExample(goodsExample);
    }

    @Override
    public List<Goods> selectByPriceDesc() {
        GoodsExample goodsExample=new GoodsExample();
        GoodsExample.Criteria criteria=goodsExample.or();
        criteria.andStatusEqualTo(1);
        goodsExample.setOrderByClause("price desc");
        return goodsMapper.selectByExample(goodsExample);
    }

    @Override
    public List<Goods> selectByKindsId(Integer kindsId) {
        GoodsExample goodsExample=new GoodsExample();
        GoodsExample.Criteria criteria=goodsExample.or();
        criteria.andStatusEqualTo(1);
        criteria.andKindIdEqualTo(kindsId);
        return goodsMapper.selectByExample(goodsExample);
    }

    @Override
    public Goods selectByGoodsId(Integer goodsId) {
        return goodsMapper.selectByPrimaryKey(goodsId);
    }

    @Override
    public List<Goods> selectByUserId(Integer userId) {
        GoodsExample goodsExample=new GoodsExample();
        GoodsExample.Criteria criteria=goodsExample.or();
        criteria.andUserIdEqualTo(userId);
        return goodsMapper.selectByExample(goodsExample);
    }

    @Override
    public List<Goods> selectByStatus(Integer status) {
        GoodsExample goodsExample=new GoodsExample();
        GoodsExample.Criteria criteria=goodsExample.or();
        criteria.andStatusEqualTo(status);
        return goodsMapper.selectByExample(goodsExample);
    }

    @Override
    public int updateStatus(Goods goods) {
        return goodsMapper.updateByPrimaryKeySelective(goods);
    }

    @Override
    public int insertGoods(Goods goods) {
        goods.setStatus("0");
        return goodsMapper.insertSelective(goods);
    }

    @Override
    public int updateGoods(Goods goods) {
        return goodsMapper.updateByPrimaryKeySelective(goods);
    }

    @Override
    public int deleteGoods(Integer goodsId) {
        return goodsMapper.deleteByPrimaryKey(goodsId);
    }

    @Override
    public List<Goods> selectGoodsByGoodName(String goodName) {
        goodName = "%"+goodName+"%";
        GoodsExample goodsExample=new GoodsExample();
        GoodsExample.Criteria criteria=goodsExample.or();
        criteria.andStatusEqualTo(1);
        criteria.andNameLike(goodName);
        return goodsMapper.selectByExample(goodsExample);
    }

    @Override
    public List<Goods> selectKindsAsc(Integer kindsId) {
        GoodsExample goodsExample=new GoodsExample();
        GoodsExample.Criteria criteria=goodsExample.or();
        criteria.andKindIdEqualTo(kindsId);
        criteria.andStatusEqualTo(1);
        goodsExample.setOrderByClause("price asc");
        return goodsMapper.selectByExample(goodsExample);
    }

    @Override
    public List<Goods> selectKindsDesc(Integer kindsId) {
        GoodsExample goodsExample=new GoodsExample();
        GoodsExample.Criteria criteria=goodsExample.or();
        criteria.andKindIdEqualTo(kindsId);
        criteria.andStatusEqualTo(1);
        goodsExample.setOrderByClause("price desc");
        return goodsMapper.selectByExample(goodsExample);
    }

}
