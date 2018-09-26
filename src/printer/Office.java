package printer;

/**
 * Created by tianfeihan on 2018/9/17.
 */
public class Office {
    public void setPri(PrinterInterface pri) {
        this.pri = pri;
    }

    private  PrinterInterface pri;

    public void print(String details){
        pri.print(details);
    }
}
