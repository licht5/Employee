package printer;

/**
 * Created by tianfeihan on 2018/9/17.
 */
public class TestPri {
    public static void main(String[] args){
        Office office=new Office();
        office.setPri(new BlackPrinter());
        office.print("black");

        office.setPri(new ColorPrinter());
        office.print("color");

    }
}
