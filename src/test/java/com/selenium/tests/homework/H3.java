package com.selenium.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H3 {

    public static void main(String[] args) {
        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        WebElement cookies = driver.findElement(By.xpath("//button[@id='L2AGLb']"));
        cookies.click();

        //3- Click to Gmail from top right.
        WebElement gmailText= driver.findElement(By.linkText("Gmail"));
        gmailText.click();

        //4- Verify title contains:
        //  Expected: Gmail
        String actualTitle = driver.getTitle();
        String expectedTitle = "Gmail";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("True Title");
        }else {
            System.out.println("False Title"+expectedTitle);
        }

        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //  Expected: Google
        String actualTitleM = "Google";
        String expectedTitleM = driver.getTitle();

        if(actualTitleM.equals(expectedTitleM)){
            System.out.println("True Title");
        }else {
            System.out.println("False Title");
        }
    }



}
