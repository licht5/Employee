package score;

/**
 * Created by tianfeihan on 2018/9/13.
 */
import java.util.*;
public class TestScore {
    public static void main(String[] args){
        Score score1=new Score();
        Scanner input=new Scanner(System.in);
        System.out.println("input english");
        score1.english=input.nextInt();
        System.out.println("input oop");
        score1.oop=input.nextInt();
        System.out.println("input db");
        score1.db=input.nextInt();

        score1.replaytotal();
        score1.replayavr();
        System.out.print("count:"+Score.getCount());
        Score score2=new Score();
        System.out.print("count:"+Score.getCount());



    }

}
