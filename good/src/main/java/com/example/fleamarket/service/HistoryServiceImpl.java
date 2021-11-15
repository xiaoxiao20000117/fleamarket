package com.example.fleamarket.service;

import com.example.fleamarket.mapper.HistoryMapper;
import com.example.fleamarket.pojo.GoodsExample;
import com.example.fleamarket.pojo.History;
import com.example.fleamarket.pojo.HistoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryServiceImpl implements HistoryService{
    @Autowired
    HistoryMapper historyMapper;

    @Override
    public List<History> selectAllHistory() {
        return historyMapper.selectByExample(null);
    }

    @Override
    public History selectByHistoryUserId(Integer historyId) {
        return historyMapper.selectByPrimaryKey(historyId);
    }

    @Override
    public History selectByHistoryGoodsId(Integer goodsId) {
        return historyMapper.selectByPrimaryKey(goodsId);
    }

    @Override
    public int deleteByHistoryUserId(Integer userId) {
        return historyMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int deleteByHistoryGoodsId(Integer goodsId) {
        return historyMapper.deleteByPrimaryKey(goodsId);
    }
}
