package com.cydeo.tests.day4_xPathAndCssSelector;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T4_findElements {
    public static void main(String[] args) {
       // TC #4: FindElements Task
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");
        //3- Locate all the links in the page.

        //shortcut for windows= alt+enter--> press enter again
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        //4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());

        //5- Print out the texts of the links.
        //6- Print out the HREF attribute values of the links
        for (WebElement each : allLinks) {
            System.out.println("Text of link: "+each.getText());
            System.out.println("HREF values: "+ each.getAttribute("href"));

        }
    }


    }

