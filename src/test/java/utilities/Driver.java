package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Driver {

    static WebDriver driver;
    protected static Actions actions;
    protected static String tarih;

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        actions = new Actions(driver);
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY.MM.dd_HH-mm");
        tarih = date.format(formatter);

        return driver;
    }

    public static void closeDriver(){
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }

    public static void quitDriver(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    /*
    Testleri calistirdigimizda her seferinde yeni driver olusturdugu icin her test methodu icin yeni
    bir pencere (driver) aciyor.Eger driver'a bir deger atanmamissa yani driver==null ise
    bir kere driver'i calistir diyerek bir kere if icini calistiracak ve driver artik bir kere
    calistigi icin ve deger atandigi icin null olmayacak ve direk return edecek ve diger testlerimiz
    ayni pencerede (driver) uzerinde calisacak
    */

}
