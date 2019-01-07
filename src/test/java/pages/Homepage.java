package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {


    @FindBy(how = How.ID, using = "header_logo")
    public static WebElement Logo;


    public void verify_Logo(){
        Logo.isDisplayed();
    }



}