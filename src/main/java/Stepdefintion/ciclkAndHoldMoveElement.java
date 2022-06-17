package Stepdefintion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ciclkAndHoldMoveElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement clickandholdmove= driver.findElement(By.id("draggable"));
        WebElement drop= driver.findElement(By.id("droppable"));
        //driver.findElement(By.id("cookieChoiceDismiss")).click();
        Thread.sleep(2000);

       // WebElement clickandhold= driver.findElement(By.xpath("//li[text()= 'C']"));

        Actions actions=new Actions(driver);
        actions.moveToElement(clickandholdmove);
        actions.clickAndHold(clickandholdmove).moveToElement(drop, 130, 150).release().perform();


    }
}

