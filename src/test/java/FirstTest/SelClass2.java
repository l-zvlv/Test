package FirstTest;

import PageObject.UnitPage;
import SelenTest.SelClass;
import org.testng.annotations.Test;

public class SelClass2 extends SelClass {
    @Test
    public void metod () {
        getDriver().get("https://www.google.ru/");
        getDriver().manage().window().maximize();
        UnitPage in = new UnitPage(getDriver());

        in.setSearchText("Привет");
        in.clickSubmitSearch();

    }
}
