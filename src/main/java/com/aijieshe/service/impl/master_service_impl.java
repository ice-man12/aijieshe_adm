package com.aijieshe.service.impl;

import com.aijieshe.dao.master_dao;
import com.aijieshe.pojo.master;
import com.aijieshe.service.master_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class master_service_impl implements master_service {

    @Autowired
    private master_dao mas_dao;

    @Override
    public ArrayList<master> getall(String id, String name, Integer page, Integer limit) {
        return mas_dao.getall(id,name,page,limit);
    }

    @Override
    public int getcount(String id, String name) {
        return mas_dao.getcount(id,name);
    }

    @Override
    public int delbyid(String id) {
        return mas_dao.delbyid(id);
    }

    @Override
    public int updata(String id, String name, String phone, String password, String create_time, String sex, String reputation, String money, String state, String address) {
        return mas_dao.updata(id,name,phone,password,create_time,sex,reputation,money,state,address);
    }

    @Override
    public int add_master(String id, String name, String phone, String password, String sex, String reputation, String money, String state, String create_time, String address) {
        return mas_dao.add_master(id,name,phone, password,sex,reputation,money,state,create_time,address);
    }

    @Override
    public int update_list(List<HashMap<String, String>> updateMap, String state) {
        return mas_dao.update_list(updateMap,state);
    }
}
