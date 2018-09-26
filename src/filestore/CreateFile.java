package filestore;

import java.io.File;
import java.io.IOException;

/**
 * Created by tianfeihan on 2018/9/23.
 */
public class CreateFile {
    public static void main(String[] args){
        try{
            File file=new File("myfile.txt");
            if(file.createNewFile())
                System.out.println("successfully");
            else
                System.out.println("file already exists");

            System.out.println("文件或目录是否存在？"+file.exists()+"\n是目录？"+file.isDirectory()+"\n是文件？"+file.isFile()
            +"\n文件路径"+file.getAbsolutePath());


        }
        catch (IOException e){
            e.printStackTrace();

        }

    }

}
