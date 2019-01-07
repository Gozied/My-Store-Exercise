package Steps;

import Base.testBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CreateAccountPage;
import pages.LoginPage;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class CreateAccount extends testBase {
    static WebDriverWait wait = null;
    @And("^i enter email address in the create account field$")
    public void iEnterEmailAddressInTheCreateAccountField() throws Throwable {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.enter_email();
    }

    @And("^i click on create account$")
    public void iClickOnCreateAccount() throws Throwable {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.click_create_account();
    }

    @When("^i enter personal information details$")
    public void iEnterPersonalInformationDetails() throws Throwable {
        CreateAccountPage createAccountPage = PageFactory.initElements(driver, CreateAccountPage.class);
        createAccountPage.enter_firstmname();
        CreateAccountPage customerlastname = PageFactory.initElements(driver, CreateAccountPage.class);
        customerlastname.enter_lastname();
        CreateAccountPage passwordregister = PageFactory.initElements(driver, CreateAccountPage.class);
        passwordregister.enter_password();

    }

    @And("^i enter date of birth$")
    public void iEnterDateOfBirth() throws Throwable {
        Select day=new Select(driver.findElement(By.id("days")));
        day.selectByValue("1");
        Select mnt=new Select(driver.findElement(By.name("months")));
        mnt.selectByValue("3");
        Select year=new Select(driver.findElement(By.id("years")));
        year.selectByValue("2000");

    }
    @And("^i enter address details and phone number$")
    public void iEnterAddressDetailsAndPhoneNumber() throws Throwable {
      driver.findElement(By.name("address1")).sendKeys("39, Sandhurst Terrace");
      driver.findElement(By.id("city")).sendKeys("NewYork");
      driver.findElement(By.id("id_state")).sendKeys("NewYork");
      driver.findElement(By.id("postcode")).sendKeys("10005");
      driver.findElement(By.id("phone_mobile")).sendKeys("+17440686678");
    }

    @And("^i click register$")
    public void iClickRegister() throws Throwable {
        CreateAccountPage createAccountPage = PageFactory.initElements(driver, CreateAccountPage.class);
        createAccountPage.click_register();
    }


}
