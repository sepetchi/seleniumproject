package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButtonCont {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(" https://practice.cydeo.com/radio_buttons");
        // locate name='sports' radio button and store them in a List of Web Element
        String idValue = "";
        String football = "football";
        clickAndVerifyRadioButton(driver, "sport","hockey");

    }

    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {
        List<WebElement> sportRadioButtons = driver.findElements(By.name("sport"));


        for (WebElement each : sportRadioButtons) {
            String eachId = each.getAttribute("id");
            System.out.println("eachId= " + eachId);

            if (eachId.equals(idValue)) {

                each.click();
                System.out.println("hockey is selected: " + each.isSelected());
                break;
            }
        }
    }
}