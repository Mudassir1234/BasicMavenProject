import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazontestcases
{
    //@Test
    //@Before

    private By seller_button=By.xpath("//*[text()='Bestseller']");
    private By click_on_selected_item= By.xpath("//*[text()='Hagibis Spazzola per pulizia degli auricolari Bluetooth multifunzione, compatibile con AirPods 1/2, compatibile con AirPods Pro, compatibile per AirPods 3']");

    @Test
   // @BeforeTest



    public void firstestcase() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.it/");
        driver.manage().window().maximize();

       // WebElement cookies= driver.findElement(By.xpath("//*[text()='Accetta i cookie']"));
        WebElement cookies= driver.findElement(By.id("sp-cc-accept"));
        Thread.sleep(1000);
        cookies.click();
        //Thread.sleep(1000);
        System.out.println("Test is passed");
        //driver.navigate().to("https://www.amazon.it/");
        //Thread.sleep(4000);
        //driver.navigate().back();
        // driver.close();
        Thread.sleep(1000);
        driver.findElement(seller_button).click();
        driver.findElement(click_on_selected_item).click();

        driver.findElement(By.id("add-to-cart-button")).click();
        driver.navigate().back();

        WebElement quantity= driver.findElement(By.id("quantity"));
        Select selectquantity= new Select(quantity);
        selectquantity.selectByValue("4");
        driver.findElement(By.id("add-to-cart-button")).click();
       // driver.findElement(By.name("lastname")).sendKeys("Mudassir");
        //driver.findElement(By.id("birthday_")).sendKeys("15");
        //Thread.sleep(2000);
        //WebElement days= driver.findElement(By.id("day"));
        //Select selectdays=new Select(days);
        //selectdays.selectByIndex(23);
       // WebElement months= driver.findElement(By.id("month"));
        //Select selectmonths=new Select(months);
       // selectmonths.selectByVisibleText("Aug");
        //WebElement years= driver.findElement(By.id("year"));
        //Select selectyears=new Select(years);
       // selectyears.selectByValue("1992");
        // driver.close();
    }
    //@AfterTest




}
