package filestore;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by tianfeihan on 2018/9/23.
 */
public class CreateFile1 {
    public static void main(String[] args){
        byte[] message="welcome".getBytes();
        try {
            FileOutputStream out=new FileOutputStream("hello.txt");
            out.write(message);
            System.out.println("文件写成功");
            out.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
