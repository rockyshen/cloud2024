package com.atguigu.cloud.service;

import com.atguigu.cloud.pojo.Pay;

import java.util.List;

public interface PayService {
    public int insert(Pay pay);

    public int delete(Integer id);

    public int update(Pay pay);

    public Pay selectById(Integer id);

    public List<Pay> selectAll();
}
