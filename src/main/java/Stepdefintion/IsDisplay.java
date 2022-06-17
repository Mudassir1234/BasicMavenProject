package Stepdefintion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://api.freecrm.com/register/");
        driver.manage().window().maximize();
        String title= driver.getTitle();

        System.out.println(title);
        boolean signup= driver.findElement(By.name("action")).isDisplayed();
        System.out.println(signup);
        System.out.println(title);
        boolean signup1= driver.findElement(By.name("action")).isEnabled();
        System.out.println(signup1);
        driver.findElement(By.id("terms")).click();

        boolean checkbox= driver.findElement(By.id("terms")).isSelected();
        System.out.println(checkbox);

    }
}
