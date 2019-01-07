package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonPage {

    @FindBy(how=How.LINK_TEXT, using="Sign in")
    public static WebElement Signin;


    public void click_Signin_button(){
        Signin.click();
    }

}
