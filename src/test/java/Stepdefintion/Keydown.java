package Stepdefintion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Keydown {

    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("cookieChoiceDismiss")).click();
        WebElement dev= driver.findElement(By.linkText("compendiumdev"));
        Actions actiononkeys=new Actions(driver);

        actiononkeys.contextClick(dev).keyDown(Keys.CONTROL).click().build().perform();//.keyUp(Keys.CONTROL).build().perform();

        }
        @BeforeTest
      public  void beforeTestmethodmethod()
        {

        }
        @BeforeTest
        public  void beforeTestmethodmethod1()
        {

        }


    }
