package FirstTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {
    @Parameters({"iDoNotKnow", "iKnow"})
    @Test
    public void metod(String n,String m){
        System.out.println(n);
        System.out.println(m);

    }
}
