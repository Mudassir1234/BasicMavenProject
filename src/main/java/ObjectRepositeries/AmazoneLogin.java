package ObjectRepositeries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class AmazoneLogin {
    WebDriver driver;
    public AmazoneLogin (WebDriver webDriver){
        this.driver=webDriver;

    }

    //@FindBy(xpath= "//button[contains(text(),'Allow essential')]")
    //WebElement cookies;

    @FindBy(xpath = "//span[@class='a-button a-spacing-top-base a-button-base glow-toaster-button glow-toaster-button-dismiss']")
    WebElement confirmation;
//(//span[@class='a-button-inner'])[1]
    @FindBy(linkText = "Sign in")
    WebElement signin;
    ////span[@class='nav-action-inner'])[1] //span[@class='nav-action-inner'])[1]
    @FindBy (id = "ap_email")
    WebElement username;

    @FindBy (id = "continue")
    WebElement continue1;

    @FindBy (id = "ap_password")
    WebElement password1;

    @FindBy (id = "signInSubmit")
    WebElement submit;


        public void AcceptConfriamtion ()
        {
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            confirmation.click();
        }


    public void loginwithamazoncredentials (String username1, String password2)
    {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        signin.click();
        username.sendKeys(username1);
        continue1.click();
        password1.sendKeys(password2);
        submit.click();
        //password.sendKeys(pasword);
        //loginbutton.click();
    }
}


