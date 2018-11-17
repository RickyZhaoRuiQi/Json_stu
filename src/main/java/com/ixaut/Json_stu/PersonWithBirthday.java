package com.ixaut.Json_stu;

//演示Gson特色功能，支持日期

import java.util.Arrays;
import java.util.List;

public class PersonWithBirthday
{
    private String name;
    private String school;
    private boolean has_girlfriend;
    private double age;
    private Object car;
    private Object house;
    //替换为集合类
    private List<String> major;
    private String birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public boolean isHas_girlfriend() {
        return has_girlfriend;
    }

    public void setHas_girlfriend(boolean has_girlfriend) {
        this.has_girlfriend = has_girlfriend;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Object getCar() {
        return car;
    }

    public void setCar(Object car) {
        this.car = car;
    }

    public Object getHouse() {
        return house;
    }

    public void setHouse(Object house) {
        this.house = house;
    }

    public List<String> getMajor() {
        return major;
    }

    public void setMajor(List<String> major) {
        this.major = major;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "PersonWithBirthday{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", has_girlfriend=" + has_girlfriend +
                ", age=" + age +
                ", car=" + car +
                ", house=" + house +
                ", major=" + major +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
