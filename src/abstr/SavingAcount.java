package abstr;

/**
 * Created by tianfeihan on 2018/9/16.
 */
public class SavingAcount extends BankAcount{
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    private double rate=0;


    public SavingAcount(long accNum, double balance,double rate) {
        super(accNum, balance);
        setRate(rate);
    }

//    @Override
    public String wuthdraw(double money) {
        double interst;
        String info;
        interst=money*rate;
        if ((balance+interst)<money){
            info="账号透支，你的账户中余额是："+balance;
        }
        else {
            info="取出余额："+money+"剩余的金额（含有利息）："+(balance+interst-money);
        }
        return info;
    }
}
