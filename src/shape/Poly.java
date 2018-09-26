package shape;

import sun.security.provider.SHA;

import java.util.Random;

/**
 * Created by tianfeihan on 2018/9/16.
 */
public class Poly {
    Random rand=new Random();
    public Shape createshape(){
        int c=rand.nextInt(3);
        System.out.println("随机数："+c);
        Shape s=null;
        switch (c){
            case 0:s=new Square();break;
            case 1:s=new Circle();break;
            case 2:s=new Triangle();break;
        }
        return s;
    }
}
