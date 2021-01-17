import dao.UserDao;
import dao.UserDaoMysqlImpl;
import service.UserService;
import service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args){
        //用户实际调用的是业务层，dao层他们不需要接触！
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoMysqlImpl());
        userService.getUser();
    }
}
