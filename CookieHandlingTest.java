package com.selenium.demo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CookieHandlingTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
    }

    @Test(priority = 1)
    public void getAllCookies() {
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("Total cookies: " + cookies.size());
        for (Cookie c : cookies) {
            System.out.println(c.getName() + " => " + c.getValue());
        }
        Assert.assertNotNull(cookies, "Cookie set should not be null");
        Assert.assertTrue(cookies.size() >= 0, "Cookie size should be non-negative");
    }

    @Test(priority = 2)
    public void addCookie() {
        Cookie myCookie = new Cookie("testUser", "Sindhuja123");
        driver.manage().addCookie(myCookie);

        Cookie fetched = driver.manage().getCookieNamed("testUser");
        Assert.assertNotNull(fetched, "Added cookie must be retrievable");
        Assert.assertEquals(fetched.getValue(), "Sindhuja123",
                "Cookie value should match what was added");
    }

    @Test(priority = 3)
    public void deleteSingleCookie() {
        driver.manage().deleteCookieNamed("testUser");
        Assert.assertNull(driver.manage().getCookieNamed("testUser"),
                "Deleted cookie must not exist");
    }

    @Test(priority = 4)
    public void deleteAllCookies() {
        driver.manage().deleteAllCookies();
        Assert.assertEquals(driver.manage().getCookies().size(), 0,
                "All cookies should be deleted");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}