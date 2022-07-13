package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P11_sliders;
import org.openqa.selenium.By;
import org.testng.Assert;


public class D11_SlidersStepDef extends P11_sliders {
    @When("user clicks on first slider")
    public void click_first_page(){
        Hooks.driver.findElement(By.cssSelector("a[rel=\"0\"]")).click();
        clickSlider("1").click();
    }

    @Then("relative product for first slider is displayed")
    public void show_product_one() throws InterruptedException {
        Thread.sleep(1500);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020","URL of First Slide");
    }

    @When("user clicks on second slider")
    public void click_second_page() throws InterruptedException {
        Hooks.driver.findElement(By.cssSelector("a[rel=\"1\"]")).click();
        clickSlider("2").click();
    }

    @Then("relative product for second slider is displayed")
    public void show_product_two() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6","URL of Second Slide");
    }
}