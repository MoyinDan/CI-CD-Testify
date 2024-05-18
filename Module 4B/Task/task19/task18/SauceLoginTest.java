package org.selenium.task19.task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SauceLoginTest {

    WebDriver driver = null;

    @Test
    public void sauceLogin() {
        System.setProperty("webdriver.chrome.disableBuildCheck", "true");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moyin\\Documents\\SeleniumIntro\\resources\\chromedriver.exe");
        //launch browser
        driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //navigate to the url
        driver.get("https://www.saucedemo.com/");

        SauceLoginPage login = new SauceLoginPage(driver);

        login.getUsername().sendKeys("standard_user");
        login.getPassword().sendKeys("secret_sauce");
        login.getLoginButton().click();

        driver.quit();
    }
}

