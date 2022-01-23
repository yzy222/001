package com.colletion.list.danlink;

public class Text {
    public static void main(String[] args) {
        DanLink link=new DanLink();
        link.add("hello");
        link.add("hello");
        link.add("hello");
        System.out.println(link.getSize());
    }
}
