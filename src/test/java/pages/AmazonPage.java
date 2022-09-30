package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){    //Constructor oluşturup public yapmamız gerekir
        PageFactory.initElements(Driver.getDriver(), this);
        //this-> Driver class'indaki Driver.getDriver() 'i , Page class'indaki driver'a  esitledi/tanitti.
    }

    @FindBy (id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy  (xpath = "//*[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement searchResultWE;

}
