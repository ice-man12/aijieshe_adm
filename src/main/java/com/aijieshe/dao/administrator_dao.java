package com.aijieshe.dao;

import com.aijieshe.pojo.administrator;
import org.apache.ibatis.annotations.Mapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Mapper
public interface administrator_dao {
    administrator check(String id,String password);

    ArrayList<administrator> getall(String id,String name,Integer page,Integer limit);

    int getconut(String id,String name);

    int delbyid(String id);

    int updata(String id,String name,String starttime,String updatetime,String password,String phone,String department,String campus,String position,String state,String permission);

    int add_adm(String id,String name,String starttime,String updatetime,String password,String phone,String department,String campus,String position,String state,String permission);

    int update_list(List<HashMap<String, String>> updateMap);

    int delete_list(List<HashMap<String, String>> deleteMap);
}
