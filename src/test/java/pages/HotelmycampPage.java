package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelmycampPage {
    public HotelmycampPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@href='/Account/Logon']")
    public WebElement loginButtonHomePage;

    @FindBy (xpath = "//*[@id='UserName']")
    public WebElement usernameBox;

    @FindBy (xpath = "//*[@id='Password']")
    public WebElement passwordBox;

    @FindBy (xpath = "//*[@id='btnSubmit']")
    public WebElement loginButtonLoginPage;

    @FindBy (xpath = "//*[@class='dropdown dropdown-user']")
    public WebElement usernameInTheUpperRightCorner;
    //Başarıyla login yaptığımızda sağ üst köşede çıkan kullanıcı adı (manager)

    @FindBy (xpath = "//*[@class='validation-summary-errors']")
    public WebElement errorMessage;
    //Login işlemi başarısız olduğunda aldığımız mesaj

    @FindBy (xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagementButton;

    @FindBy (xpath = "//*[@href='/admin/RoomReservationAdmin']")
    public WebElement roomReservationButton;

    @FindBy (xpath = "//*[@class='hidden-480']")
    public WebElement addRoomReservationButton;

    @FindBy (xpath = "//*[@id='IDUser']")
    public WebElement idUserMenu;

    @FindBy (xpath = "//*[@class='bootbox-body']")
    public WebElement roomReservationText;

    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement okButton;
}
