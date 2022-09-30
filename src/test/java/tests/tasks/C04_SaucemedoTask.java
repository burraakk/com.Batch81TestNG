package tests.tasks;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SaucedemoPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_SaucemedoTask {

    /*
    saucedemoUrl=https://www.saucedemo.com/
    saucedemoUsername=standard_user
    saucedemoPassword=secret_sauce
    */

    @Test
    public void test01() {
        //     * Navigate to  https://www.saucedemo.com/
        Driver.getDriver().get(ConfigReader.getProperty("saucedemoUrl"));

        //     * Enter the username  as standard_user
        SaucedemoPage saucedemoPage = new SaucedemoPage();
        saucedemoPage.usernameBox.sendKeys(ConfigReader.getProperty("saucedemoUsername"));
        //     * Enter the password as   secret_sauce
        saucedemoPage.passwordBox.sendKeys(ConfigReader.getProperty("saucedemoPassword"));

        //     * Click on login button
        saucedemoPage.loginButton.click();

        //     * Choose price low to high
        Select select = new Select(saucedemoPage.productPageDDM);
        select.selectByVisibleText("Price (high to low)");

        //       and verify that PRICE (LOW TO HIGH) is visible
        Assert.assertTrue(select.getFirstSelectedOption().isDisplayed(),
                "PRICE (LOW TO HIGH) is not visible");

        Driver.closeDriver();

    }
}
