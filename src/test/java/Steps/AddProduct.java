package Steps;

import Base.testBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddProduct extends testBase {
    @When("^i click on Dresses$")
    public void iClickOnDresses() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\'block_top_menu\']/ul/li[2]/a")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,900)", "");
        Thread.sleep(2000);
    }

    @And("^i add the most expensive dress to my cart$")
    public void iAddTheMostExpensiveDressToMyCart() throws Throwable {

        Actions actions = new Actions(driver);
        WebElement main = driver.findElement(By.xpath("//*[@id=\'center_column\']/ul/li[2]/div/div[1]/div/a[1]/img"));
        actions.moveToElement(main);
        Thread.sleep(1000);
        actions.build().perform();
        Thread.sleep(5000);
        driver.findElement(By.id("color_43")).click();
        driver.findElement(By.name("Submit")).click();

    }

    @Then("^i log out$")
    public void iLogOut() throws Throwable {
        driver.findElement(By.className("logout")).click();
        Thread.sleep(5000);
    }



    @Then("^i click on cart to check my product is still in the cart$")
    public void iClickOnCartToCheckMyProductIsStillInTheCart() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\'header\']/div[3]/div/div/div[3]/div/a/b")).click();
        String ExpectedMessage = "Your shopping cart is empty.";
        String ActualMessage =  driver.findElement(By.xpath("//*[@id=\'center_column\']/p")).getText();
        System.out.println(ActualMessage);
        Assert.assertEquals(ExpectedMessage, ActualMessage);
    }
}
