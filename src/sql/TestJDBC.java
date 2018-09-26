package sql;

import java.sql.*;

/**
 * Created by tianfeihan on 2018/9/26.
 */
public class TestJDBC {
    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/RUNOOB?characterEncoding=utf8&useSSL=true";
        Connection conn=null;
        Statement stmt=null;
        String dept;
        String name;

        String sqlx="select sname,sdept from STUDENT";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection(url,"root","0801");
            stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sqlx);
            while (rs.next()){
                name=rs.getString("sname");
                dept=rs.getString("sdept");
                System.out.println("sname:"+name+" sdept: "+dept);

            }
            rs.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (stmt!=null) stmt.close();
                if(conn!=null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
