package tests.day22;

import org.testng.annotations.Test;
import pages.BluerentalcarsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {
    @Test
    public void test01() {
        //    -https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("bluerentalcarsUrl"));

        //    -login butonuna bas
        BluerentalcarsPage bluerentalcarsPage = new BluerentalcarsPage();
        bluerentalcarsPage.loginButtonHomePage.click();

        //    -test data user email: customer@bluerentalcars.com
        bluerentalcarsPage.emailBox.sendKeys(ConfigReader.getProperty("bluerentalcarsEmail"));

        //    -test data password : 12345 dataları girip login e basın
        bluerentalcarsPage.passwordBox.sendKeys(ConfigReader.getProperty("bluerentalcarsPassword"));

        //    -login butonuna tiklayin
        bluerentalcarsPage.loginButtonLoginPage.click();

        //    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
    }
}
