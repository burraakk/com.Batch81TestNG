package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C01_BeforeMethodAfterMethod extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void amazonTest() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void bestbuyTest() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void techproTest() {
        driver.get("https://www.techproeducation.com");
    }
}
