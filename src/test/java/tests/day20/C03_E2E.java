package tests.day20;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelmycampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_E2E {
    @Test
    public void E2ETest() throws InterruptedException {
        //https://www.hotelmycamp.com adresine git ve login butonuna bas
        Driver.getDriver().get(ConfigReader.getProperty("hotelmycampUrl"));
        HotelmycampPage hotelmycampPage = new HotelmycampPage();
        hotelmycampPage.loginButtonHomePage.click();

        //Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin
        //Username : manager
        //Password  : Manager1!
        hotelmycampPage.usernameBox.sendKeys(ConfigReader.getProperty("hotelmycampUsername"));
        hotelmycampPage.passwordBox.sendKeys(ConfigReader.getProperty("hotelmycampPassword"));

        //Login butonuna tıklayın.
        hotelmycampPage.loginButtonLoginPage.click();

        //Hotel Management/Room reservation menusunden ADD ROOM RESERVATION butonuna tiklayin
        hotelmycampPage.hotelManagementButton.click();
        hotelmycampPage.roomReservationButton.click();
        hotelmycampPage.addRoomReservationButton.click();

        //Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        //Save butonuna tıklayın.
        Faker faker = new Faker();
        hotelmycampPage.idUserMenu.sendKeys("manager");
        Driver.actions.sendKeys(Keys.TAB).sendKeys("Happy Hotel").
                sendKeys(Keys.TAB).sendKeys("1500").
                sendKeys(Keys.TAB).sendKeys("10/02/2022").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("10/13/2022").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("2").
                sendKeys(Keys.TAB).sendKeys("2").
                sendKeys(Keys.TAB).sendKeys(faker.name().fullName()).
                sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone()).
                sendKeys(Keys.TAB).sendKeys(faker.internet().emailAddress()).
                sendKeys(Keys.TAB).sendKeys("blablabla").
                sendKeys(Keys.TAB).sendKeys(Keys.SPACE).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        //“RoomReservation was inserted successfully” textinin göründüğünü test edin.
        Thread.sleep(1000);
        Assert.assertTrue(hotelmycampPage.roomReservationText.isDisplayed());

        //OK butonuna tıklayın.
        hotelmycampPage.okButton.click();

        Driver.closeDriver();

    }
}
