package filestore;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by tianfeihan on 2018/9/24.
 */
public class TestRandomIO {
    public static void main(String[] args){
        Student student1=new Student("宋荣第","2010004");
        Student student2=new Student("陈姣","2010006");
        Student student3=new Student("田斐菡","2010003");

        RandomAccessFile randomW=null;
        RandomAccessFile randomR=null;

        try {
            randomW=new RandomAccessFile("student.txt","rw");
            randomW.write(student1.getName().getBytes());
            randomW.write(student1.getStudentID().getBytes());
            randomW.write(student2.getName().getBytes());
            randomW.write(student2.getStudentID().getBytes());
            randomW.write(student3.getName().getBytes());
            randomW.write(student3.getStudentID().getBytes());
            randomW.close();

            int len=0;
            String str=null;

            byte[] buff=new byte[16];
            randomR=new RandomAccessFile("student.txt","r");

            randomR.skipBytes(16);
            System.out.println("指针位置："+randomR.getFilePointer());
            len=randomR.read(buff);
            str=new String(buff,0,len);
            System.out.println("第二个记录："+str);

            randomR.seek(0);
            System.out.println("指针位置："+randomR.getFilePointer());
            len=randomR.read(buff);
            str=new String(buff,0,len);
            System.out.println("第一个记录："+str);

            randomR.seek(28);
            System.out.println("指针位置："+randomR.getFilePointer());
            len=randomR.read(buff);
            str=new String(buff,0,len);
            System.out.println("第三个记录："+str);

            randomR.close();





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
