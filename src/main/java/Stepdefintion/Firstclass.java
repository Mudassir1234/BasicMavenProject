package Stepdefintion;

import POM.Dashboard;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Firstclass extends Dashboard {
    //@Test
    //@BeforeClass
    public static void main(String[] args) throws InterruptedException, IOException {
        String nama=null;
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       // driver.get("https://www.thetrainline.com/it/compagnie-ferroviarie/trenitalia?gclid=56f2221edfdd1662c7a640b741281c2b&gclsrc=3p.ds&msclkid=56f2221edfdd1662c7a640b741281c2b&utm_source=bing&utm_medium=cpc&utm_campaign=IT_TOC_Core_%5E_%5E_Trenitalia_Exact_BSH15E8&utm_term=trenitalia&utm_content=IT_TOC_Core_Trenitalia_%5E_%5E_%5E_%5E_%5E_Exact");
       // driver.manage().window().maximize();
        //Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      //  Dashboard.cookies(driver).click();
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[text()='Change to English']")).click();
        Dashboard.popup(driver).click();
        Dashboard.readproperties(driver,nama);

    }

}
