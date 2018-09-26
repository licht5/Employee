package juhe;

import java.util.ArrayList;

/**
 * Created by tianfeihan on 2018/9/18.
 */
public class Test1 {
    public static void main(String[] args){
        School school=new School("WHU","hubei","0276441251");
        Department software=new Department(001,"software");
        Department math=new Department(002,"math");
        Department medicine=new Department(003,"medicine");
        Department physics=new Department(004,"physics");
        school.addDept(software);
        school.addDept(math);
        school.addDept(medicine);
        school.addDept(physics);
//        ArrayList depts=school.de/
          for(int i=0;i<school.getDeptarray().size();i++){
            System.out.println(school.getDeptarray().get(i));
        }




    }




}
