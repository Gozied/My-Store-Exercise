package Steps;

import Base.testBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.CommonPage;
import pages.LoginPage;
import pages.MyAccountPage;


public class Login extends testBase{

    @When("^i click on sign in$")
    public void iClickOnSignIn() throws Throwable {
        CommonPage commonpage = PageFactory.initElements(driver, CommonPage.class);
        commonpage.click_Signin_button();
    }


    @And("^i enter email in the email field$")
    public void iEnterEmailInTheEmailField() throws Throwable {
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.type_email();

    }

    @And("^i enter password in the password field$")
    public void iEnterPasswordInThePasswordField() throws Throwable {
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.type_password();


    }

    @And("^i click on login button$")
    public void iClickOnLoginButton() throws Throwable {
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.click_login();

    }

    @Then("^i should be successfully logged in$")
    public void iShouldBeSuccessfullyLoggedIn() throws Throwable {
        MyAccountPage myaccountpage = PageFactory.initElements(driver, MyAccountPage.class);
        myaccountpage.verify_Account_holder();

    }


}
