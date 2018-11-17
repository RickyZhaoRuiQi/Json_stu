package com.ixaut.Json_stu;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class GsonRead
{
    public static void main(String[] args) throws IOException {
        File file =
                new File("wangxiaoer.json");
        String content = FileUtils.readFileToString(file,"utf-8");
        /*Gson gson = new Gson();

        //Gson将Json数据解析成一个Java对象
        perSon wangxiaoer = gson.fromJson(content,perSon.class);
        System.out.println(wangxiaoer);*/

        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        PersonWithBirthday wangxiaoer = gson.fromJson(content,PersonWithBirthday.class);
        //System.out.println(wangxiaoer.getBirthday().toLocaleString());

        //数组和集合
        System.out.println(wangxiaoer.getMajor());
        System.out.println(wangxiaoer.getMajor().getClass());
    }
}
