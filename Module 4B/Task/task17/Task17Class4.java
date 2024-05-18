package org.selenium.task17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task17Class4 {
    //8. Navigate to the homepage and click on the Interactions tile
    //9. Assert that you are on the Interactions page


    WebDriver driver = null;

    @BeforeMethod
    public void openBrowser() {
        System.setProperty("webdriver.chrome.disableBuildCheck", "true");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moyin\\Documents\\SeleniumIntro\\resources\\chromedriver.exe");
        //launch browser
        driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void InteractionsPageNavigation() {
        //navigates to the url
        driver.get("https://demoqa.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        //click on the Interactions tile
        WebElement InteractionsTile = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[5]"));
        InteractionsTile.click();
        WebElement InteractionsHeader = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/span[1]/div[1]/div[1]"));
        String widgetPage = InteractionsHeader.getText();
        //Assert that you are on the Interactions page
        Assert.assertEquals(widgetPage, "Interactions");
        System.out.println("I am on the Interactions page");
    }

    @AfterClass
    public void quitBrowser() {
        driver.quit();
    }
}

