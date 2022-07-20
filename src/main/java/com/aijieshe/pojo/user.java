package com.aijieshe.pojo;

import java.util.Date;

public class user {
    private String id;
    private String real_name;
    private String user_name;
    private String sex;
    private  String mail;
    private String create_time;
    private String state;
    private String phone;
    private  String password;
    private  String dormitorio;
    private  String instalaciones;
    private String integral;

    @Override
    public String toString() {
        return "user{" +
                "id='" + id + '\'' +
                ", real_name='" + real_name + '\'' +
                ", user_name='" + user_name + '\'' +
                ", sex='" + sex + '\'' +
                ", mail='" + mail + '\'' +
                ", create_time='" + create_time + '\'' +
                ", state='" + state + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", dormitorio='" + dormitorio + '\'' +
                ", instalaciones='" + instalaciones + '\'' +
                ", integral='" + integral + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDormitorio() {
        return dormitorio;
    }

    public void setDormitorio(String dormitorio) {
        this.dormitorio = dormitorio;
    }

    public String getInstalaciones() {
        return instalaciones;
    }

    public void setInstalaciones(String instalaciones) {
        this.instalaciones = instalaciones;
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
    }
}
