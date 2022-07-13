package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_home;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class D05_currenciesStepDef extends P05_home {
    @Given("user navigate to homepage")
    public void navigateToHome(){}

        @When("user change current currency to Euro")
        public void change_currency_to_Euro() throws InterruptedException {
            Select select=new Select(currentCurrency());
            select.selectByVisibleText("Euro");
            Thread.sleep(1000);
        }
        @Then("user should found all products prices in Euro")
        public void show_product_in_Euro(){

            JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
            js.executeScript("window.scrollBy(0,1400)", "");

            int count=currencySign().size();
            for (int i=0;i<count;i++)
            {
                currencySign().get(i).getText();
                Assert.assertTrue(currencySign().contains("€"));
            }

        }
        @When("user change current currency to Dollar")
        public void change_currency_to_dollar() throws InterruptedException {
            Select select=new Select(currentCurrency());
            select.selectByVisibleText("US Dollar");
            Thread.sleep(1000);
        }
        @Then("user should found all products prices in Dollar")
        public void show_product_in_Dollar(){

            JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
            js.executeScript("window.scrollBy(0,1400)", "");

            int count=currencySign().size();
            for (int i=0;i<count;i++)
            {
                currencySign().get(i).getText();
                Assert.assertTrue(currencySign().contains("$"));
            }
        }

    }