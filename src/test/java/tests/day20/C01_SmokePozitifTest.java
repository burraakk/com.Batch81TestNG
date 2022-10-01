package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelmycampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_SmokePozitifTest {
    @Test
    public void positiveLoginTest() {
        // https://www.hotelmycamp.com/ adresine git  login butonuna bas
        Driver.getDriver().get(ConfigReader.getProperty("hotelmycampUrl"));
        HotelmycampPage hotelmycampPage = new HotelmycampPage();
        hotelmycampPage.loginButtonHomePage.click();

        //test data username: manager
        //test data password : Manager1!
        hotelmycampPage.usernameBox.sendKeys(ConfigReader.getProperty("hotelmycampUsername"));
        hotelmycampPage.passwordBox.sendKeys(ConfigReader.getProperty("hotelmycampPassword"));
        hotelmycampPage.loginButtonLoginPage.click();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelmycampPage.usernameInTheUpperRightCorner.isDisplayed(), "Login failed!");

        Driver.closeDriver();
    }
}
