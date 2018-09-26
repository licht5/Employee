package renshi;

/**
 * Created by tianfeihan on 2018/9/14.
 */
public class Employe {
    private int empNum;
    private String name;

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    private String deptCode;

    public Employe(int empNum,String name,String deptCode){
        setDeptCode(deptCode);
        setEmpNum(empNum);
        setName(name);
    }

    public String getBaseDetails(){
        String info="";
        info="\n人事编号："+getEmpNum()+"\n姓名："+getName()+"\n部门："+getDeptCode();
        return info;
    }
}
