package abstr;

/**
 * Created by tianfeihan on 2018/9/16.
 */
public abstract class BankAcount {
    public long getAccNum() {
        return accNum;
    }

    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    protected long accNum;
    protected double balance;
    public BankAcount(long accNum,double balance){
        this.accNum=accNum;
        this.balance=balance;
    }

    public void deposite(double money){
        balance=balance+money;
        System.out.println("成功存入："+money+"元    现在的余额为："+balance+"元");
    }

    public abstract String wuthdraw(double money);
}
