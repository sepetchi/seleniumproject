package com.cydeo.tests.day4_xPathAndCssSelector;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkboxes {
    public static void main(String[] args) throws InterruptedException {
       // 1. Go to http://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/checkboxes");
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));
        //2. Confirm checkbox #1 is NOT selected by default---expected false
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        //3. Confirm checkbox #2 is SELECTED by default. ----expected true
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());
        //4. Click checkbox #1 to select it.
        Thread.sleep(2000);
        checkbox1.click();

        //5. Click checkbox #2 to deselect it.

        Thread.sleep(2000);
        checkbox2.click();

        //6. Confirm checkbox #1 is SELECTED.
        //7. Confirm checkbox #2 is NOT selected.
        if(checkbox1.isSelected()== true){
            System.out.println("checkbox1 is selected");
            }else {
                System.out.println("checkbox2 is not selected");


            }
        }
    }

