package gui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by tianfeihan on 2018/9/18.
 */
public class MouseE extends JFrame implements MouseListener {
    private int i=0;
    private String[] msg={"java is fun ","java is powerful"};
    private JLabel lb1=new JLabel(msg[i],JLabel.CENTER);

    public MouseE(){
        this.setTitle("鼠标处理事件");
        this.setSize(300,100);
        this.add(lb1);
        lb1.setFocusable(false);
        addMouseListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args){
            new MouseE();
    }





    @Override
    public void mouseClicked(MouseEvent e) {
        if (i==1) {
            i=0;
        }
        else {
            i=1;
        }
        lb1.setText(msg[i]);

    }

    @Override
    public void mousePressed(MouseEvent e) {
        lb1.setText("鼠标按键按下");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        lb1.setText("鼠标按键离开");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        lb1.setText("鼠标按键jinru");


    }

    @Override
    public void mouseExited(MouseEvent e) {
        lb1.setText("鼠标按键tuichu");

    }
}
