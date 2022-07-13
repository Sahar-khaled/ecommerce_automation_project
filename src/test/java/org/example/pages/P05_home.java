package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P05_home {
    public WebElement currentCurrency(){
        return driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> currencySign(){
        List<WebElement> count =driver.findElements(By.cssSelector("span[class=\"price actual-price]\"]"));
        return count;
    }
}
