package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputstreamText {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            fos = new FileOutputStream("myfile");
            byte[] bytes={97,98,99,100};
            fos.write(bytes);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
