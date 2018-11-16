package com.ixaut.Json_stu;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonStu
{
    public static void main(String[] args)
    {
        perSon wangxiaoer = new perSon();
        wangxiaoer.setName("王小二");
        wangxiaoer.setAge(28.2);
        wangxiaoer.setBirthday("1990-01-01");
        wangxiaoer.setSchool("蓝翔");
        wangxiaoer.setMajor(new String[]{"理发","挖掘机"});
        wangxiaoer.setHas_girlfriend(false);
        wangxiaoer.setCar(null);
        wangxiaoer.setHouse(null);

        //Gson gson = new Gson();
        //System.out.println(gson.toJson(wangxiaoer));

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        System.out.println(gson.toJson(wangxiaoer));

    }

}
