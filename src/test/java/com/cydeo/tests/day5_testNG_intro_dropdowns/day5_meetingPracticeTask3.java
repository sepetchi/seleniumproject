package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class day5_meetingPracticeTask3 {
    //TC #3: Utility method task for (continuation of Task2)

    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to https://practice.cydeo.com/radio_buttons

        driver.get("https://practice.cydeo.com/javascript_alerts");


        WebElement hockeyButton = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyButton.click();
        clickAndVerifyRadioButton(driver,"sport", "hockey");



    }
    public static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {

        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));

        for (WebElement each : radioButtons) {
            String eachId = each.getAttribute("id");

            if (eachId.equals(idValue)) {
                each.click();
                System.out.println(eachId + " is selected : " + each.isSelected());
                break;

                //3. Click to “Hockey” radio button
                //4. Verify “Hockey” radio button is selected after clicking.


            }
        }

    }}