package shape;

/**
 * Created by tianfeihan on 2018/9/16.
 */
public class TestP {
    public void MyDraw(Shape s){
        s.draw();
    }
    public static void main(String[] args){
        TestP tp=new TestP();
        tp.MyDraw(new Square());
        tp.MyDraw(new Triangle());
        tp.MyDraw(new Circle());
    }
}
