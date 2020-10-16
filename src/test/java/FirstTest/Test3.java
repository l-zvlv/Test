package FirstTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test3 {
    @DataProvider(name = "SetEnvironment", parallel = true)
    public Object[][] getData() {
        Object[][] browserProperty = new Object[][]{
                {"chrome", "70.0"},
                {"chrome", "71.0"}
        };

        return browserProperty;
    }
    @Test(dataProvider = "SetEnvironment")
    public void metod2(String n,String b){
        System.out.println(n);
        System.out.println(b);

    }
}
