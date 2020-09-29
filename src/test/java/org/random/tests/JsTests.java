package org.random.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JsTests {

    static WebDriver driver;

    @Test
    void randomNumberAreNotRepeatedTest() {

        System.setProperty("webdriver.chrome.driver", "libs/chrome/chromedriver");
        driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://yahoo.com");

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        WebElement mailLink =
                (WebElement) jsExecutor.executeScript("return document.getElementById('header-mail-button')");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.cssSelector("//*[@id='header-mail-button']")));
        mailLink.click();

    }

    @AfterAll
    static void AfterAll() {
        driver.quit();
    }
}
