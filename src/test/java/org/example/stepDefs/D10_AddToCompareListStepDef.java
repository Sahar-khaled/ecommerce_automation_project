package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P10_addToCompareList;

public class D10_AddToCompareListStepDef extends P10_addToCompareList {

    @When("user add product to compareList")
    public void user_add_product_to_compare_list() {
        compareList().get(2).click();

    }
    @Then("compareList notification success")
    public void compare_list_notification_success_is_visible() {
        showSuccess();

    }
}
