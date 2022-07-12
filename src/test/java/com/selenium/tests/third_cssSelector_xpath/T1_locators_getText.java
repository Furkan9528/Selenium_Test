package com.selenium.tests.third_cssSelector_xpath;

import com.selenium.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {

    public static void main(String[] args) {


        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a chrome browser
        // WebDriverManager.chromedriver().setup();
        // WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("firefox");

        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        WebElement inputUsername = driver.findElement(By.className("login-inp"));
        inputUsername.sendKeys("incorrect");


        //4- Enter incorrect password: “incorrect”
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("fhgfhg");


        //5- Click to log in button.
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));


        String expectedErrorMeesage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();

        if(actualErrorMessage.equals(expectedErrorMeesage)){
            System.out.println("error messagfe verificaiton PASSED!");
        }else{
            System.out.println("error message verification FAILED!!");
        }


    }

}
