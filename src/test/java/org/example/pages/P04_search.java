package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P04_search {
    public WebElement searchBar(){
        return driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchButton(){
        return driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }
    public int productsList(){
        int product = driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();
        return product;
    }
    public WebElement noMatchedSearch(){
        return driver.findElement(By.cssSelector("div[class=\"no-result\"]"));
    }
}
