import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
    public static void main(String[] args) throws IOException {

        readproperties();
    }
    public static void readproperties() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();
        FileInputStream file1 = new FileInputStream("/Users/ghulammudassir/IdeaProjects/BasicMavenProject/src/main/java/POM/config.properties");
        Properties prop = new Properties();
        prop.load(file1);


        //String username= prop.getProperty("username");
        // String pwd= prop.getProperty("password");
        String fname = prop.getProperty("firstname1");
        String browsr = prop.getProperty("browser");
        //String url = prop.getProperty("url");
        driver1.get(prop.getProperty("url"));
        //System.out.println(username);
        //System.out.println(pwd);
        System.out.println(fname);
        System.out.println(browsr);
    }

    }

    //public static void writeproperties() {
        //OutputStream output =new FileOutputStream( )

    //}
//}

