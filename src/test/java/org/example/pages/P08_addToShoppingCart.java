package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.example.stepDefs.Hooks.driver;

public class P08_addToShoppingCart {
    public void enterAddToCart(){
         driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[2]/button[1]")).click();
    }
    public WebElement addData(){
        return driver.findElement(By.xpath("//*[@id=\"product_attribute_2\"]/option[2]"));
//        return driver.findElement(By.xpath("//*[@id=\"product_attribute_2\"]"));
    }
    public WebElement addDataa(){
//        return driver.findElement(By.xpath("//*[@id=\"product_attribute_input_3\"]"));
        return driver.findElement(By.xpath("//*[@id=\"product_attribute_3_6\"]"));
    }
    public WebElement addToCart(){
         driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-1\"]")).click();
    return null;
    }
    public void showSuccessMsg(){
        Assert.assertTrue(driver.findElement(By.cssSelector("p[class=\"content\"]")).isDisplayed());

//        Assert.assertTrue(driver.findElement(By.cssSelector("//*[@id=\"bar-notification\"]/div/p\n")).isDisplayed());

    }
}
