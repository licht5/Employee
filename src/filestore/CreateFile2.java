package filestore;

import java.io.*;

/**
 * Created by tianfeihan on 2018/9/23.
 */
public class CreateFile2 {


    public static void main(String[] args){
        byte[] message=new byte[14];
        try {
            File myfile=new File("hello.txt");
            FileInputStream in=new FileInputStream(myfile);
            in.read(message);
            String text=new String(message);
            System.out.println(text);
            in.close();


        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
