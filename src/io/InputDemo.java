package io;

import java.io.File;
import java.io.FileInputStream;

public class InputDemo {
    public static void main(String[] args) {
        File file = new File("E:\\IdeaProjects\\AboutJava\\src\\NewFile", "MountainGhost.txt");
        try {
            byte[] b = new byte[1000];
            FileInputStream in = new FileInputStream(file);
            int len = in.read(b, 0, 1000);

            System.out.println("山鬼全文" + len + "个字：");
            System.out.println(new String(b));

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
