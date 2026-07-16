package com.selenium.demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleLinksTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
    }

    @Test
    public void printAndValidateLinks() {
        List<WebElement> links = driver.findElements(By.tagName("a"));

        int totalLinks = links.size();
        System.out.println("Total number of links on Google page: " + totalLinks);

        
        int index = 1;
        for (WebElement link : links) {
            String text = link.getText().trim();
            if (!text.isEmpty()) {
                System.out.println(index++ + ". " + text);
            }
        }

        Assert.assertNotNull(links, "Links list should not be null");
        Assert.assertTrue(totalLinks > 0, "Google page must contain at least one link");
        Assert.assertEquals(driver.getTitle(), "Google", "Page title must be 'Google'");
        Assert.assertTrue(driver.getCurrentUrl().contains("google.com"),
                          "URL must contain google.com");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}