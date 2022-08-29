package com.cydeo.tests.day2_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://practice.cydeo.com");

        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains(expectedURL)){
            System.out.println("URL verification Passed");
        } else {
            System.out.println("URL verification Failed");
        }

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title Verification Passed");

        }else {
            System.out.println("Title Verification Failed");
        }

    }

}
/*Open a chrome browser
        2- Go to: https://practice.cydeo.com
        3- Click to A/B Testing from top of the list.
        4- Verify title is:
        Expected: No A/B Test
        5- Go back to home page by using the .back();
        6- Verify title equals:
        Expected: Practice */