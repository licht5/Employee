package jiekou;

/**
 * Created by tianfeihan on 2018/9/17.
 */
public class Rectangle implements Shape {
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    private int width;


    public Rectangle(int length,int width){
        setLength(length);
        setWidth(width);
    }
    @Override
    public int calArea() {
        return length*width;
    }

    @Override
    public int calGirth() {
        return 2*(width+length);
    }
}
