package renshi;

/**
 * Created by tianfeihan on 2018/9/14.
 */
public class FulltimeEmploye extends Employe{
    private double basesala;

    public double getBasesala() {
        return basesala;
    }

    public void setBasesala(double basesala) {
        this.basesala = basesala;
    }

    public int getWorkage() {
        return workage;
    }

    public void setWorkage(int workage) {
        this.workage = workage;
    }

    private int workage;

    public FulltimeEmploye(int empNum, String name, String deptCode,double basesala,int workage) {
        super(empNum, name, deptCode);
        setBasesala(basesala);
        setWorkage(workage);
    }

    public double calculateSalary(){
        double sala;
        sala=basesala+500*(workage-1);
        return sala;
    }

//    public String getDetails(){
//        String info="";
//        info="\n人事编号："+getEmpNum()+"\n姓名："+getName()+"\n部门："+getDeptCode()+"\n薪资："+calculateSalary()
//        +"\n工龄："+getWorkage();
//        return info;
//    }

    public String getBaseDetails(){
        String info="";
        info=super.getBaseDetails()+"\n薪资："+calculateSalary()
        +"\n工龄："+getWorkage();
        return info;
    }


}
