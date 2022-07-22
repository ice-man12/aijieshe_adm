package com.aijieshe.service.impl;

import com.aijieshe.dao.commodity_dao;
import com.aijieshe.pojo.commodity;
import com.aijieshe.service.commodity_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class commodity_service_impl implements commodity_service {
    @Autowired
    commodity_dao com_dao;

    @Override
    public ArrayList<commodity> getall(String id, String name, Integer page, Integer limit) {
        return com_dao.getall(id,name,page,limit);

    }

    @Override
    public int getcount(String id, String name) {
        return com_dao.getcount(id,name);
    }

    @Override
    public int updata(String id, String name, String introduce, String price, String create_time, String update_time, String amount, String image1_src, String image2_src, String image3_src, String state, String buyers, String supplier) {
        return com_dao.updata(id,name,introduce,price,create_time,update_time,amount,image1_src,image2_src,image3_src,state,buyers,supplier);
    }

    @Override
    public int delbyid(String id) {
        return com_dao.delbyid(id);
    }

    @Override
    public int add_commodity(String id, String name, String introduce, String price, String create_time, String update_time, String amount, String image1_src, String image2_src, String image3_src, String state, String buyers, String supplier) {
        return com_dao.add_commodity( id, name, introduce, price, create_time, update_time, amount, image1_src, image2_src, image3_src, state, buyers, supplier);
    }

    @Override
    public int update_list(List<HashMap<String, String>> updateMap, String state) {
        return com_dao.update_list(updateMap,state);
    }
}
