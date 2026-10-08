package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");
            System.out.println(driver.getTitle());
            WebElement textInput = driver.findElement(By.id("my-text-id"));
            System.out.println(textInput.getTagName());
            textInput.sendKeys("Selenium");
            System.out.println(textInput.getDomProperty("value"));
            WebElement textArea = driver.findElement(By.name("my-textarea"));
            System.out.println(textArea.getTagName());
            WebElement button = driver.findElement(By.cssSelector("button"));
            System.out.println(button.getTagName());
            List<WebElement> inputs = driver.findElements(By.cssSelector("input"));
            System.out.println(inputs.size());

            List<WebElement> options = driver.findElements(By.cssSelector("option"));
            System.out.println("option: " + options.size());
            for (WebElement option : options) {
                System.out.println(option.getText());
            }

            List<WebElement> labels = driver.findElements(By.cssSelector("label"));
            System.out.println("Labels: " + labels.size());
            for (WebElement label : labels) {
                System.out.println(label.getText());
            }
            System.out.println("Before click");
            button.click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement heading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1")));
            System.out.println(heading.getText());
        } finally {
            driver.quit();
        }
    }
}