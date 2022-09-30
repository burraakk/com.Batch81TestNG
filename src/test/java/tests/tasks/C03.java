package tests.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;

public class C03 {
    @Test
    public void test01() {
        SoftAssert softAssert = new SoftAssert();

        //https://www.amazon.com/ adresine gidin.
        Driver.getDriver().get("https://www.amazon.com/");

        //Test : Amazon ana sayfaya gittiginizi test edin
        String actualAmazonUrl = Driver.getDriver().getCurrentUrl();
        String expectedAmazonUrl = "https://www.amazon.com/";
        softAssert.assertEquals(expectedAmazonUrl, actualAmazonUrl);

        //Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin
        //arama yapin ve aramanizin gerceklestigini Test edin
        WebElement searchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Nutella", Keys.ENTER);
        WebElement resultText = Driver.getDriver().findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(resultText.isDisplayed());

        //Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin
        //$16.83 oldugunu test edin
        Driver.getDriver().findElement(By.xpath("(//*[@class='s-image'])[1]")).click();

        softAssert.assertAll();

        Driver.closeDriver();
    }
}
