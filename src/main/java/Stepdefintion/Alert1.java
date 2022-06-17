package Stepdefintion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class Alert1 {

    public static void main (String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("alertBox")).click();
        Alert alert= driver.switchTo().alert();
        String Alertmessage= driver.switchTo().alert().getText();
        System.out.println(Alertmessage);
        Thread.sleep(2000);
        alert.dismiss();
    }

}
