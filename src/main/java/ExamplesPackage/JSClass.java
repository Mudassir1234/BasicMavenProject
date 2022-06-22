package ExamplesPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSClass {
    WebDriver driver;
    @Test

    public  void JStesting() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.get("https://www.browserstack.com/users/sign_in");
        driver.findElement(By.id ("accept-cookie-notification")).click();
        String window = driver.getWindowHandle();
        System.out.println("Main Window is: " + window);
        js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';");
        js.executeScript("document.getElementById('user_password').value='password';");
        js.executeScript("document.getElementById('user_submit').click();");
        js.executeScript("alert('enter correct login credentials to continue');");
        Thread.sleep(2000);

    }
    @Test
    public  void JStestingscrolling() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.className("a-button-input")).click();
        JavascriptExecutor js1 = (JavascriptExecutor)driver;
        Thread.sleep(2000);
        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[contains(@alt, 'Electronics')]")).click();
        //js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    @Test
    public  void JStestingscrollingnew() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.className("a-button-input")).click();
        JavascriptExecutor js1 = (JavascriptExecutor)driver;
        Thread.sleep(2000);
        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//img[contains(@alt, 'Electronics')]")).click();
        js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

}
