package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    //Navigate to http://demo.guru99.com/
    //Click on the security Project menu.
    // Input any text in the email and password field

        public static void main(String[] args) throws InterruptedException {
            System.setProperty ("webdriver.chrome.disableBuildCheck", "true");
            // Set the path to chromedriver
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\moyin\\Documents\\SeleniumIntro\\resources\\chromedriver.exe");

            // Launch Chrome browser
            WebDriver driver = new ChromeDriver();

            // Navigate to the website//
            driver.get("http://demo.guru99.com/");
            //Click on the security Project menu.
            driver.findElement(By.linkText("Security Project")).click();
            //Close the advert tab
            driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]/div/span")).click();

            // Input any text in the email
            Thread.sleep(10000);
            driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("glorymabel@gmail.com");
            Thread.sleep(10000);
            //Input any element in password field.
            driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Gmabel99#");


            // Close the browser
            //driver.quit();
        }
    }



