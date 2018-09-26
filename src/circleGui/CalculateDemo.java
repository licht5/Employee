package circleGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tianfeihan on 2018/9/23.
 */
public class CalculateDemo extends JFrame implements ActionListener {
    Circle theCircle;
    JTextField messagetext;
    JTextArea resultext;
    JButton calbth;
    JButton closebth;

    public CalculateDemo() {
        super("计算圆形的面积和周长");

        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());
        JPanel centerPanel=new JPanel(new FlowLayout());
        messagetext=new JTextField(5);
        JLabel messageLab=new JLabel("输入圆的半径：");
        calbth =new JButton("计算");
        closebth =new JButton("关闭窗口");
        resultext=new JTextArea("计算结果：",4,20);


        centerPanel.add(messageLab);
        centerPanel.add(messagetext);
        centerPanel.add(calbth);
        centerPanel.add(closebth);

        c.add(centerPanel);
        c.add(resultext);


        calbth.addActionListener(this);
        closebth.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(360,170);



    }


    public static void main(String[] args){
        new CalculateDemo();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==calbth){
            calculate();
        }
        if(e.getSource()==closebth){
            shutdown();
        }

    }


    private void calculate(){
        String message=messagetext.getText();
        if(message.length()==0){
            JOptionPane.showMessageDialog(null,"请输入圆的半径","提示",1);
        }
        else {
            int radius=Integer.parseInt(message);
            theCircle=new Circle(radius);
            int theradius=theCircle.getRadius();
            double theGirth=theCircle.calGirth();
            double theArea=theCircle.calArea();

            resultext.setText("计算结果如下：");
            resultext.append("\n圆的半径："+theradius);
            resultext.append("\n圆的周长："+theGirth);
            resultext.append("\n圆的面积："+theArea);
        }
    }


    public void shutdown(){
        System.exit(0);
    }
}
