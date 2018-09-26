package jiekou;

/**
 * Created by tianfeihan on 2018/9/17.
 */
public class TestJiekou {
    public static void main(String[] args){
        Rectangle rec=new Rectangle(5,3);
        System.out.println(rec.getLength());
        System.out.println(rec.getWidth());

        System.out.println(rec.calArea());

        System.out.println(rec.calGirth());

    }
}
