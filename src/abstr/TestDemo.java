package abstr;

/**
 * Created by tianfeihan on 2018/9/16.
 */
public class TestDemo {
    public static void main(String[] args){

        String info;
        SavingAcount sac=new SavingAcount(2017001,5000,0.05);
        CheckingAcount che=new CheckingAcount(2017002,10000,11);
        System.out.println("储蓄账户:"+sac.getAccNum()+"现有："+sac.getBalance()+"\n现在存入1000元");

        sac.deposite(1000);
        System.out.println("取出8000元：");
        info=sac.wuthdraw(8000);
        System.out.println(info);
        System.out.println("取出5000元：");
        info=sac.wuthdraw(5000);
        System.out.println(info);

        System.out.println("取出80000元：");
        info=che.wuthdraw(80000);
        System.out.println(info);
        System.out.println("取出8000元：");
        info=che.wuthdraw(8000);
        System.out.println(info);

    }
}
