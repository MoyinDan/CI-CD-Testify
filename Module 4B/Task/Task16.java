package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Task16 {
    //Navigate to https://testifyltd.com/ .
    //Assert that the Our contact column at the footer of the homepeage has the follwing correct details, EMAIL: info@testifyltd.co.uk
    //LOCATION: Nigeria
    //PHONE: (+234)904-882-0971

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
    public void verifyEmailDetail() {
        driver.get("https://testifyltd.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5100)");
        //System.out.println("Scrolled to the bottom of the page");
        //Hard assert
        WebElement emailDetail = driver.findElement(By.xpath("//div[@class='footer-col']//p[contains(text(),'EMAIL')]"));
        String email = emailDetail.getText();
        Assert.assertEquals(email, "EMAIL: info@testifyltd.co.uk");
        System.out.println("Email correct");
    }

    @Test
    public void verifyLocationDetail() {
        //Soft assert
        WebElement locationDetail = driver.findElement(By.xpath("//body/div[1]/div[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/p[1]/span[1]/span[1]/strong[1]"));
        String location = locationDetail.getText();
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(location, "LOCATION: Nigeria");
        System.out.println("Correct Location");
        sa.assertAll();
    }

    @Test
    public void verifyPhoneNumberDetail() {
        //Hard assert
        WebElement phoneNumberDetail = driver.findElement(By.xpath("//body/div[1]/div[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/p[1]/span[1]/span[1]/strong[1]"));
        String phoneNumber = phoneNumberDetail.getText();
        Assert.assertEquals(phoneNumber, "PHONE: (+234)904-882-0971");
        System.out.println("Phone number correct");
    }

    @AfterClass
    public void quitBrowser() {
        driver.quit();
        System.out.println("Quit Browser");
    }
}

