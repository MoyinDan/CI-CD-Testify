package org.selenium.task18;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceCheckoutCompleteTest {

    WebDriver driver = null;

    @Test
    public void SauceCheckoutCompletePage() throws InterruptedException {
        System.setProperty("webdriver.chrome.disableBuildCheck", "true");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moyin\\Documents\\SeleniumIntro\\resources\\chromedriver.exe");
        //launch browser
        driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //navigate to the url
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);

        SauceCheckoutCompletePage checkoutComplete = new SauceCheckoutCompletePage(driver);
        checkoutComplete.getUsername().sendKeys("standard_user");
        checkoutComplete.getPassword().sendKeys("secret_sauce");
        Thread.sleep(5000);

        checkoutComplete.getLoginButton().click();
        checkoutComplete.getItemOne().click();
        checkoutComplete.getItemTwo().click();
        checkoutComplete.getCartIcon().click();

        Thread.sleep(5000);
        checkoutComplete.getCheckoutButton().click();
        checkoutComplete.getInputFirstName().sendKeys("Mary");
        checkoutComplete.getInputLastName().sendKeys("Daniel");
        checkoutComplete.getInputPostalCode().sendKeys("509876");
        checkoutComplete.getContinueButton().click();
        Thread.sleep(5000);

        //Click on the "Finish" button.
        checkoutComplete.getFinishButton().click();
        //Assert that user sees an success message "THANK YOU FOR YOUR ORDER".
        checkoutComplete.getCheckoutComplete();
        String successMessage = checkoutComplete.getSuccessMessage().getText();
        Assert.assertEquals(successMessage, "Thank you for your order!");

        System.out.println("Success message: " + successMessage);

        driver.quit();

    }
}


