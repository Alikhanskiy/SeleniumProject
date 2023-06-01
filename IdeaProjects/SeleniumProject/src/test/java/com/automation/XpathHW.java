package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathHW {
    public static void main(String[] args) {
        /*Task 1 : Write a XPath from the attached HTML document
        Find all child of the bookstore that is not a book
        Find all the book that doesn't have a publication year
        Find the cost of the book that has the title "Learning XML"
        Find the publication of the book that has a price of "45.95"*/

        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/alikhanzhanbyrbayev/Downloads/Demo.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        WebElement notBook = driver.findElement(By.xpath("//bookstore/*[not(self::book)]"));
        WebElement noYear = driver.findElement(By.xpath("//book[not(year)]"));
        WebElement priceLX = driver.findElement(By.xpath("//title[text()='Learning XML']/following-sibling::price"));
        WebElement pubLCTN = driver.findElement(By.xpath("//book[price='45.95']/publication"));
            







    }
}
