package org.example.stepDefs;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.example.pages.P06_selectRandomCategory;
//import org.openqa.selenium.interactions.Actions;
//
//public class D06_selectRandomCategoryStepDef extends P06_selectRandomCategory {
//
//    @And("user select random category")
//    public void user_select_random_category() {
//        getListProducts();
//    }
//    @When("user click on subcategory if found")
//    public void user_click_on_subcategory_if_found() {
//        getSubList();
//
//    }
//    @Then("subcategory should be displayed")
//    public void subcategory_should_be_displayed() {
//
//    }
//
//
//
//}


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_selectRandomCategory;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D06_selectRandomCategoryStepDef extends P06_selectRandomCategory {
    String subCategory;
    @When("user hover random category and select subcategory")
    public void step1() throws InterruptedException {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(electronics()).perform();
        subCategory = camera_photo().getText().toLowerCase();
        Thread.sleep(1000);
    }

    @And("user click on subcategory if found")
    public void step2(){ camera_photo().click();
    }

    @Then("user go to relative product page")
    public void step3(){
        Assert.assertEquals(categoryList().getText().toLowerCase(),subCategory,"subcategory");
    }
}