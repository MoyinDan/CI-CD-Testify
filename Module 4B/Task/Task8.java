package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
    //Navigate to https://idorenyinankoh.github.io/loginPage/
    //check if the " create account" button is enabled"
    //fill all the fields
    //check if the "create account"is enabled

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.disableBuildCheck", "true");
        // Set the path to chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moyin\\Documents\\SeleniumIntro\\resources\\chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the website//
        driver.get("https://idorenyinankoh.github.io/loginPage/");
        //check if the " create account" button is enabled"
        driver.findElement(By.id("female")).click();
        boolean state = driver.findElement(By.cssSelector("button#create")).isEnabled();
       System.out.println(state);
       Thread.sleep(10000);
        //fill all the fields
        driver.findElement(By.id("firstName")).sendKeys("Mary");
        driver.findElement(By.id("lastName")).sendKeys("James");
        Thread.sleep(5000);
        driver.findElement(By.id("email")).sendKeys("james_dan@yopmail.com");
        Thread.sleep(5000);
        driver.findElement(By.id("password")).sendKeys("James#33");
        driver.findElement(By.id("confirmPass")).sendKeys("James#33");
        driver.findElement(By.id("xpLevel")).sendKeys("In am  dark in complexion");
        Thread.sleep(5000);
        driver.findElement(By.id("female")).click();
        boolean status = driver.findElement(By.cssSelector("button#create")).isEnabled();
        System.out.println(status);




    }
}
