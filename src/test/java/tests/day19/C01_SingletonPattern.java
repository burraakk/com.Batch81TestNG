package tests.day19;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_SingletonPattern {
    @Test
    public void test01() {
        // Driver driver = new Driver();
        // driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

       /*
        SingletonPattern : tekli kullanım demektir. Bir class'ın farklı class'lardan
        obje oluşturarak kullanımını engellemektir.

        Bunu sağlamak için Utilities package'ındaki Driver classına default constructor yerine
        private Driver(){  }
        constructor'ını koyuyoruz ve default constructor'ı devre dışı bırakıyoruz.
       */

    /*
        POM'de Driver icin TestBase class'ina extends etmek yerine
    Driver class'indan static method'lar kullanarak driver olusturup,
    ilgili ayarlarin yapilmasi ve en sonda driver'in kapatilmasi tercih edilmistir.

        POM'de Driver class'indaki getDriver()'nin obje olusturularak
    kullanilmasini engellemek icin Singleton pattern kullanimi benimsenmistir.

        Singleton Pattern -> tekli kullanim, bir class'in farkli class'lardan
    obje olusturularak kullanimini engellemek icin kullanilir.

        Bunu saglamak icin yapmamiz gereken sey oldukca basit
    obje olusturmak icin kullanilan constructor'i private yaptiginizda
    baska class'larda Driver class'indan obje olusturulmasi mumkun OLAMAZ

        POM'da artik inheritance yerine object ve static kullanarak methodlara ulasiyoruz
    page classina objeyle driver classina static ile ulasiriz
    */

}
