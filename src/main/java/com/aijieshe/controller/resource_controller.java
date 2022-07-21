package com.aijieshe.controller;

import com.aijieshe.pojo.administrator;
import com.aijieshe.pojo.json;
import com.aijieshe.pojo.user;
import com.aijieshe.service.administrator_service;
import com.aijieshe.service.user_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.SimpleFormatter;

@Controller
public class resource_controller {

    @Autowired
    private administrator_service adm_service;
    @Autowired
    private user_service use_service;
    @RequestMapping("/getresource/get/{path}")
    public String getresource_get(@PathVariable("path") String path){
        return path;
    }

    @RequestMapping("/getresource/administrator")
    @ResponseBody
    public json getresource_administrator(String id,String name,String page,String limit){

//        String s={"code":0,"msg":"","count":1000,"data":list}
        int pg=Integer.parseInt(page);
        int lim=Integer.parseInt(limit);
        pg=(pg-1)*lim;
        if(id!=null)
            id=id.trim();
        if(name!=null)
            name=name.trim();
        ArrayList<administrator> data=adm_service.getall(id,name,pg,lim);
        int count=adm_service.getcount(id,name);
        json js=new json();
        if(data.size()>0)
            js.setCode(0);
        else
            js.setCode(1);
        js.setCount(count);
        js.setData(data);
        return js;
    }
    @RequestMapping("/delresource/administrator")
    @ResponseBody
    public json delresource_administrator(String id){

//      如果操作执行成功，则返回 1；
//      否则，执行失败，返回 0.
        int code=adm_service.delbyid(id);
        json js=new json();
        if(code==1)
        {
            js.setCode(code);
            js.setMsg("删除成功");
        }
        else if(code==0)
        {
            js.setCode(code);
            js.setMsg("删除失败");
        }
        return js;
    }
    @RequestMapping("/updataresource/administrator")
    @ResponseBody
    public json updataresource_administrator(String id,String name,String starttime,String updatetime,String password,String phone,String department,String campus,String position,String state,String permission){
        System.out.println(id);
        System.out.println(name);
//      如果操作执行成功，则返回 1；
//      否则，执行失败，返回 0.
        int code=adm_service.updata(id,name,starttime,new SimpleDateFormat("yyyy-MM-dd").format(new Date()),password,phone,department,campus,position,state,permission);
        json js=new json();
        if(code==1)
        {
            js.setCode(code);
            js.setMsg("更新成功");
        }
        else if(code==0)
        {
            js.setCode(code);
            js.setMsg("更新失败");
        }
        return js;
    }
    @RequestMapping("/addresource/administrator")
    @ResponseBody
    public json addresource_administrator(String id,String name,String password,String phone,String department,String campus,String position,String permission){

//      如果操作执行成功，则返回 1；
//      否则，执行失败，返回 0.
        String starttime= new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String state="正常";
        int code=adm_service.add_adm(id,name,starttime,starttime,password,phone,department,campus,position,state,permission);
        json js=new json();
        if(code==1)
        {
            js.setCode(code);
            js.setMsg("添加成功");
        }
        else if(code==0)
        {
            js.setCode(code);
            js.setMsg("添加失败");
        }
        return js;
    }

    @RequestMapping("/update_listresource/administrator")
    @ResponseBody
    public json update_listresource_administrator(String[] arrys, String[] permissions, HttpServletRequest request){

        System.out.println(Arrays.toString(permissions));
        List<HashMap<String, String>> updateMap = new ArrayList<>();
        for (int i = 0; i <arrys.length ; i++) {
            System.out.println(arrys[i]);
            System.out.println(permissions[i]);
            HashMap<String, String> param = new HashMap<>(2);
            param.put("id", arrys[i]);
            param.put("permission", permissions[i]);
            updateMap.add(param);
        }
        System.out.println(updateMap);
//      如果操作执行成功，则返回 1；
//      否则，执行失败，返回 0.
        int code=adm_service.update_list(updateMap);
        json js=new json();
        if(code==1)
        {
            js.setCode(code);
            js.setMsg("权限修改成功");
        }
        else if(code==0)
        {
            js.setCode(code);
            js.setMsg("权限修改失败");
        }
        return js;
    }
    @RequestMapping("/delete_listresource/administrator")
    @ResponseBody
    public json delete_listresource_administrator(String[] arrys){

        List<HashMap<String, String>> deleteMap = new ArrayList<>();
        for (int i = 0; i <arrys.length ; i++) {
            HashMap<String, String> param = new HashMap<>(1);
            param.put("id", arrys[i]);
            deleteMap.add(param);
        }
        System.out.println(deleteMap);
//      如果操作执行成功，则返回 1；
//      否则，执行失败，返回 0.
        int code=adm_service.delete_list(deleteMap);
        json js=new json();
        if(code==1)
        {
            js.setCode(code);
            js.setMsg("删除成功");
        }
        else if(code==0)
        {
            js.setCode(code);
            js.setMsg("删除失败");
        }
        return js;
    }

