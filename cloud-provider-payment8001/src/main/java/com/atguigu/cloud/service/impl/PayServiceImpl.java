package com.atguigu.cloud.service.impl;

import com.atguigu.cloud.mapper.PayMapper;
import com.atguigu.cloud.pojo.Pay;
import com.atguigu.cloud.service.PayService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayServiceImpl implements PayService {
    @Autowired
    private PayMapper payMapper;

    @Override
    public int insert(Pay pay) {
        int rows = payMapper.insertSelective(pay);
        return rows;   // 返回影响行数！
    }

    @Override
    public int delete(Integer id) {
        int rows = payMapper.deleteByPrimaryKey(id);
        return rows;
    }

    @Override
    public int update(Pay pay) {
        int rows = payMapper.updateByPrimaryKeySelective(pay);
        return rows;
    }

    @Override
    public Pay selectById(Integer id) {
        Pay pay = payMapper.selectByPrimaryKey(id);
        return pay;
    }

    @Override
    public List<Pay> selectAll() {
        List<Pay> pays = payMapper.selectAll();
        return pays;
    }
}
