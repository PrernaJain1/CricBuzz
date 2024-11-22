package com.cricbuzz.points.table.Test;

import com.cricbuzz.points.table.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class PointTableClass extends BaseClass {

    @Test
    public void pointsTable(){
        List<WebElement> points=driver.findElements(By.xpath("//td[@class='cb-srs-pnts-td text-bold']"));
//        driver.findElement(By.xpath("//div[@class='cb-col cb-col-84']"))

        int i=1;
        for(WebElement p:points){
            int pnts = Integer.parseInt(p.getText());
            if(pnts>=9){
                System.out.println(driver.findElement(By.xpath("(//div[@class='cb-col cb-col-84'])["+i+"]")).getText() + " "+pnts);
            }
            i++;
        }
    }
}
