package com.aijieshe.service.impl;

import com.aijieshe.dao.user_dao;
import com.aijieshe.pojo.user;
import com.aijieshe.service.user_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class user_service_impl implements user_service {

   @Autowired
   private  user_dao u_dao;

    @Override
    public int getcount(String phone, String real_name, String user_name) {
        return u_dao.getcount(phone,real_name,user_name);
    }

    @Override
    public ArrayList<user> getall(String phone, String real_name, String user_name, Integer page, Integer limit) {
        return u_dao.getall(phone,real_name,user_name,page,limit);
    }

    @Override
    public int delbyid(String id) {
        return u_dao.delbyid(id);
    }

    @Override
    public int updata(String id, String real_name, String user_name, String sex, String mail, String create_time, String state, String phone, String password, String dormitorio, String instalaciones, String integral) {
        return u_dao.updata(id,real_name,user_name,sex,mail,create_time,state,phone,password,dormitorio,instalaciones,integral);
    }

    @Override
    public int add_user(String id, String real_name, String user_name, String sex, String mail, String create_time, String state, String phone, String password, String dormitorio, String instalaciones, String integral) {
        return u_dao.add_user(id, real_name, user_name, sex, mail, create_time, state, phone, password, dormitorio, instalaciones, integral);
    }

    @Override
    public int update_list(List<HashMap<String, String>> updateMap) {
        return u_dao.update_list(updateMap);
    }

    @Override
    public int update_password(String id, String password) {
        return u_dao.update_password(id,password);
    }

    @Override
    public int delete_list(List<HashMap<String, String>> updateMap) {
        return u_dao.delete_list(updateMap);
    }
}
