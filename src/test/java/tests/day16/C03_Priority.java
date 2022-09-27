package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {
    /*
    - @Test notasyonunun yanına (priority = sayı) yazarsak testlerin çalışma sırasını belirlemiş oluruz.
    - Önce en küçük olan çalışır
    - priority olarak herhangi bir sayı yazılmamışsa 0 olarak kabul edilir.
    */

    @Test (priority = -1)
    public void youtubeTest() {
        driver.get("https://www.youtube.com");
    }

    @Test
    public void bestbuyTest() {
        driver.get("https://www.bestbuy.com");
    }

    @Test (priority = 2)
    public void amazonTest() {
        driver.get("https://www.amazon.com");
    }
}
