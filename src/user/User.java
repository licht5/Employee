package user;

/**
 * Created by tianfeihan on 2018/9/26.
 */
public class User {
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String userID;
    private String name;
    private String password;

    public User(String userID, String name, String password) {
        setName(name);
        setPassword(password);
        setUserID(userID);
    }
}
