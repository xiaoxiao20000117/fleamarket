package com.example.fleamarket.service;

import com.example.fleamarket.pojo.Kinds;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KindsService {
    public List<Kinds> selectAllKinds();
    public int deleteKinds(Integer kindsId);
    public int insertKinds(Kinds kinds);
}