    @RequestMapping("/update_passwordresource/administrator")
    @ResponseBody
    public json update_passwordresource_administrator(String id, String value){


//      如果操作执行成功，则返回 1；
//      否则，执行失败，返回 0.
        int code=adm_service.update_password(id,value);
        json js=new json();
        if(code==1)
        {
            js.setCode(code);
            js.setMsg("密码修改成功");
        }
        else if(code==0)
        {
            js.setCode(code);
            js.setMsg("密码修改失败");
        }
        return js;
    }

    @RequestMapping("/getresource/user")
    @ResponseBody
    public json getresource_user(String phone,String real_name,String user_name,String page,String limit){



        int pg=Integer.parseInt(page);
        int lim=Integer.parseInt(limit);
        pg=(pg-1)*lim;
        ArrayList<user> data=use_service.getall(phone,real_name,user_name,pg,lim);
        int count=use_service.getcount(phone,real_name,user_name);
        json js=new json();
        js.setCode(0);
        js.setCount(count);
        js.setData(data);
        return js;
    }

    @RequestMapping("/delresource/user")
    @ResponseBody
    public json delresource_user(String id){

//      如果操作执行成功，则返回 1；
//      否则，执行失败，返回 0.
        int code=use_service.delbyid(id);
        json js=new json();
        if(code==1)
        {
            js.setCode(code);
            js.setMsg("删除成功");
        }
        else if(code==0)
        {
            js.setCode(code);
            js.setMsg("删除失败");
        }
        return js;
    }

    @RequestMapping("/updataresource/user")
    @ResponseBody
    public json updataresource_user(String id,String real_name,String user_name,String sex,String mail,String create_time,String state,String phone,String password,String dormitorio,String instalaciones,String integral){

//      如果操作执行成功，则返回 1；
//      否则，执行失败，返回 0.
        int code=use_service.updata(id,real_name,user_name,sex,mail,create_time,state,phone,password,dormitorio,instalaciones,integral);
        json js=new json();
        if(code==1)
        {
            js.setCode(code);
            js.setMsg("更新成功");
        }
        else if(code==0)
        {
            js.setCode(code);
            js.setMsg("更新失败");
        }
        return js;
    }

    @RequestMapping("/addresource/user")
    @ResponseBody
    public json addresource_user(String id,String user_name,String real_name,String password,String phone,String mail,String instalaciones,String dormitorio,String sex){

//      如果操作执行成功，则返回 1；
//      否则，执行失败，返回 0.
        String create_time= new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String state="正常";
        String integral="0";
        int code=use_service.add_user(id, real_name, user_name, sex, mail, create_time, state, phone, password, dormitorio, instalaciones, integral);
        json js=new json();
        if(code==1)
        {
            js.setCode(code);
            js.setMsg("添加成功");
        }
        else if(code==0)
        {
            js.setCode(code);
            js.setMsg("添加失败");
        }
        return js;
    }

    @RequestMapping("/update_listresource/user")
    @ResponseBody
    public json update_listresource_user(String[] arrys, String[] states, HttpServletRequest request){


        List<HashMap<String, String>> updateMap = new ArrayList<>();
        for (int i = 0; i <arrys.length ; i++) {
            System.out.println(arrys[i]);
            System.out.println(states[i]);
            HashMap<String, String> param = new HashMap<>(2);
            param.put("id", arrys[i]);
            param.put("state", states[i]);
            updateMap.add(param);
        }
        System.out.println(updateMap);
//      如果操作执行成功，则返回 1；
//      否则，执行失败，返回 0.
        int code=use_service.update_list(updateMap);
        json js=new json();
        if(code==1)
        {
            js.setCode(code);
            js.setMsg("监视状态修改成功");
        }
        else if(code==0)
        {
            js.setCode(code);
            js.setMsg("监视状态修改失败");
        }
        return js;
    }

    @RequestMapping("/update_passwordresource/user")
    @ResponseBody
    public json update_passwordresource_user(String id, String value){




//      如果操作执行成功，则返回 1；
//      否则，执行失败，返回 0.
        int code=use_service.update_password(id,value);
        json js=new json();
        if(code==1)
        {
            js.setCode(code);
            js.setMsg("密码修改成功");
        }
        else if(code==0)
        {
            js.setCode(code);
            js.setMsg("密码修改失败");
        }
        return js;
    }

    @RequestMapping("/delete_listresource/user")
    @ResponseBody
    public json delete_listresource_user(String[] arrys){

        List<HashMap<String, String>> deleteMap = new ArrayList<>();
        for (int i = 0; i <arrys.length ; i++) {
            HashMap<String, String> param = new HashMap<>(1);
            param.put("id", arrys[i]);
            deleteMap.add(param);
        }
        System.out.println(deleteMap);
//      如果操作执行成功，则返回 1；
//      否则，执行失败，返回 0.
        int code=use_service.delete_list(deleteMap);
        json js=new json();
        if(code==1)
        {
            js.setCode(code);
            js.setMsg("删除成功");
        }
        else if(code==0)
        {
            js.setCode(code);
            js.setMsg("删除失败");
        }
        return js;
    }
}
