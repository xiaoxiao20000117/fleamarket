package com.example.fleamarket.service;

import com.example.fleamarket.pojo.History;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HistoryService {
    public List<History> selectAllHistory();
    public History selectByHistoryUserId(Integer userId);
    public History selectByHistoryGoodsId(Integer goodsId);
    public int deleteByHistoryUserId(Integer userId);
    public int deleteByHistoryGoodsId(Integer goodsId);
}
