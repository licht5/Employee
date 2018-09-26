package juhe;

/**
 * Created by tianfeihan on 2018/9/18.
 */
public class Department {
    private int deptCode;

    public Department(int deptCode, String deptName) {
        this.deptCode = deptCode;
        this.deptName = deptName;
    }

    public int getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(int deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    private String deptName;






}
