package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;



public class Demoqa {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        WebElement button = driver.findElement(By.cssSelector("h5"));
        button.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement buttonElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='/links']")));
        buttonElement.click();
        WebElement linkTab = driver.findElement(By.id("dynamicLink"));
        linkTab.click();
        driver.quit();

    }
}
