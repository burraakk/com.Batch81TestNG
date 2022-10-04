package tests.day21;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReusableMethod {

    @Test
    public void test01() throws IOException {
        //Hepsiburada sayfasına gidiniz
        Driver.getDriver().get("https://www.hepsiburada.com");

        //ScreenShot alınız
        ReusableMethods.getScreenshot("hepsiburada");

        //Sayfayı kapatınız
        Driver.closeDriver();
    }

    @Test
    public void test02() throws IOException {
        //Amazon sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //Nutella aratınız
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys("Nutella", Keys.ENTER);

        //Arama sonuc yazısının WebElementinin resmini alınız
        ReusableMethods.getScreenshotWebElement("searchResult",amazonPage.searchResultWE);

        //Sayfayı kapatınız
        Driver.closeDriver();
    }
}
