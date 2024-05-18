package org.selenium.task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceCheckoutTest {

    WebDriver driver = null;

    @Test
    public void SauceCheckoutTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.disableBuildCheck", "true");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moyin\\Documents\\SeleniumIntro\\resources\\chromedriver.exe");
        //launch browser
        driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //navigate to the url
        driver.get("https://www.saucedemo.com/");

        SauceCheckoutPage checkout = new SauceCheckoutPage(driver);
        checkout.getUsername().sendKeys("standard_user");
        checkout.getPassword().sendKeys("secret_sauce");
        checkout.getLoginButton().click();
        checkout.getItemOne().click();
        checkout.getItemTwo().click();
        checkout.getCartIcon().click();
        Thread.sleep(5000);

        //Click on the checkout button
        checkout.getCheckoutButton().click();
        //Input first name last name and postal code and click on continue.
        checkout.getInputFirstName().sendKeys("Mary");
        checkout.getInputLastName().sendKeys("Daniel");
        checkout.getInputPostalCode().sendKeys("509876");
        checkout.getContinueButton().click();

        Thread.sleep(5000);
        //Assert that the item showed on the CHECKOUT: OVERVIEW page is the item that was added to cart from the first page.
        checkout.getCheckoutOverview();
        String cartItemOneName = checkout.getCartItemOne().getText();
        String cartItemTwoName = checkout.getCartItemTwo().getText();
        Assert.assertEquals(cartItemOneName, "Sauce Labs Backpack");
        Assert.assertEquals(cartItemTwoName, "Sauce Labs Bolt T-Shirt");

        Thread.sleep(5000);

        System.out.println("Sauce Labs Backpack");
        System.out.println("Sauce Labs Bolt T-Shirt");

        driver.quit();

    }
}
