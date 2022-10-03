package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void task4_and_task5(){
        //TC: scroll practice
        //1-Open a Chrome browser
        //2-go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");
        //3- Scroll down to "Powered by CYDEO"
        //create object Actions and pass our "Driver" instance
        Actions actions =new Actions(Driver.getDriver());

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        //4-Scroll using Actions class "moveTo(element)" method
        actions.moveToElement(cydeoLink).perform();

        //5-Scroll back up to "Home" link PageUp
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();

        Driver.getDriver().quit();


    }
    @Test
    public  void test2(){
        Driver.getDriver().get("https://practice.cydeo.com/");
    }
}
