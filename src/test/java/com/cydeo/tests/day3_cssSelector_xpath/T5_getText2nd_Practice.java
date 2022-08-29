package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_getText2nd_Practice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement loginSpace = driver.findElement(By.cssSelector("input[class='login-inp']"));
        loginSpace.sendKeys("incorrect");
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));
        resetPasswordButton.click();

        WebElement errorText = driver.findElement(By.cssSelector("div[class='errortext']"));

        String expectedErrorText = "Login or E-mail not found";
        String actualErrorText = errorText.getText();
        if (expectedErrorText.equals(actualErrorText)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }


    }
}
/*
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Enter incorrect username into login box:
4- Click to `Reset password` button
5- Verify “error” label is as expected
Expected: Login or E-mail not found

 */