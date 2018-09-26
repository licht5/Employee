package circleGui;

/**
 * Created by tianfeihan on 2018/9/23.
 */
public class Circle {
    public Circle(int radius) {
        setRadius(radius);
    }

    public int getRadius() {
        return radius;
    }



    public void setRadius(int radius) {
        this.radius = radius;
    }

    private int radius;
    private double PI=3.1415;

    public double calGirth(){
        return 2*PI*radius;
    }

    public double calArea(){
        return radius*PI*radius;
    }



}
