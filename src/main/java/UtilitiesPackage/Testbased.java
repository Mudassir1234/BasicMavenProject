package UtilitiesPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbased {
   static WebDriver driver;
   String subdriver1;
   String subdruver2;
   String subdriver3;
   public static WebDriver startbrowser(String browsername)
   {
       if(browsername.equalsIgnoreCase("chrome"))
       {
           WebDriverManager.chromedriver().setup();
           driver=new ChromeDriver();
       } else if (browsername.equalsIgnoreCase("firefox")) {
           WebDriverManager.firefoxdriver().setup();
           driver=new FirefoxDriver();

       }
       driver.manage().window().maximize();
      // driver.get("https://www.facebook.com/login/");
      // driver.get("https://www.amazon.com/");
      //driver.get("https://www.instagram.com/");
      driver.get("https://demoqa.com/browser-windows");
       return driver;
   }

}
