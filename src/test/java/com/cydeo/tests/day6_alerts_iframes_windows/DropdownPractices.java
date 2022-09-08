package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {
    public  WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void dropdown_task5() throws InterruptedException {


        Select stateDropdowm =new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //select Illinois
        stateDropdowm.selectByVisibleText("Illinois");
        Thread.sleep(Long.parseLong("2000"));
        //select virginia
        stateDropdowm.selectByValue("VA");

        //select California
        stateDropdowm.selectByIndex(5);

        //verify final selected option is California
        String expectedOptionText = "California";
        String actualOPtionText = stateDropdowm.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOPtionText,expectedOptionText);
    }
    @Test
    public void dropdown_Task6(){

        //3. Select “December 1st, 1923” and verify it is selected.
        Select yearDropdown= new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //  Select year using  : visible text
        yearDropdown.selectByVisibleText("1923");
        //Select month using   : value attribute
        monthDropdown.selectByValue("11");
        //Select day using : index number
        dayDropdown.selectByIndex(0);


        String expectedYear = "1923";
        String expectedMonth = "December";
        String expectedDay = "1";

        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();


        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertEquals(actualMonth,expectedMonth);
        Assert.assertEquals(actualDay,expectedDay);
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
}

/*. Open Chrome browser7. Go to http://practice.cybertekschool.com/dropdown
..44ect Illinois4. Select Virginia
     .          nia
6. Verify
    final selected option is California.
Use all Select options. (visible text, value, index)  */