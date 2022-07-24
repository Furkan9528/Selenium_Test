package com.selenium.tests.day7_webtable_utilities_javafaker;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T1_WindowsHandling {

    public WebDriver driver;


    @BeforeMethod
    public void setupMethod(){



    }


    @Test
    public void window_handling_test(){
        //2. Go to : https://www.amazon.com
        //3. Copy paste the lines from below into your class
        //4. Create a logic to switch to the tab where Etsy.com is open
        //5. Assert: Title contains “Etsy”
        // ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        // ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        // ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

    }





}
