package dataprovider.login.url.TestPackage;

import dataprovider.login.url.BasePackage.BaseClassUrl;
import dataprovider.login.url.Util.util;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginClass extends BaseClassUrl {

    @DataProvider(name = "bookstore")
    public Object[][] bookStoreDataProvider() throws IOException {
        String filePath = "src/test/resources/File/BookStore.xlsx";
        return util.getExcelData(filePath);
    }

    @Test(dataProvider = "bookstore")
    public void login(String Email, String Password) throws InterruptedException {
        driver.findElement(By.id("userNameOrEmail")).sendKeys(Email);
        driver.findElement(By.id("password")).sendKeys(Password);
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
    }
}
