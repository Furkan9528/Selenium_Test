package com.selenium.tests.jour6_alerts_iframes_windows;

import com.selenium.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //TC #5: Selecting state from State dropdown and verifying result
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to http://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }


    @Test
    public void dropdown_task5() throws InterruptedException {



        //we located the dropdwon and it is ready to use
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois
        //Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Illinois");

        //4. Select Virginia
        //Thread.sleep(2000);
        stateDropdown.selectByValue("VA");

        //5. Select California
        //Thread.sleep(2000);
        stateDropdown.selectByIndex(5);

        //6. Verify final selected option is California.
        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText, expectedOptionText);
        //Use all Select options. (visible text, value, index)
    }

    @Test
    public void dropdown_task(){


    }





}
