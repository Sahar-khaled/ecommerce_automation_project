package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P02_login {
    public WebElement login() {
        return driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
    }
    public WebElement enterValidNameAndPass(String validName , String password){
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(validName);
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(password);

        return null;
    }
    public WebElement pressLoginBtn () {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
    }
    public boolean loginSuccessfully(){
        boolean result=false;

        if(driver.getCurrentUrl().equalsIgnoreCase("https://demo.nopcommerce.com/ 1")){
            result=true;
        }
        return result;
    }
    public WebElement enterInValidNameAndPass(String inValidName , String inVPassword){
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(inValidName);
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(inVPassword);

        return null;
    }

    public WebElement failedToLogin(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]"));

    }



}
