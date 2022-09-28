package tests.tasks;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C01_Priority extends TestBaseBeforeClassAfterClass {
    //2) https://www.youtube.com adresine gidin
    //3) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin

    @Test (priority = 1)
    public void testTitle() {
        //○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
        driver.get("https://www.youtube.com");
        Assert.assertEquals("YouTube", driver.getTitle());

    }

    @Test (priority = 2)
    public void testImage() {
        //○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@id='logo-icon'])[1]")).isDisplayed());

    }

    @Test (priority = 3)
    public void testSearchBox() {
        //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        Assert.assertTrue(driver.findElement(By.xpath("//*[@name='search_query']")).isEnabled());

    }

    @Test (priority = 4)
    public void testWrongTitle() {
        //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
        Assert.assertNotEquals("youtube", driver.getTitle());

    }
}
