package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tianfeihan on 2018/9/18.
 */
public class SwingLayout extends JFrame {
    public SwingLayout() {
        super("布局显示");
        Container c=this.getContentPane();
        c.setLayout(new GridLayout(2,1));

        JPanel upperPanel=new JPanel(new FlowLayout());
        JPanel lowerPanel=new JPanel(new FlowLayout());

        JLabel mess=new JLabel("输入数据");
        JTextField messinput=new JTextField(10);
        JButton again=new JButton("重新输入");
        JButton close_bt=new JButton("关闭窗口");

        upperPanel.add(mess);
        upperPanel.add(messinput);

        lowerPanel.add(again);
        lowerPanel.add(close_bt);

        c.add(upperPanel);
        c.add(lowerPanel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300,100);

        this.setVisible(true);
    }
    public static void main(String[] args){
        SwingLayout sl=new SwingLayout();

    }
}
