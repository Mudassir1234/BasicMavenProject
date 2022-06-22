package TestCasesPackage;

import ObjectRepositeries.AmazoneLogin;
import UtilitiesPackage.Testbased;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Amazonlogin {
    @Test
    public void checkvaliduser()
    {
        WebDriver driver= Testbased.startbrowser("chrome");
        AmazoneLogin lgpage= PageFactory.initElements(driver, AmazoneLogin.class );
        lgpage.AcceptConfriamtion();
        lgpage.loginwithamazoncredentials("mudassirmalik4@gmail.com",  "123456");

    }
}
