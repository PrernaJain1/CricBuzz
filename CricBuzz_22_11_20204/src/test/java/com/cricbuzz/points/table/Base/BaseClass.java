package com.cricbuzz.points.table.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    public WebDriver driver;

    @BeforeClass
    public void initialize(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cricbuzz.com/cricket-series/8525/womens-big-bash-league-2024/points-table");
    }

    @AfterClass
    public void tearItDown(){
        driver.quit();
    }
}
