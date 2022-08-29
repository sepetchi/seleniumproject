package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {


        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

      //2- Go to: https://login1.nextbasecrm.com/
      driver.get("https://login1.nextbasecrm.com/");
     //3- Verify “Log in” button text is as expected:
      //Expected: Log In
        //WebElement signInButton = driver.findElement(By.className("login-btn"));
        // tagName[attribute='value']
        WebElement signInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));

        String expectedButtonText = "Log In";
        String actualButtonText =signInButton.getAttribute("value");
        System.out.println("actualButtonText = "+ actualButtonText);

        if (actualButtonText.equals(expectedButtonText)){
            System.out.println("Log In button verification passed");
        }else {
            System.out.println("Log In button verification passed ");
        }





    }
}
