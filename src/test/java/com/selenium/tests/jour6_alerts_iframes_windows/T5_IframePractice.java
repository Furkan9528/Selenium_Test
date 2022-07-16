package com.selenium.tests.jour6_alerts_iframes_windows;

import com.selenium.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_IframePractice {

    WebDriver driver;

    //@BeforeMethod
    @BeforeClass
    public void setupMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void multiple_windows_test(){

        //Storing the main page's windows handle as string
        // good practice for future re-usable purposes
        String mainHandle = driver.getWindowHandle();

        System.out.println("mainHandle = " + mainHandle);


        //4.Assert Title is "Windows"
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();

        //5. Click to : "Click Here" Link

        


    }

}
