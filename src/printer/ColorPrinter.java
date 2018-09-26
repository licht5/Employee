package printer;

/**
 * Created by tianfeihan on 2018/9/17.
 */
public class ColorPrinter implements PrinterInterface{
    @Override
    public void print(String contont) {
        System.out.println("彩色打印：");
        System.out.println(contont);

    }
}
