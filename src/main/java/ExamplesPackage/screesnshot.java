package ExamplesPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class screesnshot {
    static WebDriver driver;
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        Take("my file is here");
    }
    public  static void  Take(String filename) throws IOException {
        File photfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(photfile, new File("/Users/ghulammudassir/IdeaProjects/BasicMavenProject/Screenshot/" + filename + ".jpg"));
    }
}
