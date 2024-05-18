package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    //Navigate to https://www.saucedemo.com/
    //Login using username and password.
    //Click on the login button,
    //click on the "add to cart" button of any product (Add only one item)
    //click the cart icon on the top right.
    //Click on checkout.  USE ONLY XPATH LOCATION STRATEGY

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.disableBuildCheck", "true");
        // Set the path to chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moyin\\Documents\\SeleniumIntro\\resources\\chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the website//
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);
        //Login using username and password
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(5000);
        //Click on the "add to cart" button of any product
        driver.findElement(By.xpath("(//button[contains(@class, 'btn_inventory')])[1]")).click();
        Thread.sleep(5000);
        //Click the cart icon on the top right
        driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a")).click();
        Thread.sleep(5000);
        //Click on checkout
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
    }
}

