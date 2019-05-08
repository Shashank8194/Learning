package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseClass {

    public static WebDriver driver = null;
    public static WebDriverWait wait = null;
    public static Properties prop = null;
    public static FileInputStream fis = null;


    public BaseClass() {

    }

  //  @BeforeSuite
    public WebDriver BrowserInvoke() throws Exception {
        prop = new Properties();
        String path=System.getProperty("user.dir");
        fis = new FileInputStream("D:\\535_Certification_Project_codes(1)\\revinfotech\\src\\Generic\\Browser.properties");
        prop.load(fis);
        String BrowserName = prop.getProperty("browsername");

        if (BrowserName.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:\\535_Certification_Project_codes(1)\\revinfotech\\Browser_Directory\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.navigate().to("https://theofficialbrand-sd.kachyng.com/QNKGGs");
            driver.manage().window().maximize();
        } else if (BrowserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "D:\\535_Certification_Project_codes(1)\\revinfotech\\Browser_Directory\\geckodriver.exe");
        } else {
            System.out.println("Browser doesnt initiate");
        }

        return driver;
    }

    /*@AfterSuite
    public WebDriver BrowserClose()
    {
        driver.quit();
        return  driver;
    }*/
}

