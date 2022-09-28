package tests.practice.package05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class P01 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test01() throws InterruptedException {

        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        //fill the firstname
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Burak");

        //fill the lastname
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("KAYA");

        //check the gender
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='sex-0']")).click();

        //check the experience
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='exp-2']")).click();

        //fill the date
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("sep 28, 2022");

        //choose your profession -> Automation Tester
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='profession-1']")).click();

        //choose your tool -> Selenium Webdriver
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='tool-0']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='tool-2']")).click();

        //choose your continent -> Antartica
        Thread.sleep(1000);
        WebElement dropDownContinents = driver.findElement(By.xpath("//*[@id='continents']"));
        Select select = new Select(dropDownContinents);
        select.selectByVisibleText("Antartica");

        //choose your command  -> Browser Commands
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='selenium_commands']/option[1]"));

        //click submit button
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='submit']")).click();

    }

}
