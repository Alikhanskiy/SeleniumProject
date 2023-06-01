package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutorExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        //driver.manage().window().maximize();
        WebElement dropdown = driver.findElement(By.id("gh-cat"));
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        WebElement searchButton = driver.findElement(By.xpath("//input[@id='gh-btn']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border = 'thick solid red';", dropdown);
        js.executeScript("arguments[0].style.border = 'thick solid red';", searchBox);
        js.executeScript("arguments[0].style.border = 'thick solid red';", searchButton);
        //style.border = 'thick solid #0000FF';


    }
}
