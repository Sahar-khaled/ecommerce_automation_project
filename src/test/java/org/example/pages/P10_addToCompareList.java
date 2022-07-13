package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P10_addToCompareList {
    public List<WebElement> compareList() {
        return driver.findElements(By.cssSelector("button[class=\"button-2 add-to-compare-list-button\"]"));
//     driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]")).click();

    }
    public void showSuccess(){
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p")).isDisplayed());
    }
}
