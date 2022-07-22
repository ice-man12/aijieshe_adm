package com.aijieshe.service;

import com.aijieshe.pojo.commodity;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface commodity_service {
    ArrayList<commodity> getall(String id, String name, Integer page, Integer limit);

    int getcount(String id,String name);
int updata(String id,String name,String introduce,String price,String create_time,String update_time,String amount,String image1_src,String image2_src,String image3_src,String state,String buyers,String supplier);

    int delbyid(String id);

    int add_commodity(String id,String name,String introduce,String price,String create_time,String update_time,String amount,String image1_src,String image2_src,String image3_src,String state,String buyers,String supplier);

    int update_list(List<HashMap<String,String>> updateMap,String state);
}
