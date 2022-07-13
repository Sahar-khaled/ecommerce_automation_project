package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P09_wishlist {
   public List<WebElement> wishlist() {
       return driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
//     driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]")).click();

   }
   public void showMessage(){
       Assert.assertTrue(driver.findElement(By.cssSelector("p[class=\"content\"]")).isDisplayed());
   }
    public WebElement wishList() {
        return driver.findElement(By.cssSelector("div[class=\"header-links\"] [href=\"/wishlist\"]"));
    }

    public List<WebElement> addWishList() {
        return driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    }

    public WebElement wishSuccessMsg() {
        return driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }

}
