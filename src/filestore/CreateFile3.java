package filestore;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by tianfeihan on 2018/9/23.
 */
public class CreateFile3 {
    public static void main(String[] args){
        char[] message="武汉大学国家网络安全".toCharArray();
        try {
            File myfile=new File("testing.txt");

            FileWriter writer=new FileWriter(myfile);
            writer.write(message);
            writer.close();
            System.out.println("文件写成功！"+message);


            FileReader reader=new FileReader(myfile);
            char[] text=new char[10];
            reader.read(text);
            String text1=new String(text);
            System.out.println(text1);
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
