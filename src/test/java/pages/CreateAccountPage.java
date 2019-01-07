package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateAccountPage {
//   identifying the objects on the register account page
    @FindBy(how = How.ID, using = "customer_firstname")
    public static WebElement FirstName;

    @FindBy(how = How.ID, using = "customer_lastname")
    public static WebElement LastName;

    @FindBy(how = How.NAME, using = "passwd")
    public static WebElement RegisterPassword;

    @FindBy(how = How.XPATH, using = "//*[@id=\'submitAccount\']/span")
    public static WebElement Register;



// Design methods to interact with the object in register account page
    public void enter_firstmname(){
        FirstName.sendKeys("John");
    }
    public void enter_lastname(){
        LastName.sendKeys("Bosco");
    }
    public void click_register(){
        Register.click();
    }
    public void enter_password(){
        RegisterPassword.sendKeys("Test1234");
    }

}

