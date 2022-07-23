package com.selenium.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H2 {


    public static void main(String[] args) {

        //TC #1: Etsy Title Verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        WebElement headerText = driver.findElement(By.tagName("h3"));

        String actualTitle = "Log in to ZeroBank";
        String expectedTitle = headerText.getText();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("True Title");
        }else{
            System.out.println("False Title");
        }

    }


}
