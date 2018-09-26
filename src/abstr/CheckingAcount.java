package abstr;

/**
 * Created by tianfeihan on 2018/9/16.
 */
public class CheckingAcount extends BankAcount {
    public int getNumCheckWritten() {
        return numCheckWritten;
    }

    public void setNumCheckWritten(int numCheckWritten) {
        this.numCheckWritten = numCheckWritten;
    }

    private int numCheckWritten=0;



    public CheckingAcount(long accNum, double balance,int numCheckWritten) {
        super(accNum, balance);
        setNumCheckWritten(numCheckWritten);
    }

    @Override
    public String wuthdraw(double money) {
        String info;
        numCheckWritten=numCheckWritten+1;
        if(numCheckWritten>10){
            money=money+1;
        }
        if(balance<money){
            info="支票账号透支！";
        }
        else {
            balance=balance-money;
            info="支出成功！";
        }
        return info;
    }
}
