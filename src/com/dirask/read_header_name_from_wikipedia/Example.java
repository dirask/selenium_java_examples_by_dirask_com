package com.dirask.read_header_name_from_wikipedia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1366,768");

        String chromeDriverPath = "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver webDriver = new ChromeDriver(options);

        try {
            String filePath = "https://en.wikipedia.org/wiki/Java_(programming_language)";
            webDriver.get(filePath);

            WebElement element = webDriver.findElement(By.id("firstHeading"));
            System.out.println(element.getText()); // Java (programming language)
        } finally {
            webDriver.close();
            webDriver.quit();
        }
    }
}
