package com.example.fleamarket.service;

import com.example.fleamarket.mapper.KindsMapper;
import com.example.fleamarket.pojo.Kinds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KindsServiceImpl implements KindsService{
    @Autowired
    KindsMapper kindsMapper;

    @Override
    public List<Kinds> selectAllKinds() {
        return kindsMapper.selectByExample(null);
    }

    @Override
    public int deleteKinds(Integer kindsId) {
        return kindsMapper.deleteByPrimaryKey(kindsId);
    }

    @Override
    public int insertKinds(Kinds kinds) {
        return kindsMapper.insertSelective(kinds);
    }
}
