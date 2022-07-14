package com.selenium.tests.jour4_findElements_checkboxes_radio;

import com.selenium.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class T5_checkboxes {

    public static void main(String[] args) {

        // Practice: Checkboxes
        //1. Go to http://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/checkboxes");

        //2. Confirm checkbox #1 is NOT selected by default

        //3. Confirm checkbox #2 is SELECTED by default.
        //4. Click checkbox #1 to select it.
        //5. Click checkbox #2 to deselect it.
        //6. Confirm checkbox #1 is SELECTED.
        //7. Confirm checkbox #2 is NOT selected.

    }



}
