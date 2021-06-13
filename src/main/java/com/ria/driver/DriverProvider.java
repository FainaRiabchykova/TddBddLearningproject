package com.ria.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverProvider {

    private static WebDriver driver;
    private DriverProvider() {
    }
    public static WebDriver getDriver() {

        if (null == driver) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

    public static void closeDriver() {

            driver.quit();
            driver = null;

    }
}
