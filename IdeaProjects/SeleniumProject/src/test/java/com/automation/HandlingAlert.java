package com.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        WebElement button = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        button.click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Hello");
        Thread.sleep(3000);
        alert.accept();//Ok button
         //alert.dismiss();//cancel button


    }
}
