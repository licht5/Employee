package renshi;

/**
 * Created by tianfeihan on 2018/9/14.
 */
public class ParttimeEmploye extends Employe{
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    private int hours;

    public ParttimeEmploye(int empNum, String name, String deptCode,int hours) {
        super(empNum, name, deptCode);
        setHours(hours);
    }

    public int calculateSalary(){
        int sala;
        sala=hours*60;
        return sala;
    }

    public String getDetails(){
        String info="";
        info="\n人事编号："+getEmpNum()+"\n姓名："+getName()+"\n部门："+getDeptCode()+"\n薪资："+calculateSalary();
        return info;
    }
}
