package FirstTest;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Class2 extends BaseClass {
    int a = 5;
    @Test
    public void metodd () {
        Assertion b = new Assertion();
        boolean result = a>1;
        b.assertTrue(result);
        System.out.println(result);

    }
}
