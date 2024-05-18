package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Task14 {
    //Navigate to https://www.toolsqa.com/
    //close the dialogue box that pops up after a few seconds
    //Click on the tutorial button on the top left corner of the page

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.disableBuildCheck", "true");
        // Set the path to chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moyin\\Documents\\SeleniumIntro\\resources\\chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        //maximize browser
        driver.manage().window().maximize();
        //using implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //navigate to the url
        driver.get("https://www.toolsqa.com/ ");
        //using explicit wait
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='accept-cookie-policy']")));
        //close the dialogue box that pops up after a few seconds
        driver.findElement(By.xpath("//button[@id='accept-cookie-policy']")).click();
        //wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Tutorials')]")));
        //Click on the tutorial button in the top left corner of the page
        driver.findElement(By.xpath("//span[contains(text(),'Tutorials')]")).click();

    }
}

