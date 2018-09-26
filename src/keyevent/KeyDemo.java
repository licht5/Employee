package keyevent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by tianfeihan on 2018/9/23.
 */
public class KeyDemo  extends JFrame implements KeyListener{
    JLabel lab=new JLabel();

    public KeyDemo(){
        add(lab);
        lab.setHorizontalAlignment(SwingConstants.CENTER);
        lab.setFont(new Font("Serif",Font.ITALIC,25));
        lab.setForeground(Color.RED);
        this.setTitle("键盘处理事件");
        this.setSize(500,250);

        this.setLocationRelativeTo(this);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(this);

    }
    public static void main(String[] args){
        new KeyDemo();
    }



    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        lab.setText("键盘字符为"+e.getKeyChar()+"  事件：key down");

    }

    @Override
    public void keyReleased(KeyEvent e) {
        lab.setText("键盘字符为"+e.getKeyChar()+"  事件：key up");
    }
}
