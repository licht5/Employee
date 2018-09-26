package renshi;

/**
 * Created by tianfeihan on 2018/9/14.
 */
public class Test6 {
    public static void main(String[] args){
        Employe myemp1=new Employe(201739,"田斐菡","WA");
        String theinfo;
        theinfo=myemp1.getBaseDetails();
        System.out.println(theinfo);

        FulltimeEmploye myemp2=new FulltimeEmploye(201740,"张霞三","WA",3000,4);
        String fullinfo;
        fullinfo=myemp2.getBaseDetails();
        System.out.println(fullinfo);

        ParttimeEmploye myemp3=new ParttimeEmploye(201741,"张海洋","SE",30);
        String partinfo;
        partinfo=myemp3.getDetails();
        System.out.println(partinfo);

    }



}
