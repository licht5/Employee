package sql;
import java.sql.*;


/**
 * Created by tianfeihan on 2018/9/25.
 */
public class Student {
    public  static final String url="jdbc:mysql://localhost:3306/RUNOOB?characterEncoding=utf8&useSSL=true";
    public  static final String name="com.mysql.jdbc.Driver";
    public  static final String user="root";
    public  static final String password="0801";
    static Connection conn=null;
    static Statement st=null;
    static ResultSet rs=null;
    public static void main(String[] args) throws  ClassNotFoundException{
        try {
            Class.forName(name);
            conn=DriverManager.getConnection(url,user,password);
            if (!conn.isClosed()){
                System.out.println("连接成功");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
