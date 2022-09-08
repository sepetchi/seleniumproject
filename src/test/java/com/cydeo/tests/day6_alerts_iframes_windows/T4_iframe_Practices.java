package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_iframe_Practices {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/iframe ");
    }
    @Test
    public void iframe_test(){

        //We need to switch driver's focus to iframe
        //driver.switchTo().frame("mce_0_ifr");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"mce_0_ifr\"]")));

        //Locate the p tag
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        //Verify "“An iFrame containing the TinyMCE WYSIWYG Editor”
        //To be able to verify the heade , we must switch back to 'main HTML'
        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(headerText.isDisplayed());
    }
}
/*1. Create a new class called: T4_Iframes
2. Create new test and make set ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG   Editor” */