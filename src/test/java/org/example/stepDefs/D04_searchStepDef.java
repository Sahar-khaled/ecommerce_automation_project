package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_search;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class D04_searchStepDef extends P04_search {
    @When("user click on search bar")
    public void click_search() {
        searchBar().click();
    }

    @And("user search for product like \"(.*)\"$")
    public void search_product(String search) {
        searchBar().sendKeys(search);
    }

    @And("user click on search Button")
    public void click_search_btn() {
        searchButton().click();
    }

    @Then("user could search and go to search page successfully")
    public void check_search() {
        // First Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=Apple"), "search URL");
        // Second Assertion
        int size = productsList();
        soft.assertTrue(size > 0,"Result");
        soft.assertAll();
    }
    @Then("user could search with SKU successfully")
    public void search_product_by_sku() {

        // First Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=AP_MBP_13"), "URL after search");
        // Second Assertion
        int size = productsList();
        soft.assertTrue(size > 0,"Result");
        soft.assertAll();

        // solutin 1
        WebElement searchContent = Hooks.driver.findElement(By.xpath("//*[@id=\"sku-4\"]"));
        Assert.assertTrue(searchContent.isDisplayed(), "SKU is displayed");

        // solutin 2
        String actualResult = Hooks.driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).getText();
        String expectedResult = Hooks.driver.findElement(By.xpath("//*[@id=\"sku-4\"]")).getText();
        Assert.assertTrue(actualResult.contains(expectedResult), "actual equal to expected") ;


    }
    @Then("user could not search")
    public void failed_search() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(noMatchedSearch().isDisplayed(), "No products Matches Your Search");
    }
}