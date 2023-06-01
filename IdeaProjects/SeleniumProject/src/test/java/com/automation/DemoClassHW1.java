package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import java.time.Duration;

public class DemoClassHW1 {
    public static void main(String[] args)  {
        /*Open website https://www.saucedemo.com/
        Login with Valid Credentials & Navigates to the homepage
        Click on add to cart button of the first item
        Click on the cart icon and navigates to the cart page
        Click on the checkout button
        Fill in all the required details on the checkout page
        Click on the Continue button and navigates to the review order page
        Print the total amount from the review order page into the output
        Click on the Finish button
        Print confirmation message in the output*/

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement srhButton = driver.findElement(By.id("login-button"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        srhButton.click();
        WebElement addToCart = driver.findElement(By.xpath("//button[contains(@id,'backpack')]"));
        addToCart.click();
        WebElement cartIcon = driver.findElement(By.xpath("//a[contains(@class,'shopping_cart_link')]"));
        cartIcon.click();
        WebElement checkOut = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkOut.click();
        WebElement firstName = driver.findElement(By.id("first-name"));
        WebElement lastname = driver.findElement(By.id("last-name"));
        WebElement postalCode = driver.findElement(By.id("postal-code"));
        firstName.sendKeys("a");
        lastname.sendKeys("z");
        postalCode.sendKeys("08861");
        WebElement contButton = driver.findElement(By.id("continue"));
        contButton.click();
        WebElement totalAmount = driver.findElement(By.xpath("//div[contains(@class,'summary_info_label summary_total_label')]"));
        System.out.println(totalAmount.getText());
        WebElement finish = driver.findElement(By.id("finish"));
        finish.click();
        WebElement confMessage = driver.findElement(By.xpath("//div[contains(@class,'complete-text')]"));
        System.out.println(confMessage.getText());

    }
}
