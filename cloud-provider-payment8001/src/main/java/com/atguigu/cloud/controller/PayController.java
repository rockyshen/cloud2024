package com.atguigu.cloud.controller;

import cn.hutool.core.bean.BeanUtil;
import com.atguigu.cloud.pojo.Pay;
import com.atguigu.cloud.pojo.PayDTO;
import com.atguigu.cloud.service.PayService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("pay")
public class PayController {
    @Autowired
    private PayService payService;

    @PostMapping("add")
    public int addPay(@RequestBody Pay pay) {
        System.out.println(pay.toString());
        int rows = payService.insert(pay);
        return rows;
    }

    @DeleteMapping("del/{id}")
    public int deletePay(@PathVariable("id") Integer id){
        System.out.println();
        int rows = payService.delete(id);
        return rows;
    }

    @PutMapping("update")
    public int updatePay(@RequestBody PayDTO payDTO){
        Pay pay = new Pay();  // 基于前端传来的DTO，扩为Pojo
        BeanUtil.copyProperties(payDTO,pay);
        int rows = payService.update(pay);
        return rows;
    }

    @GetMapping("get/{id}")
    public Pay getById(@PathVariable("id") Integer id){
        Pay pay = payService.selectById(id);
        return pay;
    }

    @GetMapping("get")
    public List<Pay> getAll(){
        List<Pay> pays = payService.selectAll();
        return pays;
    }
}
