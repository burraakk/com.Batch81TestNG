package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelmycampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_SmokeNegatifTest {
    @Test
    public void wrongUsername() {
        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelmycampUrl"));
        //login butonuna bas
        HotelmycampPage hotelmycampPage = new HotelmycampPage();
        hotelmycampPage.loginButtonHomePage.click();

        //test data username: manager1 ,  test data password : manager1!
        hotelmycampPage.usernameBox.sendKeys(ConfigReader.getProperty("hotelmycampWrongUsername"));
        hotelmycampPage.passwordBox.sendKeys(ConfigReader.getProperty("hotelmycampPassword"));
        hotelmycampPage.loginButtonLoginPage.click();

        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hotelmycampPage.errorMessage.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void wrongPassword() {
        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelmycampUrl"));
        //login butonuna bas
        HotelmycampPage hotelmycampPage = new HotelmycampPage();
        hotelmycampPage.loginButtonHomePage.click();

        //test data username: manager1 ,  test data password : manager1!
        hotelmycampPage.usernameBox.sendKeys(ConfigReader.getProperty("hotelmycampUsername"));
        hotelmycampPage.passwordBox.sendKeys(ConfigReader.getProperty("hotelmycampWrongPassword"));
        hotelmycampPage.loginButtonLoginPage.click();

        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hotelmycampPage.errorMessage.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void wrongUsernamePassword() {
        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelmycampUrl"));
        //login butonuna bas
        HotelmycampPage hotelmycampPage = new HotelmycampPage();
        hotelmycampPage.loginButtonHomePage.click();

        //test data username: manager1 ,  test data password : manager1!
        hotelmycampPage.usernameBox.sendKeys(ConfigReader.getProperty("hotelmycampWrongUsername"));
        hotelmycampPage.passwordBox.sendKeys(ConfigReader.getProperty("hotelmycampWrongPassword"));
        hotelmycampPage.loginButtonLoginPage.click();

        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hotelmycampPage.errorMessage.isDisplayed());

        Driver.closeDriver();
    }
}
