package com.ixaut.Json_stu;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        //JsFunc();
        //createJsonMap();
        //createJsonByBean();
    }

    private static void JsFunc()
    {
        JSONObject wangxiaoer = new JSONObject();
        Object nullObj = null;
        try
        {
            wangxiaoer.put("name","王小二");
            wangxiaoer.put("age",28.2);
            wangxiaoer.put("birthday","1990-01-01");
            wangxiaoer.put("school","蓝翔");
            wangxiaoer.put("major",new String[]{"理发","挖掘机"});
            wangxiaoer.put("has_girlfriend",false);
            wangxiaoer.put("car",nullObj);
            wangxiaoer.put("house",nullObj);
            System.out.println(wangxiaoer.toString());
        }
        catch(JSONException e)
        {
            e.printStackTrace();
        }
    }

    //通过hashMap构建JSON
    private static void createJsonMap()
    {
        Map<String,Object> wangxiaoer = new HashMap<String,Object>();
        Object nullObj = null;
        wangxiaoer.put("name","王小二");
        wangxiaoer.put("age",28.2);
        wangxiaoer.put("birthday","1990-01-01");
        wangxiaoer.put("school","蓝翔");
        wangxiaoer.put("major",new String[]{"理发","挖掘机"});
        wangxiaoer.put("has_girlfriend",false);
        wangxiaoer.put("car",nullObj);
        wangxiaoer.put("house",nullObj);

        System.out.println(new JSONObject(wangxiaoer).toString());
    }

    //通过JavaBean创建JSON
    private static void  createJsonByBean()
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
        System.out.println(new JSONObject(wangxiaoer));
    }
}
