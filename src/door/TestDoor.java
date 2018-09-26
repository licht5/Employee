package door;

/**
 * Created by tianfeihan on 2018/9/17.
 */
public class TestDoor {
    public static void main(String[] args){
        AlarmDoor alarmDoor=new AlarmDoor(3,2);
        System.out.println("door length:"+alarmDoor.getLength());
        System.out.println("door width:"+alarmDoor.getWidth());

        alarmDoor.open();
        alarmDoor.alarm();
        alarmDoor.close();


    }
}
