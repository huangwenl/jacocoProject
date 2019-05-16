import org.junit.Assert;
import org.junit.Test;
import com.Hello;

import java.util.ArrayList;


public class HelloTest {

    @Test
    public void testMethod1() {
        Hello hw = new Hello();
        String ss = hw.testMethod1();
        Assert.assertNotNull(ss);
    }

    @Test
    public void testMethod2() {
        Hello hw = new Hello();
        int ss = hw.addMethod(1, 1);
        Assert.assertEquals(ss, 2);
    }

    @Test
    public void testMethod2_1() {
        Hello hw = new Hello(2);
        ArrayList l = new ArrayList();
        l.add(hw);
        System.out.print(l);
        int ret = hw.addMethod(10, 9);
        Assert.assertEquals(ret, 5);
    }
}