package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P08_addToShoppingCart;

public class D08_AddToShoppingCartStepDef extends P08_addToShoppingCart {
    @When("user add product to shopping cart from main page")
    public void user_add_product_to_shopping_cart_from_main_page() {
        enterAddToCart();

    }
    @And("user enter mandatory data about the product")
    public void user_enter_mandatory_data_about_the_product() {
        addData().click();


        addDataa().click();


    }
    @And("user add product to shopping cart from product page")
    public void user_add_product_to_shopping_cart_from_product_page() {
        addToCart();

    }
    @Then("shopping cart notification success is visible")
    public void shopping_cart_notification_success_is_visible() {
        showSuccessMsg();

    }

}
