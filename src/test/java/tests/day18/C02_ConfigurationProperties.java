package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigurationProperties {
    @Test
    public void test01() {
        //Amazon ve Facebook sayfasına gidelim

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        String facebookURL = ConfigReader.getProperty("facebookUrl");
        Driver.getDriver().get(facebookURL);

        Driver.closeDriver();

    }
}
