package employee;

/**
 * Created by tianfeihan on 2018/9/13.
 */
public class Test1 {
    public static void main(String[] args){
        try {
            Circle firstcircle=new Circle(4);
            int theradius;
            double thezhuochang,thAREA;
            theradius=firstcircle.getRadius();
            thezhuochang=firstcircle.calculateCircumference();
            thAREA=firstcircle.calculateArea();
            System.out.println("radius:"+theradius+" zhouchang:"+thezhuochang+" area:"+thAREA);

        }
        catch (Exception e){
            System.out.println("error mess1:"+e);

        }
        finally {
            System.out.print("finally");
        }

//        Circle firstcircle=new Circle(4);
//        double theradius,thezhuochang,thAREA;
//        theradius=firstcircle.getRadius();
//        thezhuochang=firstcircle.calculateCircumference();
//        thAREA=firstcircle.calculateArea();
//        System.out.print("radius:"+theradius+" zhouchang:"+thezhuochang+" area:"+thAREA);

    }
}
