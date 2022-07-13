package org.example.stepDefs;//package org.example.stepDefs;
//
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.example.pages.P010_wishlist;
//import org.testng.Assert;
//
//public class D010_wishlistStepDef extends P010_wishlist {
//    @When("user add product to wishlist")
//    public void user_add_product_to_wishlist() {
//        wishlist().get(2).click();
//    }
//    @Then("wishlist notification success is visible")
//    public void wishlist_notification_success_is_visible() {
//
//        showMessage();
//    }
//
//}


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P09_wishlist;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D09_wishlistStepDef extends P09_wishlist {

    int num;

    @When("user add product to wishlist")
    public void add_product() {
        wishlist().get(2).click();
    }

    @Then("wishlist notification success is visible")
    public void notify_success() {

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(wishSuccessMsg().isDisplayed(), "Success ");
        String actual = wishSuccessMsg().getCssValue("background-color");
        String expected = "rgba(75, 176, 122, 1)";
        soft.assertEquals(actual, expected, "Message color");
    }

    @And("user get the number of wishlist items after adding item")
    public void get_products_number() {
        String numberOfProducts = wishList().getText();
        numberOfProducts = numberOfProducts.replaceAll("[^0-9]", "");
        num = Integer.parseInt(numberOfProducts);
    }

    @Then("the number of wishlist increased")
    public void updated_wishlist()  {
        Assert.assertTrue(num > 0, "count of wishlist products");
    }


}