package com.ixaut.Json_stu;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

public class ReadJson
{
    public static void main(String[] args) throws IOException
    {
        File file =
                new File("wangxiaoer.json");
        String content = FileUtils.readFileToString(file);
        JSONObject sobj = new JSONObject(content);

        if(!sobj.isNull("name"))
        {
            System.out.println("姓名是："+sobj.getString("name"));
        }
        if(!sobj.isNull("nickname"))
        {
            System.out.println("姓名是："+sobj.getString("nickname"));
        }
        System.out.println("年龄是："+sobj.getDouble("age"));
        System.out.println("有没有女朋友？ " + sobj.getBoolean("has_girlfriend"));
        JSONArray major = sobj.getJSONArray("major");
        for (int i = 0; i < major.length(); i++)
        {
            String m = (String)major.get(i);
            System.out.println("专业-" + (i + 1) + m);
        }
    }

}
