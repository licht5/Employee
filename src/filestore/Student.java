package filestore;

/**
 * Created by tianfeihan on 2018/9/24.
 */
public class Student {
    public Student(String name, String studentID) {
        setName(name);
        setStudentID(studentID);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    private String name;
    private String studentID;

}
