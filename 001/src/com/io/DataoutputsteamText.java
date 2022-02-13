package com.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataoutputsteamText {
    public static void main(String[] args) throws Exception{
        DataOutputStream dos =new DataOutputStream(new FileOutputStream("data"));
        byte b=10;
        short s=20;
        char c =97;
        int i=100;
        long l=1000;
        boolean bb=true;
        float f=  0.1f;
        double d=32.33;
        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeChar(c);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeBoolean(bb);
        dos.writeFloat(f);
        dos.writeDouble(d);

        dos.flush();
        dos.close();
        DataInputStream dis=new DataInputStream(new FileInputStream("data"));
        //读写顺序一致
        dis.readByte();
        System.out.println(dis.readShort());

        dis.close();
    }
}

