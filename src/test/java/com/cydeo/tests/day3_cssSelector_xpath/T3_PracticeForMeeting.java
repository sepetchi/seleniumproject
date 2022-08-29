package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_PracticeForMeeting {
    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3- Verify “Log in” button text is as expected:
        WebElement LoginButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedLoginButton = "Log In";
        String actualLoginButton = LoginButton.getAttribute("value");
        System.out.println("LoginButton.isDisplayed() = " + LoginButton.isDisplayed());


        if (expectedLoginButton.equals(actualLoginButton)) {

            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        System.out.println(actualLoginButton);

        //Expected: Log In

    }
}
