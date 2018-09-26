package score;

/**
 * Created by tianfeihan on 2018/9/13.
 */
public class Score {


    public int getEnglish() {
        return english;
    }

    public int getOop() {
        return oop;
    }

    public int getDb() {
        return db;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setOop(int oop) {
        this.oop = oop;
    }

    public void setDb(int db) {
        this.db = db;
    }

    int english;
    int oop;
    int db;
    private static int count=0;
    public Score(){
        count=count+1;
    }
    public static int getCount(){
        return count;
    }

    public double caltotal(){
        double total=english+oop+db;
        return total;
    }

    public void replaytotal(){
        System.out.println("total is:"+caltotal());
    }
    public float calavr(){
        float avr=(english+oop+db)/3;
        return avr;
    }

    public void replayavr(){
        System.out.println("total is:"+calavr());
    }



}
