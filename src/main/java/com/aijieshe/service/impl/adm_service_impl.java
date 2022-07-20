package com.aijieshe.service.impl;

import com.aijieshe.dao.administrator_dao;
import com.aijieshe.pojo.administrator;
import com.aijieshe.service.administrator_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class adm_service_impl implements administrator_service {

    @Autowired
    private administrator_dao adm_dao;

    @Override
    public ArrayList<administrator> getall(String id, String name, int page, Integer limit) {
        return adm_dao.getall(id,name,page,limit);
    }


    @Override
    public int getcount(String id, String name) {
        return adm_dao.getconut(id,name);
    }

    @Override
    public administrator check(String id, String password) {

        return adm_dao.check(id,password);

    }

    @Override
    public int delbyid(String id) {
        return adm_dao.delbyid(id);
    }

    @Override
    public int add_adm(String id, String name, String starttime, String updatetime, String password, String phone, String department, String campus, String position, String state, String permission) {
        return adm_dao.add_adm(id,name,starttime,updatetime,password,phone,department,campus,position,state,permission);
    }

    @Override
    public int updata(String id, String name, String starttime, String updatetime, String password, String phone, String department, String campus, String position, String state, String permission) {
        System.out.println(id);
        return adm_dao.updata(id,name,starttime,updatetime,password,phone,department,campus,position,state,permission);
    }

    @Override
    public int update_list(List<HashMap<String, String>> updateMap) {
        return adm_dao.update_list(updateMap);
    }

    @Override
    public int delete_list(List<HashMap<String, String>> deleteMap) {
        return adm_dao.delete_list(deleteMap);
    }
}
