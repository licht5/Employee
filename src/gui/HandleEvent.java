package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tianfeihan on 2018/9/18.
 */
public class HandleEvent extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==clearButton){
            clearText();
        }
        if(e.getSource()==closeButton){
            shutdown();
        }

    }
    private void clearText(){
        messageText.setText("");
    }
    private void shutdown(){
        System.exit(0);
    }

    JTextField messageText;
    JButton clearButton,closeButton;
    JLabel messagelabel;

    public HandleEvent(){
        Container c=this.getContentPane();
        c.setLayout(new GridLayout(2,1));

        JPanel upperPanel=new JPanel(new FlowLayout());
        JPanel lowerPanel=new JPanel(new FlowLayout());
        messagelabel=new JLabel("输入数据");
        messageText=new JTextField(10);
        upperPanel.add(messagelabel);
        upperPanel.add(messageText);
        c.add(upperPanel);

        clearButton=new JButton("清除数据");
        closeButton=new JButton("关闭窗口");
        lowerPanel.add(clearButton);
        lowerPanel.add(closeButton);
        c.add(lowerPanel);

        clearButton.addActionListener(this);
        closeButton.addActionListener(this);

        this.setSize(300,140);
        this.setTitle("事件处理例子");
        this.setVisible(true);




    }

    public static void main(String[] args){
        new HandleEvent();
    }


}
