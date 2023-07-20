package com.first_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_selenium {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sweta\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");

    }
}
