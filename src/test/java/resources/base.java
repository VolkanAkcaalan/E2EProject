package resources;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {

        public WebDriver driver;
        public Properties prop;
    public WebDriver initializeDriver() throws IOException {

        WebDriverManager.chromedriver().setup();

        prop= new Properties();
        FileInputStream fis=new FileInputStream("C:\\Users\\akcaa\\E2EProject\\src\\test\\java\\resources\\data.properties");

        prop.load((fis));
        String browserName=prop.getProperty("browser");
        System.out.println(browserName);

        if(browserName.equals("chrome")){

            driver=new ChromeDriver();

        }else if (browserName.equals("firefox")){

            driver=new FirefoxDriver();

        }else if (browserName.equals("IE")){

        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return driver;


    }

}
