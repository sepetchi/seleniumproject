package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get(" https://login1.nextbasecrm.com/?forgot_password=yes");

        //WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn"));

        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));
        System.out.println(resetPasswordButton);
        String expectedResetPasswordButtonText = "Reset password";
        String actualResetPasswordButtonText = resetPasswordButton.getText();
        if (actualResetPasswordButtonText.equals(expectedResetPasswordButtonText)){
            System.out.println("Button text verification PASSED");
        }else System.out.println("Button text verification FAILED");
    }
}
/*
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Verify “Reset password” button text is as expected:
Expected: Reset password

 */