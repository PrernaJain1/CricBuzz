package dataprovider.login.url.BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClassUrl {

    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://139.59.27.246:3000/login");
    }

    @AfterMethod
    public void setDown(){
        driver.quit();
    }
}
