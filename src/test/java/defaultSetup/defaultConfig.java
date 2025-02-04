package defaultSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class defaultConfig {
    public WebDriver driver;
    @BeforeTest
    public void setup(){
        driver=new FirefoxDriver();
        driver.get("https://testconnect.mimebd.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

//    @AfterTest
//    public  void logout(){
//        driver.close();
//    }
}