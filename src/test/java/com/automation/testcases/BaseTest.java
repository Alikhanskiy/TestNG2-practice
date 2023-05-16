package com.automation.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {

    WebDriver driver;

    @BeforeClass
    public void setUpMethod() throws MalformedURLException {
        driver = getCloudDriver();
        //driver = getLocalDriver();
        driver.get("https://www.google.com");

    }
    public WebDriver getCloudDriver() throws MalformedURLException {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 10");
        browserOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "<Ali's build id>");
        sauceOptions.put("name", "<Ali's Parallel test");
        browserOptions.setCapability("sauce:options", sauceOptions);

        URL url = new URL("https://oauth-alikhanzhan-18619:5db41e2e-4695-45d2-99d8-f6a296100dd9@ondemand.us-west-1.saucelabs.com:443/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
        return driver;

    }
    public WebDriver getLocalDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }
    @AfterClass
    public void cleanUpMethod(){
        driver = new ChromeDriver();
        driver.quit();
    }
}
