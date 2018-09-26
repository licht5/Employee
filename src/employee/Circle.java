package employee;

/**
 * Created by tianfeihan on 2018/9/12.
 */
public class Circle {
    private int radius;
    private static double pi=3.1415;

    public int getRadius() {
        return radius;
    }

    public Circle(int theradius){
        setRadius(theradius);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double calculateCircumference() throws Exception{
        if(radius==0||radius<0){
            Exception e=new Exception("radius <=0");
            throw e;
        }
        else {
            return 2 * pi * radius;
        }
    }

    public double calculateArea() throws Exception{
        double theArea=0;
        if(radius==0||radius<0){
            Exception e=new Exception("radius <=0");
            throw e;
        }
        else {
            theArea=pi*radius*radius;
            return theArea;
        }

    }


}
