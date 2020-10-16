package FirstTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
    @BeforeTest
        public void metod1(){
        System.out.println("До теста");

    }
    @AfterTest
    public void metod2() {
        System.out.println("После теста");

    }
    @BeforeMethod
    public void metod3() {
        System.out.println("До метода");

    }
     @AfterMethod
    public void metod4() {
         System.out.println("После метода");

    }
}
