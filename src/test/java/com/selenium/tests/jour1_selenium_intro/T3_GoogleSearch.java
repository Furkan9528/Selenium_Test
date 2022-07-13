package com.selenium.tests.jour1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {

    public static void main(String[] args) {

        //TC #3: Google search
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://www.google.com");

        //accept permission cookies
        WebElement cookies = driver.findElement(By.xpath("//div[.='Tümünü kabul et']"));
        cookies.click();

        //3- Write "apple" in search box
        //4- PRESS ENTER using Keys.ENTER
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple" + Keys.ENTER);

        //5- Verify title
        //Expected: Title should start with "apple" word
        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }






        //6- Verify title equals
        //Expected: Practice




    }
}
