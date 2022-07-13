package com.selenium.tests.jour1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {

    public static void main(String[] args) throws InterruptedException {


        //TC #5: getText() and getAttribute() method practice
        //1. Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to https://pratice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //3. Verify header text is as expected:
        WebElement headerText = driver.findElement(By.tagName("h2"));

        Thread.sleep(3000);
        //Expected: Registration form
        String expectedHeaderText = "Registration form";
        String actualHeaderText = headerText.getText(); // will return "Registration form" as String

        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header text verification PASSED!");
        }else{
            System.out.println("Header text verification FAILED!!");
        }

        Thread.sleep(3000);
        //4. Locate "First nameé input box
        // we are locationg the web element using "name" locator
        // name attribute has "firstname" value
        WebElement firstNamInput = driver.findElement(By.name("firstname"));

        //5. Verify placeholder attribute's value is as expected: Expected: first name
        // Expected: first name
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder =  firstNamInput.getAttribute("placeholder");

        if(actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("Placeholder text verification PASSED!");
        }else{
            System.out.println("Placeholder text verification FAILED!!");
        }

        //driver.close();

    }

}
