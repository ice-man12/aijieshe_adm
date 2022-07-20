package com.aijieshe.pojo;

public class administrator {
    private String id;
    private  String name;
    private String starttime;
    private String updatetime;
    private String password;
    private  String department;
    private  String campus;
    private  String position;
    private    String state;
    private  String permission;
    private String phone;

    @Override
    public String toString() {
        return "administrator{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", starttime='" + starttime + '\'' +
                ", updatetime='" + updatetime + '\'' +
                ", password='" + password + '\'' +
                ", department='" + department + '\'' +
                ", campus='" + campus + '\'' +
                ", position='" + position + '\'' +
                ", state='" + state + '\'' +
                ", permission='" + permission + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
