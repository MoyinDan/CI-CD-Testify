package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {

    //Navigate to saucedemo.com
    //Login with username and password
    //navigate back to login screen from the homepage
    //print out the Login button attribut "VALUE" to verify that you are back on the login screen
    //navigate forward to the homepage, print out a name of a product to verify that you are back on the homepage
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.disableBuildCheck", "true");
        // Set the path to chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moyin\\Documents\\SeleniumIntro\\resources\\chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the website//
        driver.get("http://saucedemo.com/");
        //Login with username and password
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
        //Click on the login button,
        driver.findElement(By.cssSelector("input#login-button")).click();
        Thread.sleep(5000);
        //navigate back to login screen from the homepage
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        //print out the Login button attribut "VALUE" to verify that you are back on the login screen
        String valueAttributeParameter = driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getAttribute("value");
        System.out.println(valueAttributeParameter);
        //navigate forward to the homepage,
        Thread.sleep(5000);
        driver.navigate().forward();
        // print out a name of a product to verify that you are back on the homepage
       String productName = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
        System.out.println(productName);


    }
}
