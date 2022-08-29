package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com");
        // expected: Yahoo | Mail, Weather, Searh, Politics, News, Finance, Sports & Videos
        String expectedTitle = "Yahoo | Mail, Weather, Searh, Politics, News, Finance, Sports & Videos";
        //actuel title comes from the browser
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is expected. Verification PASSED!");
        }else {
            System.out.println("This is not expected. Verification FAILED!");
        }


    }
}
