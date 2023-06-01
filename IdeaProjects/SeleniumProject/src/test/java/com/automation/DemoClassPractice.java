package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DemoClassPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        //Search with keyword Laptop and click on search button
        WebElement searchBtn = driver.findElement(By.id("twotabsearchtextbox"));
        searchBtn.sendKeys("ipad");
        WebElement clickSrch = driver.findElement(By.id("nav-search-submit-button"));
        clickSrch.click();

        List<WebElement> listOfPrice = driver.findElements(By.xpath("//span[@class='a-price']"));

        for(WebElement price : listOfPrice){
            System.out.println(price.getText());
        }
        
    }
}
