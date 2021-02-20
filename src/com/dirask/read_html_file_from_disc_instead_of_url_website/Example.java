package com.dirask.read_html_file_from_disc_instead_of_url_website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * If you run this example on windows put entire project in this dir:
 * C:/projects/selenium_java_examples_by_dirask_com/
 * or modify below absolute filePath
 */
public class Example {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1366,768");

        String chromeDriverPath = "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver webDriver = new ChromeDriver(options);

        try {
            // modify location of the file, according to your project location
            String filePath = "file:///" +
                    "C:/projects/selenium_java_examples_by_dirask_com/" +
                    "src/com/dirask/read_html_file_from_disc_instead_of_url_website/" +
                    "example.html";
            webDriver.get(filePath);

            WebElement element = webDriver.findElement(By.id("test-id"));
            System.out.println(element.getText()); // Test
        } finally {
            webDriver.close();
            webDriver.quit();
        }
    }
}
