package com.aijieshe.service;

import com.aijieshe.pojo.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface user_service {
    ArrayList<user> getall(String phone,String real_name,String user_name,Integer page,Integer limit);
    int getcount(String phone,String real_name,String user_name);

    int delbyid(String id);

    int updata(String id,String real_name,String user_name,String sex,String mail,String create_time,String state,String phone,String password,String dormitorio,String instalaciones,String integral);

    int add_user(String id,String real_name,String user_name,String sex,String mail,String create_time,String state,String phone,String password,String dormitorio,String instalaciones,String integral);

    int update_list(List<HashMap<String,String>> updateMap);

    int update_password(String id,String password);

    int delete_list(List<HashMap<String,String>> updateMap);
}

