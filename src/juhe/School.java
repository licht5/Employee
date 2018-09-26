package juhe;

import java.util.ArrayList;

/**
 * Created by tianfeihan on 2018/9/18.
 */
public class School {
    private String name;
    private String address;
    private String phone;

    public ArrayList getDeptarray() {
        return deptarray;
    }

    public void setDeptarray(ArrayList deptarray) {
        this.deptarray = deptarray;
    }

    private ArrayList deptarray;

    public School(String name, String address, String phone) {
        setAddress(address);
        setName(name);
        setPhone(phone);
        deptarray=new ArrayList<Department>(3);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public  void addDept(Department dept){
        deptarray.add(dept);
    }











}
