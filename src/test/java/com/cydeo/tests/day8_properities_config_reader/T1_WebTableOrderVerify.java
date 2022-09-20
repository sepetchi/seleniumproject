package com.cydeo.tests.day8_properities_config_reader;

import com.cydeo.tests.utilities.WebDriverFactory;
import com.cydeo.tests.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTableOrderVerify {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(" https://practice.cydeo.com/web-tables");
    }


    @Test
    public void order_name_verify_test(){
        // 1. Go to: https://practice.cydeo.com/web-tables
        WebElement bobmartinCell =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        System.out.println("bobmartinCell.getText() = " + bobmartinCell.getText());
        // 2. Verify Bob’s name is listed as expected.
        String expectedBobName = "Bob Martin";
        String actualBobName = bobmartinCell.getText();
        Assert.assertEquals(actualBobName, expectedBobName);


        //Expected: “Bob Martin”
        //3. Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021
        WebElement bobMartinDateCell = driver.findElement
                (By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));

        String expectedBobDate = "12/31/2021";
        String actualBobDate = bobMartinDateCell.getText();
        Assert.assertEquals(actualBobDate, expectedBobDate);

    }
    
    //we use the utility method we created.
    @Test
    public void test2(){
        String customerOrderDate1 = WebTableUtils.returnOrderDate(driver, "Alexandra Gray");
        System.out.println("customerOrderDate1 = " + customerOrderDate1);
        
    }
    @Test
    public void  test3(){
        String customerOrderDate2 = WebTableUtils.returnOrderDate(driver, "John Doe");
        System.out.println("customerOrderDate2 = " + customerOrderDate2);
    }
    //Using WebTableUtils.orderVerify(); method
    @Test
    public void test4(){
        WebTableUtils.orderVerify(driver, "Bart Fisher","01/16/2021");
    }

}
