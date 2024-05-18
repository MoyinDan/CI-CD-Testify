package org.selenium.task19.task17;

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

public class Task17Class1 {
    //Navigate to the homepage and click on the Elements tile
    //Assert that you are on the Elements page


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

    @Test(groups = "homepage")
    public void verifyUserIsOnHomePage() throws InterruptedException {

        //navigates to the url
        driver.get("https://demoqa.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Verify User is On the Home Page
        String currentPageUrl = driver.getCurrentUrl();

        // Verification logic
        String expectedUrl = "https://demoqa.com/";

        Assert.assertEquals(currentPageUrl, expectedUrl, "User is on HomePage");

        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(4000);
        WebElement elementsTile = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
        elementsTile.click();
        WebElement elementHeader = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]"));
        String elementsPage = elementHeader.getText();
        //Assert that you are on the Elements page
        Assert.assertEquals(elementsPage, "Elements");
        System.out.println("I am on the Elements page");
    }


    @AfterClass
    public void quitBrowser() {
        driver.quit();
    }

}
