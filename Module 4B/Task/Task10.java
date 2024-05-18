package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Task10 {

    //Navigate to https://jqueryui.com/
    //click on the dialog menu from the left pane
    //click on the close icon to close the dialogue box in the middle


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.disableBuildCheck", "true");
        // Set the path to chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moyin\\Documents\\SeleniumIntro\\resources\\chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the website//
        driver.get(" https://jqueryui.com/");
        Thread.sleep(5000);
        //click on the dialog menu from the left pane
        driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[7]/a")).click();
        Thread.sleep(5000);
        //3. Click on the close icon to close the dialogue box in the middle
        WebElement iframe = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.cssSelector("button.ui-dialog-titlebar-close")).click();





    }
}
