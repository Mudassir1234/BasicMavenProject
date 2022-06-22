package ExamplesPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Set;

public class GetWindowHandle {
    WebDriver driver;
    @BeforeTest
    public void setup () {
       // WebDriverManager.firefoxdriver().setup();
       // WebDriverManager.chromedriver().setup();
       // this.driver = new FirefoxDriver();

        //this.driver = new ChromeDriver();
        //driver.manage().window().maximize();
       // driver.manage().window().maximize();
        WebDriverManager.chromedriver().setup();
        // WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();

        //this.driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().window().maximize();
        //driver.get("https://demoqa.com/browser-windows");

    }
   @Test
    public void Alert (){
       WebDriverManager.chromedriver().setup();
       // WebDriverManager.chromedriver().setup();
       this.driver = new ChromeDriver();

       //this.driver = new ChromeDriver();
       //driver.manage().window().maximize();
       driver.manage().window().maximize();


        driver.get("https://demoqa.com/browser-windows");
        String window = driver.getWindowHandle();
        System.out.println("Main Window is: " + window);
        WebElement NewWindow = driver.findElement(By.id("windowButton"));
        NewWindow.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        Set<String> Handles = driver.getWindowHandles();
        System.out.println(Handles.size());
        for (String windows : Handles) {
            if (window.equals(windows)){
                driver.switchTo().window(windows);
                System.out.println("window is"+ windows + " ()Url is ()"+ driver.getCurrentUrl() + "  title is "+ driver.getTitle() );
            }
            else {
                driver.switchTo().window(windows);
                System.out.println("window is"+ windows + " ()Url is ()"+ driver.getCurrentUrl() + "  title is "+ driver.getTitle() );
            }

        }

    }
    @Test
   // public void Takescreesnhort()
   // {
     //   driver.get("https://demoqa.com/browser-windows");
     //   File photofile= (Takescreesnhort() driver.)
   // }
    @AfterTest
    public void Teardown () throws InterruptedException {


        //Thread.sleep(2000);
        //driver.quit();
    }


}
