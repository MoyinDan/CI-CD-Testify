package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebookWebsite {


        public static void main(String[] args) {
            System.setProperty ("webdriver.chrome.disableBuildCheck", "true");
            // Set the path to chromedriver
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\moyin\\Documents\\SeleniumIntro\\resources\\chromedriver.exe");

            // Launch Chrome browser
            WebDriver driver = new ChromeDriver();

            // Navigate to the first website
            driver.get("https://www.facebook.com");

            // Close the browser
            //driver.quit();
        }
    }

