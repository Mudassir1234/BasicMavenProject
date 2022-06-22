package ObjectRepositeries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class LoginpageElements {
    WebDriver driver;
   public  LoginpageElements (WebDriver driver1){
       this.driver=driver1;
   }
   @FindBy (xpath= "//button[contains(text(),'Allow essential')]")
    WebElement cookies;
   @FindBy(id = "email")
   WebElement username;

   @FindBy (id = "pass")
   WebElement password;

   @FindBy (name = "login")
   WebElement loginbutton;

   public void AcceptCookies()
   {
       driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
       cookies.click();
   }
    public void loginwithvalidcredentials(String us, String pasword)
    {
  username.sendKeys(us);
  password.sendKeys(pasword);
  loginbutton.click();
    }
}
