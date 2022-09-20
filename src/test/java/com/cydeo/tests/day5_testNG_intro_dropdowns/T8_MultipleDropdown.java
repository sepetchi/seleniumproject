package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T8_MultipleDropdown {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void multipleDropdowns() {
        List<WebElement> options = driver.findElements(By.xpath("//select[@name='Languages']/option"));

        for (WebElement option : options) {
            option.click();
            System.out.println(option.getText());
        }
    }

    @Test
    public void optionsTest() throws InterruptedException {

        //3. Select all the options from multiple select dropdown.
        Select select = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        List<WebElement> options = select.getOptions();
        //4. Print out all selected values.
        for (WebElement each : options) {

            each.click();
            System.out.println("Language Options= " + each.getText());

        }
        Thread.sleep(3000);
        select.deselectAll();

    }
}
