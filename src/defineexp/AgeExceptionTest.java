package defineexp;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
/**
 * Created by tianfeihan on 2018/9/15.
 */
public class AgeExceptionTest {
    public static void main(String[] args){
        try {
            String agestring=JOptionPane.showInputDialog("enter your age:");
            if(Integer.parseInt(agestring)<0){
                throw new MyException("please input a positive age!");
            }
            else {
                JOptionPane.showMessageDialog(null,agestring,"AGE",1);
                System.out.println("you entered age:"+agestring);
            }

        } catch (MyException e) {
            System.out.println(e);
        }

    }

}
