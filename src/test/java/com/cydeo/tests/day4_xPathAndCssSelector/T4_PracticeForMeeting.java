package com.cydeo.tests.day4_xPathAndCssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_PracticeForMeeting {
    public static void main(String[] args) {
        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");
        //3. Click on Button 1
        WebElement ButtonOne = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        ButtonOne.click();
        //4. Verify text displayed is as expected:
        WebElement ButtonOneMessage = driver.findElement(By.cssSelector("p[style='color:green']"));
        String expectedButtonOneMessage = "Clicked on button one!";
        String actualButtonOneMessage = ButtonOneMessage.getText();
        if (expectedButtonOneMessage.equals(actualButtonOneMessage)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED!!!");
        }
        //Expected: “Clicked on button one!”

        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
