package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Task11 {
//Go to google.
//search for "testify ltd"
//Click on the search that result with www.testifyltd.com
//sroll down the testify website and click on the linkedIn icon.
//Get the description text on the userpage.(image; https://i.imgur.com/PmrWDXa.png )
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.disableBuildCheck", "true");
        // Set the path to chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moyin\\Documents\\SeleniumIntro\\resources\\chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        //Go to google
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(5000);
        //Search for testify ltd
        driver.findElement(By.id("APjFqb")).sendKeys("testify ltd");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/img[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).click();
        Thread.sleep(5000);
        //Click on the search that result with www.testifyltd.com
        driver.findElement(By.className("LC20lb")).click();
        Thread.sleep(5000);
        //Scroll down the testify website and click on the linkedIn icon.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5100)");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"widget_socials_1661936327_widget\"]/div/a[4]")).click();
        Thread.sleep(5000);
        //5. Get the description text on the userpage.(image; https://i.imgur.com/PmrWDXa.png )
        //driver.switchTo().alert().dismiss();
        Set<String> newWindow = driver.getWindowHandles();
        for (String window : newWindow) {
            driver.switchTo().window(window);
            Thread.sleep(5000);
            if (driver.getCurrentUrl().equalsIgnoreCase("https://www.linkedin.com/company/testifyorg")) {
                driver.findElement(By.cssSelector("[aria-hidden='false'] > [aria-modal] > [aria-label] [d]")).click();
                Thread.sleep(5000);
                String descriptionText = driver.findElement(By.xpath("//span[contains(text(),'We are into everything that has to do with Softwar')]")).getText();
                System.out.println("Description Text: " + descriptionText);
            }

        }


    }
}
