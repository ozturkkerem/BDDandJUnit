package com.herokuapp.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Driver {

    public static void main(String[] args) {

    }


    private Driver() {

    }

    private static WebDriver driver;


    public static WebDriver get() {


        if (driver == null) {


            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        }
        return driver;
    }


    public static void closeDriver() {
        if (driver != null) {

            driver.quit();
            driver = null;
        }
    }


}
