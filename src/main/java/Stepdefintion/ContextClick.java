package Stepdefintion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        driver.manage().window().maximize();
        //driver.findElement(By.id("cookieChoiceDismiss")).click();
        Thread.sleep(2000);

        WebElement clontextclick= driver.findElement(By.id("cookieChoiceDismiss"));

        Actions actions=new Actions(driver);
        actions.moveToElement(clontextclick);
        actions.contextClick().perform();

    }
    //@BeforeClass
   // @BeforeTest


}
