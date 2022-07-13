package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P12_followUs {
    public WebElement facebook() {
        return driver.findElement(By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]"));
    }

    public WebElement twitter() {
        return driver.findElement(By.xpath("//a[@href=\"https://twitter.com/nopCommerce\"]"));
    }

    public WebElement rss() {
        return driver.findElement(By.xpath("//a[@href=\"/news/rss/1\"]"));
    }

    public WebElement youtube() {
        return driver.findElement(By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }
}
