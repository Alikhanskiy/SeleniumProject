package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoPracticeIframe {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        WebElement iFrame = driver.findElement(By.id("mce_0_ifr"));
        //Switch to frame
        driver.switchTo().frame(iFrame);

        WebElement input = driver.findElement(By.xpath("//body[@id='tinymce']"));
        input.clear();
        input.sendKeys("What's up?");
        driver.switchTo().defaultContent();
        WebElement text = driver.findElement(By.xpath("//h3"));

        System.out.println(text.getText());

    }
}
