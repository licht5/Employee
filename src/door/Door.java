package door;

/**
 * Created by tianfeihan on 2018/9/17.
 */
abstract class Door {
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

    private int length;
    private int width;

    public Door(int length,int width){
        setLength(length);
        setWidth(width);
    }

    abstract void open();
    abstract  void close();

}
