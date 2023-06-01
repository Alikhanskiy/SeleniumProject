package com.automation;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class DamnPractice {
    public static void main(String[] args)  {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.co.uk/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));


    }
}