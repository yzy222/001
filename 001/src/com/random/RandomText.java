package com.random;

import java.util.Random;

public class RandomText {
    public static void main(String[] args) {
        Random random=new Random();
        int i=random.nextInt(100);
        //下一个int类型数据0-99
        System.out.println(i);
    }
}
