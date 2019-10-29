package net.sdh.tech.IOTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {
    public static void main(String[] args) throws IOException {
        inTest();

    }

    //输出流（内存到硬盘）
    public static void outTest() throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        fos.write(97);
        fos.close();
    }

    //输入流（硬盘到内存）
    public static void inTest() throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=fis.read(bytes)) != -1) {
            System.out.print(new String(bytes,0,len));
        }
        fis.close();
    }
}
