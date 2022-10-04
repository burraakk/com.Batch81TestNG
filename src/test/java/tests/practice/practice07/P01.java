package tests.practice.practice07;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebdriverUniversityPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01 {

    @Test
    public void test01() throws InterruptedException {
        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");

        // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
        WebdriverUniversityPage webdriverUniversityPage = new WebdriverUniversityPage();
        List<String> workList = new ArrayList<>(Arrays.asList("Kahvaltıyı hazırla","Bulaşıkları yıka","Bebekle ilgilen",
                                                              "Çocuğunun ödevine yardım et","Selenyum çalış","Uyu"));

        Actions actions = new Actions(Driver.getDriver());

        for (String w : workList) { //Sendkeys ile doğrudan da ekleyebiliriz ama actions ile yapacağız
            actions.click(webdriverUniversityPage.addNewTodoBox).sendKeys(w).sendKeys(Keys.ENTER).perform();
        }

        //Tüm yapılacakların üzerini çiz.
        List<WebElement> todos = webdriverUniversityPage.allTodos;
        for (WebElement w : todos ) {
            w.click();
        }

        //Tüm yapılacakları sil.
        List<WebElement> deleteButtons = webdriverUniversityPage.allDeleteButtons;
        for (WebElement w : deleteButtons) {
            w.click();
        }

        //Tüm yapılacakların silindiğini doğrulayın.
        List<WebElement> lastTodos = webdriverUniversityPage.allTodos;
        Assert.assertEquals(0, lastTodos.size());


    }
}
