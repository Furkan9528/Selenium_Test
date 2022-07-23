package com.selenium.tests.jour1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {


    public static void main(String[] args) throws InterruptedException {


        //1- Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        //3- Test if driver is working as expected
        driver.get("https://www.tesla.com");

        //Stop code execution for 3 second
        Thread.sleep(3000);

        // use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 3 second
        Thread.sleep(3000);

        // use selenium to navigate forward
        driver.navigate().forward();

        //Stop code execution for 3 second
        Thread.sleep(3000);

        // use selenium to navigate refresh
        driver.navigate().refresh();

        //Stop code execution for 3 second
        Thread.sleep(3000);

        // use navigate().to():
        driver.navigate().to("https://www.google.com");

        //get the title of the page
        //System.out.println(driver.getTitle());

        String currentTitle = driver.getTitle();
        System.out.println(currentTitle);


        //Get the current URL using Selenium
        String currentURL = driver.getCurrentUrl();

        System.out.println(currentURL);

        //This line will maximize the browser size
        driver.manage().window().maximize();

        //driver.manage().window().fullscreen();

        //this will close the currently opened windows
        driver.close();

        //this will close all of the opened windows
        driver.quit();



    }

}
