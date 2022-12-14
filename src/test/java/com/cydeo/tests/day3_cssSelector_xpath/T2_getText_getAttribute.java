package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {

        //1-open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMELabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();
        if (actualRememberMeLabel.equals(expectedRememberMELabel)){
            System.out.println("test PASSED");
        }else {
            System.out.println("test FAiLED");
        }

        WebElement forgotPasswordLinkText = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPasswordLinkText =" Forgot your password?";
        String actualForgotPasswordLinkText = forgotPasswordLinkText.getText();

        if (actualForgotPasswordLinkText.equals(expectedForgotPasswordLinkText)){
            System.out.println("Forgot password link verification Passed");
        } else {
            System.out.println("Forgot password link verification Failed!");
        }


    }
}
/*
1- Open a chrome browser

3
4- Verify “forgot password” link text is as expected:
Expected: Forgot your password?
5- Verify “forgot password” href attribute’s value contains expected:
Expected: forgot_password=yes
 */
