package TestCasesPackage;

import ObjectRepositeries.InstagramLoginElements;
import UtilitiesPackage.Testbased;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class InstagrameTestcase {
   @Test
    public void InstagramLogin()
    {
        WebDriver driver= Testbased.startbrowser("chrome");
        InstagramLoginElements logintest= PageFactory.initElements(driver, InstagramLoginElements.class);
        logintest.AcceptCookies();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        logintest.logininstagram("mudassirmalik5@gmail.com", "12345678");


    }
}
