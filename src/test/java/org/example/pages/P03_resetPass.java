package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P03_resetPass {
    public WebElement login() {
        return driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
    }

    public WebElement enterValidNameAndInvalidPass(String validName , String inValidPassword){
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(validName);
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(inValidPassword);

        return null;
    }
    public WebElement pressLoginBtn () {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
    }

    public WebElement pressForgetPass (){
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/div[3]/span/a"));
    }
    public WebElement enterEmailAddress(String validMail){
         driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(validMail);
         return null;
    }
    public WebElement enterRecoverBtn(){
     return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button"));
    }
}
