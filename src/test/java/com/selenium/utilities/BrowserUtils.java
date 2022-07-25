package com.selenium.utilities;

public class BrowserUtils {

    /*
    This method will accept int (in seconds) and execute Thread.sleep
    for given duration
    */



    public void sleep ( int second ){
        second += 1000;

        try{
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }

}
