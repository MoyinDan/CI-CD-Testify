package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6{
//Navigate to https://www.saucedemo.com/
//Login using username and password.
//Click on the login button,
//click on the "add to cart" button of any product (Add only one item)
//click the cart icon on the top right.
//Click on checkout.  USE ONLY CSS LOCATION STRATEGY
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ("webdriver.chrome.disableBuildCheck", "true");
        // Set the path to chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moyin\\Documents\\SeleniumIntro\\resources\\chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the website//
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);
        //Login using username and password.
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
        //Click on the login button,
        driver.findElement(By.cssSelector("input#login-button")).click();
        Thread.sleep(5000);
        //click on the "add to cart" button of any product (Add only one item)
        driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-bolt-t-shirt")).click();
        Thread.sleep(5000);
        //click the cart icon on the top right.
        driver.findElement(By.cssSelector("a.shopping_cart_link")).click();
        //Click on checkout.  USE ONLY CSS LOCATION STRATEGY
        driver.findElement(By.cssSelector("button#checkout")).click();


    }
}




