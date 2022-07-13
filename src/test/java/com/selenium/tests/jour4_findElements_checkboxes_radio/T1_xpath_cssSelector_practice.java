package com.selenium.tests.jour4_findElements_checkboxes_radio;

import com.selenium.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {


    public static void main(String[] args) {

        // DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        //Locate homeLink using cssSelector
        WebElement homeLink1 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //Locate homeLink using cssSelector syntax #2
        WebElement homeLink2 = driver.findElement(By.cssSelector("a.nav-link"));


        //

        //b. “Forgot password” header
        //c. “E-mail” text
        //d. E-mail input box
        //e. “Retrieve password” button
        //f. “Powered by Cydeo text
        //4. Verify all web elements are displayed.
    }

}
