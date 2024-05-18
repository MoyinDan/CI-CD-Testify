package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class Task7 {
    //Navigate to https://worldweather.wmo.int/en/home.html.
    //Search for your city in the search field. When the result loads,
    // print the days and weather description for each of the days shown in a readable and understandable manner.
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.disableBuildCheck", "true");
        // Set the path to chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moyin\\Documents\\SeleniumIntro\\resources\\chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the website//
        driver.get("https://worldweather.wmo.int/en/home.html.");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/ul/li[1]/a")).click();
        Thread.sleep(5000);
        //Search for your city in the search field.
       // driver.findElement(By.cssSelector("q_search")).sendKeys("Abilene, Texas, United States of America");
        driver.findElement(By.xpath("//*[@id=\"q_search\"]")).sendKeys("Abilene, Texas, United States of America");
        Thread.sleep(5000);
        //Search Buttom
        driver.findElement(By.xpath("//*[@id=\"searchForm\"]/input[3]")).click();
        Thread.sleep(5000);

       // System.out.println(driver.findElement(By.className("col-7 city_right_side")).getText());

        String names = driver.findElement(By.className("city_forecast_day_object")).getText();
//        System.out.println(names + "    ");
        System.out.print(names.substring(7,10) + " " + names.substring(16,29));

       // driver.findElement(By.name("password")).sendKeys("secret_sauce");
        //System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[2]/div[1]/div")));

    }
}

