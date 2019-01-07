package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountPage {
    @FindBy(how= How.CSS, using = ".account > span:nth-child(1)")
    public static WebElement AccountHolderName;


    public void verify_Account_holder(){
        String Acc_name = AccountHolderName.getText();
        System.out.println(Acc_name);


    }






}
