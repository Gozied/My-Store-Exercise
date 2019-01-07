package Steps;


import Base.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.support.PageFactory;
import pages.Homepage;


import java.io.IOException;



public class Common extends testBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }


    @Given("^i am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
        Thread.sleep(3000);

    }

    @Given("^i see a logo banner$")
    public void i_see_a_logo_banner() throws Throwable {
        Homepage homepage = PageFactory.initElements(driver, Homepage.class);
        homepage.verify_Logo();
    }




}
