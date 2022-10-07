package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BluerentalcarsPage {
    public BluerentalcarsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (className = "btn btn-primary btn-sm")
    public WebElement loginButtonHomePage;

    @FindBy (xpath = "//*[@id='formBasicEmail']")
    public WebElement emailBox;

    @FindBy (xpath = "//*[@id='formBasicPassword']")
    public WebElement passwordBox;

    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement loginButtonLoginPage;
}
