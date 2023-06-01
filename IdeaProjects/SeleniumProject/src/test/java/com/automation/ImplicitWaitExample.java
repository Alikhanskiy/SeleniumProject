package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.minted.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement emailAd = driver.findElement(By.xpath("//input[@placeholder='Email address']"));
        emailAd.sendKeys("Hello,I got you");
    }
}
