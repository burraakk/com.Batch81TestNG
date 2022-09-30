package tests.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeMethodAfterMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_WebappsecurityTask extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test01() {
        //     “http://zero.webappsecurity.com/” Adresine gidin
        driver.get("http://zero.webappsecurity.com/");

        //     Sign in butonuna basin
        driver.findElement(By.xpath("//*[@id='signin_button']")).click();

        //     Login kutusuna “username” yazin
        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("username");

        //     Password kutusuna “password” yazin
        driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys("password");

        //     Sign in tusuna basin
        driver.findElement(By.xpath("//*[@name='submit']")).click();

        //     Online banking menusu icinde Pay Bills sayfasina gidin
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id='online-banking']")).click();
        driver.findElement(By.xpath("//*[@id='pay_bills_link']")).click();

        //     “Purchase Foreign Currency” tusuna basin
        driver.findElement(By.xpath("//*[text()='Purchase Foreign Currency']")).click();

        //     “Currency” drop down menusunden Eurozone u secin
        WebElement currencyDropDownMenu = driver.findElement(By.xpath("//*[@id='pc_currency']"));
        Select select = new Select(currencyDropDownMenu);
        select.selectByVisibleText("Eurozone (euro)");

        //     soft assert kullanarak "Eurozone (Euro)" secildigini test edin
        SoftAssert softAssert = new SoftAssert();
        String actualDropDownTitle = select.getFirstSelectedOption().getText();
        String expectedDropDownTitle = "Eurozone (Euro)";
        softAssert.assertNotEquals(actualDropDownTitle, expectedDropDownTitle,
                "Eurozene (euro) is not selected");

        //     soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
        //     "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)",
        //     "China  (yuan)","Denmark (krone)","Eurozone (euro)",
        //     "Great Britain (pound)","Hong Kong  (dollar)","Japan (yen)",
        //     "Mexico (peso)","Norway (krone)","New Zealand  (dollar)",
        //     "Sweden (krona)","Singapore (dollar)","Thailand (baht)"

        List<WebElement> currencyDDMOptions = select.getOptions();
        List<String> expectedOptions = new ArrayList<>(Arrays.asList("Select One",
                "Australia (dollar)", "Canada (dollar)","Switzerland (franc)",
                "China (yuan)","Denmark (krone)","Eurozone (euro)",
                "Great Britain (pound)","Hong Kong (dollar)","Japan (yen)",
                "Mexico (peso)","Norway (krone)","New Zealand (dollar)",
                "Sweden (krona)","Singapore (dollar)","Thailand (baht)"));

        for (int i = 0; i < currencyDDMOptions.size(); i++) {
            softAssert.assertEquals(currencyDDMOptions.get(i).getText(),expectedOptions.get(i),
                    "Drop Down Options isn't same with Expected Options");
        }

        softAssert.assertAll();

        driver.close();
    }
}
