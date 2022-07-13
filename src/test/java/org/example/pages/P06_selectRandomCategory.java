package org.example.pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

import static org.example.stepDefs.Hooks.driver;

public class P06_selectRandomCategory   {
    public WebElement electronics(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));
    }
    public WebElement categoryList(){
        return driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }
    public WebElement camera_photo(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[1]/a"));
    }


}
