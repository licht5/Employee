package user;

/**
 * Created by tianfeihan on 2018/9/26.
 */
public class TesterUserDA {
    public static void main(String[] args){
        User firstUser=new User("003","songrongdi","0923");
        User secondUser=new User("004","chenjiao","07567");
        UserDA.initialize();
        try {
            UserDA.add(firstUser);
            UserDA.add(secondUser);
            System.out.println("加了两个用户");
        } catch (DuplicateException e) {
            e.printStackTrace();
        }

        try {
            UserDA.delete(secondUser);
            secondUser=UserDA.find("004");
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        try {
            firstUser=UserDA.find("003");
            System.out.println("查询"+firstUser.getName());
        } catch (NotFoundException e) {
            e.printStackTrace();
        }


    }
}
