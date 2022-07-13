package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P07_filterByColor;

public class D07_filterByColorStepDef extends P07_filterByColor {

    @When("user enter valid email and valid password")
    public void user_enter_valid_email_and_valid_password() {
        enterValidNameAndPass("test@example.com", "P@ssw0rd");

    }
    @And("user click to login button")
    public void userClickToLoginButton() {

        pressLoginBtn().click();

    }
    @And("user select apparel category")
    public void user_select_apparel_category_then_click_to_shoes() {
        selectApparel().click();
    }
    @And("user click on shoes")
    public void user_click_to_shoes() {
        select_shoes().click();
    }

    @And("User select red color")
    public void user_select_red_color() {
        select_color().click();
}

    @Then("red one should be displayed")
    public void red_one_should_be_displayed() {
        showItem();

    }
}
