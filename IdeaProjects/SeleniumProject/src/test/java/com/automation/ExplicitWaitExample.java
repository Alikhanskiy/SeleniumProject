package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample {
    public static void main(String[] args)  {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");//1

        WebElement start = driver.findElement(By.xpath("//div[@id='start']/button"));
        start.click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));//ImplicitWait example
        WebElement finish = driver.findElement(By.xpath("//div[@id='finish']/h4"));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(finish));

        System.out.println(finish.getText());
    }
}
