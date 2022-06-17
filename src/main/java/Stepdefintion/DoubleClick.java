package Stepdefintion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Accept All')]")).click();

        //driver.findElement(By.id("cookieChoiceDismiss")).click();
        Thread.sleep(2000);

        WebElement doubleclick = driver.findElement(By.xpath("//*[text()='Double-Click Me To See Alert']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(doubleclick);
        actions.doubleClick().perform();
    }
}
