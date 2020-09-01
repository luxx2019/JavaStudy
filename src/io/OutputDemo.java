/**
 * File file = new File("E:\\IdeaProjects\\AboutJava\\src\\NewFile", "word.txt");
 * 执行上一句语句的时候，并不会创建文件
 * 而是在创建FileOutStream的时候，创建文件
 */
package io;

import java.io.File;
import java.io.FileOutputStream;

public class OutputDemo {
    public static void main(String[] args) {
        //File file = new File("E:\\新建文件夹 (2)\\新建文件夹\\word.txt");
        File file = new File("E:\\IdeaProjects\\AboutJava\\src\\NewFile", "word.txt");
        try {
            byte[] b = "高堂明镜悲白发，朝如青丝暮成雪".getBytes();
            FileOutputStream out = new FileOutputStream(file);
            out.write(b);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}