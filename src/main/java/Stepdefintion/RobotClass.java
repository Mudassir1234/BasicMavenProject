package Stepdefintion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClass {
    @Test
    public void eduril() throws InterruptedException, AWTException {
    //{}
    //public static void main(String[] args) throws InterruptedException, AWTException
    // {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.edureka.co");
        driver.manage().window().maximize();
       // driver.manage().window().maximize();
        //driver.findElement(By.id("cookieChoiceDismiss")).click();

        driver.findElement(By.linkText("Courses")).click();
        Robot robot= new Robot();
        Thread.sleep(4000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(4000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(4000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(4000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(4000);
        //robot.keyPress(KeyEvent.VK_DOWN);
        robot.mouseMove(30,100);
        Thread.sleep(2000);
        //robot.keyPress(KeyEvent.VK_DOWN);
        //robot.keyPress(KeyEvent.VK_TAB);
        robot.mouseMove(50, 100);


    }
    @Test
        public void actioninfo() {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("http://automationtalks.com/");
            driver.manage().window().maximize();

            WebElement element = driver.findElement(By.xpath("//input[@placeholder='Search']"));
            element.sendKeys("selenium");
            Actions action = new Actions(driver);

        }

        @Test

            public void AssertTest ()
            {

                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                driver.get("http://automationtalks.com/");
                driver.manage().window().maximize();

                String myTitle = driver.getTitle();
                System.out.println(myTitle + "The name of the title");
                String expecttitle = "Automation Testing";
                String Actulatitle = driver.getTitle();
                Assert.assertEquals(expecttitle, Actulatitle);


            }
        }

