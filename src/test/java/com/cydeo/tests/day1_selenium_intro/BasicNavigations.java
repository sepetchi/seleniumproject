package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //1- Set up the browser driver
        WebDriverManager.chromedriver().setup();
        //2- Create instance of the Selenium WebDriver
        //This is the line opening an empty browser
        WebDriver driver = new ChromeDriver();
        //this line will maximize the browser size
        driver.manage().window().maximize();

      // driver.manage().window().fullscreen();

        driver.get("https://www.tesla.com");

        //get the title of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


        //stop code execution for 3 seconds
        Thread.sleep(3000);

        // use Selenium to navigate forward
        driver.navigate().forward();

        //use selenium to navigate refresh
        driver.navigate().refresh();

        Thread.sleep(3000);

        //use navigate().to():
        driver.navigate().to("https://www.google.com");
        //get the title of the page

        System.out.println("title of the page: "+ driver.getTitle());

        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);
        // it only closes the current opened window
        driver.close();
        // it closes all of the opened windows
        driver.quit();



    }
}
