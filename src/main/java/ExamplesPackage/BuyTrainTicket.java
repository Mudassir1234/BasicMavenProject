package ExamplesPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyTrainTicket {
    WebDriver driver;
    @Test
    public void byticket() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        //JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.get("https://www.thetrainline.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        WebElement from= driver.findElement(By.xpath("//input[contains(@aria-owns, 'stations_from')]"));
        from.sendKeys("London");
        WebElement to=driver.findElement(By.xpath("//input[contains(@aria-owns, 'stations_to')]"));
        to.sendKeys("Leeds");
        Thread.sleep(2000);
        WebElement radio1=driver.findElement(By.xpath("//label[contains(@for, 'single')]"));
        radio1.click();
        WebElement clicks= driver.findElement(By.className("_1eveqwn9"));
        clicks.click();
    }
    @Test
    public void buyanotherticket() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        //JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.get("https://www.trenitalia.com/");
        Thread.sleep(2000);
        WebElement cookies= driver.findElement(By.xpath("//*[text()='Accetta tutti i cookie']"));
        cookies.click();
        WebElement from= driver.findElement(By.id("biglietti_fromNew"));
        from.sendKeys("Roma Termini");
        WebElement to=driver.findElement(By.id("biglietti_toNew"));
        to.sendKeys("Pisa Centrale");
        Thread.sleep(2000);
        WebElement button=driver.findElement(By.xpath("//button[contains(@aria-label, 'seleziona per avviare la ricerca delle soluzioni di viaggio')]"));
        button.click();
        JavascriptExecutor js1 = (JavascriptExecutor)driver;
        Thread.sleep(2000);
        js1.executeScript("window.scrollBy(0,600)");
        Thread.sleep(3000);
       // WebElement select=driver.findElement(By.id("details-collapse-changes-x1f28ba06-4f8d-4b52-ae4c-025ccab355c8"));
        WebElement select= driver.findElement(By.xpath("//span[@class='icon-3 text-gray icon-collapse arrow-height']"));
        select.click();
        Thread.sleep(2000);
        WebElement continue1= driver.findElement(By.xpath("//div[@class='au-target text-1 text-uppercase']"));
        continue1.click();
        Thread.sleep(2000);
        WebElement continue2= driver.findElement(By.xpath("//button[@class='btn btn-block btn-link text-secondary au-target']"));
        continue2.click();
        Thread.sleep(2000);
        WebElement Firstname= driver.findElement(By.id("contact-name"));
        Firstname.sendKeys("Ghulam");
        WebElement Lastname= driver.findElement(By.id("contact-surname"));
        Lastname.sendKeys("Mudassir");
        WebElement email= driver.findElement(By.id("contact-mail"));
        email.sendKeys("mudassirmalik4@gmail.com");
        WebElement cemail= driver.findElement(By.id("contact-mail-conf"));
        cemail.sendKeys("mudassirmalik4@gmail.com");
        WebElement phone= driver.findElement((By.id("contact-phone")));
        phone.sendKeys("123445696090");
        Thread.sleep(2000);
        WebElement confirm3= driver.findElement(By.xpath("//button[@class='au-target btn btn-primary']"));
        confirm3.click();


    }
}


