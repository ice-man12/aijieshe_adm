package com.aijieshe.service;



import com.aijieshe.pojo.master;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface master_service {

    ArrayList<master> getall(String id, String name, Integer page, Integer limit);

    int getcount(String id,String name);

    int delbyid(String id);

    int updata(String id,String name,String phone,String password,String create_time,String sex,String reputation,String money,String state,String address);

    int add_master(String id,String name,String phone,String password,String sex,String reputation,String money,String state,String create_time,String address);

    int update_list(List<HashMap<String,String>> updateMap, String state);
}
