package com.selenium.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H1 {
    public static void main(String[] args) throws InterruptedException {


        //TC #1: Etsy Title Verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        //accept permission cookies
        Thread.sleep(3000);
        WebElement cookies = driver.findElement(By.cssSelector("'wt-btn.wt-btn--filled.wt-mb-xs-0'"));
        cookies.click();

        //3. Search for “wooden spoon”
        WebElement googleSearchBox = driver.findElement(By.name("global-enhancements-search-query"));
        googleSearchBox.sendKeys("wooden spoon" + Keys.ENTER);

        //4. Verify title:
        //Expected: “Wooden spoon | Etsy”
        String expectedInTitle = "Wooden spoon - Etsy FR";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }

    }
}
