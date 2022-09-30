package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DhtmlgoodiesPage {

    // Bir page sayfası ilk oluşturulduğunda, ilk yapmamız gereken şey burada bir Constructor oluşturmak.
    // Public olmak zorunda!

    /*
    -Frameworkler buyudukce yeni classlar yeni test methodlari yeni webelementler olusturdukca
    icinden cikilmaz, anlasilmaz, tekrar bakimi yapilamaz, guncellemesi cok zor hatta imkansiz bir hal alir.
    -Uzmanlar reusable, maintainable, rahat manipule edilebilir bir framework icin bir design pattern olarak
    POM (page object model)'de karar vermisler.
    -Olmazsa olmazlar
        1) Driver class
        2) Page class
        3) Test class
           Utilities
    -Aradigimiz bir web elementi ya da bir methodu kolaylikla bulabilmek ve guncelleyebilmek icin javadan
    ogrenmis oldugumuz OOP Concept Selenium ile page object modelde birlestirilmis oluyor.

 */

    public DhtmlgoodiesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //=============CAPITALS==============

    @FindBy (xpath = "//div[@id='box1']")
    public WebElement oslo;

    @FindBy (xpath = "//div[@id='box2']")
    public WebElement stockholm;

    @FindBy (xpath = "//div[@id='box3']")
    public WebElement washington;

    @FindBy (xpath = "//div[@id='box4']")
    public WebElement copenhagen;

    @FindBy (xpath = "//div[@id='box5']")
    public WebElement seoul;

    @FindBy (xpath = "//div[@id='box6']")
    public WebElement rome;

    @FindBy (xpath = "//div[@id='box7']")
    public WebElement madrid;


    //==============COUNTRIES==============

    @FindBy (xpath = "//div[@id='box101']")
    public WebElement norway;

    @FindBy (xpath = "//div[@id='box102']")
    public WebElement sweden;

    @FindBy (xpath = "//div[@id='box103']")
    public WebElement unitedStates;

    @FindBy (xpath = "//div[@id='box104']")
    public WebElement denmark;

    @FindBy (xpath = "//div[@id='box105']")
    public WebElement southKorea;

    @FindBy (xpath = "//div[@id='box106']")
    public WebElement italy;

    @FindBy (xpath = "//div[@id='box107']")
    public WebElement spain;

}