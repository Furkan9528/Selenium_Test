package com.selenium.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H4 {

    public static void main(String[] args) {

        //TC #4: Class locator practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();

        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        //3- Click to “Home” link
        WebElement homeLink =  driver.findElement(By.linkText("Home"));
        homeLink.click();

        //4- Verify title is as expected:
        //Expected: Practice
        String actualTitle = "Practice";
        String expectedTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title PASSED !");
        }else{
            System.out.println("Title FALSE !");
        }




    }

}
