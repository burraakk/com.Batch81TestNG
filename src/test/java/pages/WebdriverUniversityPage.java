package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class WebdriverUniversityPage {

    public WebdriverUniversityPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@type='text']")
    public WebElement addNewTodoBox;

    @FindBy (xpath = "//li")
    public List<WebElement> allTodos;

    @FindBy (className = "fa fa-trash")
    public List<WebElement> allDeleteButtons;

}
