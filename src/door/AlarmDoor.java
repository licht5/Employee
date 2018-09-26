package door;

/**
 * Created by tianfeihan on 2018/9/17.
 */
public class AlarmDoor extends Door implements Alarm {
    public AlarmDoor(int length, int width) {
        super(length, width);
    }

    @Override
    public void alarm() {
        System.out.println("报警");
    }

    @Override
    void open() {
        System.out.println("开门");

    }

    @Override
    void close() {
        System.out.println("关门");
    }
}
