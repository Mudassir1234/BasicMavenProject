package TestCasesPackage;

import ObjectRepositeries.LoginpageElements;
import UtilitiesPackage.Testbased;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class loginTestCase {
    @Test
    public void checkvaliduser()
    {
        WebDriver driver= Testbased.startbrowser("chrome");
        LoginpageElements lgpage= PageFactory.initElements(driver, LoginpageElements.class);
        lgpage.AcceptCookies();
        lgpage.loginwithvalidcredentials("admin", "1234");

    }
}
