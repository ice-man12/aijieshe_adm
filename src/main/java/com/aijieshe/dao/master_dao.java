package com.aijieshe.dao;


import com.aijieshe.pojo.commodity;
import com.aijieshe.pojo.master;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Mapper
public interface master_dao {
    ArrayList<master> getall(String id, String name, Integer page, Integer limit);

    int getcount(String id,String name);

    int delbyid(String id);

    int updata(String id,String name,String phone,String password,String create_time,String sex,String reputation,String money,String state,String address);

    int add_master(String id,String name,String phone,String password,String sex,String reputation,String money,String state,String create_time,String address);

    int update_list(@Param("list") List<HashMap<String, String>> updateMap, @Param("state") String state);
}
