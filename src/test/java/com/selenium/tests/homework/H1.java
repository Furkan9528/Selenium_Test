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
        Thread.sleep(1000);
        WebElement cookies = driver.findElement(By.cssSelector("button.wt-btn.wt-btn--filled.wt-mb-xs-0"));
        cookies.click();

        //3. Search for “wooden spoon”
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("wooden spoon" + Keys.ENTER);

        //4. Verify title:
        //Expected: “Wooden spoon | Etsy”
        String actualTitle = "Wooden spoon - Etsy FR";
        String expectedTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("True Title");
        }else{
            System.out.println("False Title");
        }

    }
}
