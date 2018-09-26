package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tianfeihan on 2018/9/18.
 */
public class HelloSwing extends JFrame {
    public HelloSwing(){
        super("组件显示");
        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());

        JTextField messText=new JTextField(10);
        JLabel messlable=new JLabel("Message:");
        JButton okbut=new JButton("ok");

        c.add(messlable);
        c.add(messText);
        c.add(okbut);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,100);
        this.setVisible(true);


    }
    public static void main(String[] args){
        HelloSwing myhello=new HelloSwing();

    }

}
