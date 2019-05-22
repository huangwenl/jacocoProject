import com.User;
import com.test.AppLoginInfoImp;
import org.junit.Test;

public class AppLoginInfoImpTest {

    @Test
    public void testgetNum(){
        AppLoginInfoImp app = new AppLoginInfoImp();
        app.getNum(50);
    }

    @Test
    public void testgetUserInfo(){
        AppLoginInfoImp app = new AppLoginInfoImp();
        User user = new User("hwl",26,170.21f,"女");
        app.getUserInfo(user);
    }


}
