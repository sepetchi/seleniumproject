package com.cydeo.tests.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    //This method will accept int(in seconds) and execute Thread.sleep for given duration

    public void sleep(int second) throws InterruptedException {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
        }

    }


    public static void switchWindowAndVerify(WebDriver driver, String expectedInURL, String expectedInTitle){
        Set<String> allWindowsHandles = driver.getWindowHandles();

        for (String each : allWindowsHandles) {
            driver.switchTo().window(each);
            System.out.println("current URL: " + driver.getCurrentUrl());
            if (driver.getCurrentUrl().contains(expectedInURL)) {
                break;
            }
        }
        //5. Assert: Title contains “expectedInTitle”
        //Lines to be pasted:
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }
    //this method accepts a string "expectedTitle" and Asserts if it is true
    public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }
}

