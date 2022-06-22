package ObjectRepositeries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class InstagramLoginElements {
    WebDriver driver;
    public InstagramLoginElements(WebDriver driver1)
    {
        this.driver=driver1;
    }
    @FindBy (xpath = "//button[contains(text(),'Allow essential and optional cookies')]")
    WebElement cookies;
    @FindBy (name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")

    WebElement login;


    public void AcceptCookies()
    {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        cookies.click();
    }
    public  void logininstagram(String user, String password1)
    {
        username.sendKeys(user);
        password.sendKeys(password1);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        login.click();


    }

}
