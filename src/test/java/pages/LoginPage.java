package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
// listing object on the login page
    @FindBy(how = How.ID, using = "email")
    public static WebElement MyEmail;

    @FindBy(how = How.ID, using = "passwd")
    public static WebElement Password;


    @FindBy(how = How.NAME, using = "SubmitLogin")
    public static WebElement loginButton;

    @FindBy(how = How.NAME, using = "email_create")
    public static WebElement RegisterEmail;

    @FindBy(how = How.NAME, using = "SubmitCreate")
    public static WebElement CreateAccount;


    public void type_email(){
        MyEmail.sendKeys("abdtest@yahoo.com");
    }

    public void type_password(){
        Password.sendKeys("Test1234");
    }

    public void click_login(){
        loginButton.click();
    }



    public void enter_email(){
        RegisterEmail.sendKeys("abdtest@yahoo.com");
    }

   public void click_create_account(){
      CreateAccount.click();
   }
}