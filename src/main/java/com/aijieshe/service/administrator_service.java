package com.aijieshe.service;

import com.aijieshe.pojo.administrator;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public interface administrator_service {

   administrator check(String id , String password);

   ArrayList<administrator> getall(String id,String name,int page,Integer limit);

   int getcount(String id,String name);


   int delbyid(String id);

   int updata(String id,String name, String starttime, String updatetime, String password,String phone,String department, String campus, String position,String state, String permission);

   int add_adm(        String id,String name,String starttime,String updatetime,String password,String phone,String department,String campus,String position,String state,String permission);

   int update_list(List<HashMap<String,String>> updateMap);

   int delete_list(List<HashMap<String,String>> updateMap);

   int update_password(String id,String password);

}
