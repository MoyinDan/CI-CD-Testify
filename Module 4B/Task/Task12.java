package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task12 {
    //Navigate to https://jqueryui.com/
    //.click on the "resize" menu from the left pane
    //Drag the box to be bigger.(Resixe the box to be bigger)

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.disableBuildCheck", "true");
        // Set the path to chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moyin\\Documents\\SeleniumIntro\\resources\\chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        //navigate to the url
        driver.navigate().to("https://jqueryui.com/");
        Thread.sleep(5000);
        //click on the "resize" menu from the left pane
        driver.findElement(By.xpath("//a[contains(text(),'Resizable')]")).click();
        Thread.sleep(5000);
        //Drag the box to be bigger.(Resize the box to be bigger)
        driver.switchTo().frame(0);
        Thread.sleep(5000);
        // Find the resizable box
        WebElement resizableBox = driver.findElement(By.cssSelector("#resizable"));
        // Perform resize action by dragging the box to make it bigger
        Actions actions = new Actions(driver);
        actions.clickAndHold(resizableBox).moveByOffset(100, 100).release().build().perform();

    }
}