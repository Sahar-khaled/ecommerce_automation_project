package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.example.stepDefs.Hooks.driver;

public class P01_register {

    public WebElement register_link() {
        return driver.findElement(By.cssSelector("a.ico-register"));
//        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
    }

    public WebElement select_type() {
        return driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
    }
//    public WebElement enter_name(String userName , String latestNma) {
//        driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(userName);
//        driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(latestNma);
//        return null;
//    }

    public WebElement enter_name(String firstName, String lastName) {
        driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("automation");
        driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("tester");
        return null;
    }

    public WebElement select_day (){
        return driver.findElement(By.name("DateOfBirthDay"));

    }
    public WebElement select_month (){
        return driver.findElement(By.name("DateOfBirthMonth"));

    }
    public WebElement select_year (){
        return driver.findElement(By.name("DateOfBirthYear"));

    }

    public WebElement enter_email(String email) {
         driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("test@example.com");
return null;
    }

    public WebElement enter_password(String pass, String confirmPass) {
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("P@ssw0rd");
        driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("P@ssw0rd");
        return null;
    }

    public WebElement enter_register() {
        return driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
    }

    public WebElement show_message(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));
    }

    }