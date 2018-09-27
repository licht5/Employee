package user;

import com.sun.tools.internal.xjc.Driver;
import org.omg.CosNaming.NamingContextPackage.NotFound;

import java.sql.*;

/**
 * Created by tianfeihan on 2018/9/26.
 */
public class UserDA {
    static User aUser;
    static String url="jdbc:mysql://localhost:3306/RUNOOB?characterEncoding=utf8&useSSL=true";
    static Connection aConnection;
    static Statement aStatement;
    static  String userID;
    static String name;
    static String password;

    public static Connection initialize(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            aConnection= DriverManager.getConnection(url,"root","0801");
            aStatement=aConnection.createStatement();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return aConnection;
    }

    public static void terminate(){
        try {
            aStatement.close();
            aConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static User find(String key) throws NotFoundException{
        aUser=null;
        String sql="SELECT userID,name,password FROM userT WHERE userID="+"'"+key+"'";
        try {
            ResultSet rs=aStatement.executeQuery(sql);
            boolean gotit=rs.next();
            if (gotit){
                userID=rs.getString(1);
                name=rs.getString(2);
                password=rs.getString(3);
                aUser=new User(userID,name,password);
            }
            else {
                throw (new NotFoundException("not found the list"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return aUser;
    }

    public static void add(User aUser) throws DuplicateException{
        name=aUser.getName();
        userID=aUser.getUserID();
        password=aUser.getPassword();
        String sql="INSERT INTO userT(userID,name,password) VALUES ('"+userID+"','"+name+"','"+password+"')";
//        System.out.println(sql);
        try {
            User c=find(userID);
            throw (new DuplicateException("the user haven exists"));
            } catch (NotFoundException e1) {
            try {
                int result=aStatement.executeUpdate(sql);
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
    }
    public static void delete(User aUser){
        userID=aUser.getUserID();
        String sql="DELETE FROM userT WHERE userID='"+userID+"'";
        try {
            int result=aStatement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }






}
