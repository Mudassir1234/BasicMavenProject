import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing {


            @Test



            public void firstestcase() throws InterruptedException {
                WebDriverManager.chromedriver().setup();
                WebDriver driver=new ChromeDriver();
                driver.get("https://www.facebook.com/r.php");
                driver.manage().window().maximize();

                WebElement cookies= driver.findElement(By.xpath("//*[text()='Allow essential and optional cookies']"));
                cookies.click();
                Thread.sleep(1000);
                System.out.println("Test is passed");
                //driver.navigate().to("https://www.amazon.it/");
                //Thread.sleep(4000);
                //driver.navigate().back();
               // driver.close();
                driver.findElement(By.name("firstname")).sendKeys("Ghulam");
                driver.findElement(By.name("lastname")).sendKeys("Mudassir");
                //driver.findElement(By.id("birthday_")).sendKeys("15");
                Thread.sleep(2000);
                WebElement days= driver.findElement(By.id("day"));
                Select selectdays=new Select(days);
                selectdays.selectByIndex(23);
                WebElement months= driver.findElement(By.id("month"));
                Select selectmonths=new Select(months);
                selectmonths.selectByVisibleText("Aug");
                WebElement years= driver.findElement(By.id("year"));
                Select selectyears=new Select(years);
                selectyears.selectByValue("1992");
               // driver.close();
            }



}
