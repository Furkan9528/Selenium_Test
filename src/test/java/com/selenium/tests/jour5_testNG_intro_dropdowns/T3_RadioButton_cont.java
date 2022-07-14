package com.selenium.tests.jour5_testNG_intro_dropdowns;

import com.selenium.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_cont {

    public static void main(String[] args) {

        //TC #3: Utility method task for (continuation of Task2)
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        //Locate name='sports' radio buttons and store then in a List of Web Element
        List<WebElement> sportRadioButtons = driver.findElements(By.name("sport"));

        //Loop through the Lisst of WebElement and select matching result "hockey"
        for(WebElement each: sportRadioButtons){

            String eachId = each.getAttribute("id");

            System.out.println("eachId = " + eachId);

            if(eachId.equals("hockey")){

                each.click();
                System.out.println("Hockey is selected : " + each.isSelected());
                break;

            }

        }

        //3. Click to “Hockey” radio button
        WebElement hockeyRadioBtn = driver.findElement(By.xpath("//input[@id='hockey']"));

        //4. Verify “Hockey” radio button is selected after clicking.


    }

}
