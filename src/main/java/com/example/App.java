package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Maven Selenium - SauceDemo Login
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        
        // Initialize and setup
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Navigate
        driver.get("https://www.saucedemo.com/");
        
        // Login credentials (from inspect)
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        
        // Verify success (pause)
        Thread.sleep(5000);
        driver.quit();
        
        System.out.println("✓ SauceDemo Login Successful!");
    }
}

