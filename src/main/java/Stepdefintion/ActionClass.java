package Stepdefintion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ActionClass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        List<WebElement> ContactList = driver.findElements(By.xpath("(//div/table)[1]"));
        for (WebElement MyElements : ContactList) {

            System.out.println(MyElements.getText() + " you got a list");
            System.out.println("just for gitbub");



        }
    }
}
