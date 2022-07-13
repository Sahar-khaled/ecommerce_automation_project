package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.example.stepDefs.Hooks.driver;

public class P07_filterByColor {
    public WebElement enterValidNameAndPass(String validName , String password){
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(validName);
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(password);

        return null;
    }
    public WebElement pressLoginBtn () {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
    }
    public WebElement selectApparel (){
        return driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a"));

    }
    public WebElement select_shoes (){
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[3]/ul/li[1]/a\n"));

    }

    public WebElement select_color (){
        return driver.findElement(By.xpath("//*[@id=\"attribute-option-15\"]"));

    }
    public void showItem(){
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div")).isDisplayed());
    }


}
