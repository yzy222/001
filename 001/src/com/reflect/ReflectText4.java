package com.reflect;

import java.lang.reflect.Field;

public class ReflectText4 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class uerssClass=Class.forName("com.reflect.Uerss");
        //获取类所有public的属性
        Field[] fields =uerssClass.getFields();
        System.out.println(fields.length);
        Field field=fields [0];
        System.out.println(field.getName());

    }
}
