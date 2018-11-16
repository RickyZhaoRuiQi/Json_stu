package com.ixaut.Json_stu;

import com.google.gson.annotations.SerializedName;

public class perSon
{
    @SerializedName("NAME") //GSON 转换为json时，转换为大写
    private String name;
    @SerializedName("SCHOOL")
    private String school;
    private boolean has_girlfriend;
    private double age;
    private Object car;
    private Object house;
    private String[] major;
    private String birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setHas_girlfriend(boolean has_girlfriend) {
        this.has_girlfriend = has_girlfriend;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setCar(Object car) {
        this.car = car;
    }

    public void setHouse(Object house) {
        this.house = house;
    }

    public void setMajor(String[] major) {
        this.major = major;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public boolean isHas_girlfriend() {
        return has_girlfriend;
    }

    public double getAge() {
        return age;
    }

    public Object getCar() {
        return car;
    }

    public Object getHouse() {
        return house;
    }

    public String[] getMajor() {
        return major;
    }

    public String getBirthday() {
        return birthday;
    }
}
