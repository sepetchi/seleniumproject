package com.cydeo.tests.day2_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1_Etsy {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        driver.get("https://www.etsy.com");

        WebElement etsySearchBox = driver.findElement(By.name("search_query"));
        etsySearchBox.sendKeys("wooden spoon"+ Keys.ENTER);

        String expextedTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expextedTitle)){
            System.out.println("Title verification test Passed");

        }else {
            System.out.println("Title verification Failed");
        }


        }

    }

/*
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy”
 */