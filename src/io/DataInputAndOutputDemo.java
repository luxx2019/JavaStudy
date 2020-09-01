package io;

import java.io.*;

public class DataInputAndOutputDemo {
    public static void main(String[] args) {
        try{
            File file = new File("E:\\IdeaProjects\\AboutJava\\src\\NewFile", "word.txt");
            FileOutputStream fs = new FileOutputStream(file);
            DataOutputStream dos = new DataOutputStream(fs);
            //dos.writeBytes("asdf水果和三点六龟afafa");   //将字符串中每一个字符的低字节内容写入目标设备中。写入中文时会乱码
            //dos.writeChars("asdf水果和三点六龟afafa");  //将每一个字符的两个字节的内容都写入到目标设备中，写入中文时依然会乱码
            dos.writeUTF("asdf水果afafa");    //先发送字符串utf编码后的字节长度，然后发送每一个字节的utf编码。中英文均不会乱码，但是开头会多出一个特殊字符
            FileInputStream in = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(in);
            System.out.println(dis.readUTF());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
