package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_resetPass;

public class D03_resetPassStepDef extends P03_resetPass {


    @Given("user will go to login page")
    public void user_will_go_to_login_page() {
        login().click();

    }
    @And("user enter valid email and invalid password")
    public void user_enter_valid_email_and_invalid_password() {
        enterValidNameAndInvalidPass("test@example.com", "k@ssw0rd");


    }
    @And("user clicks on login button")
    public void user_clicks_on_login_button() {
        pressLoginBtn().click();

    }

    @And("User clicks on forgot password button")
    public void user_clicks_on_forgot_password_button() {
        pressForgetPass().click();

    }
    @And("enter his email address")
    public void enter_his_email_address() {
        enterEmailAddress("test@example.com");

    }
    @And("enter recover button")
    public void enterRecoverButton() {
        enterRecoverBtn().click();
    }
    @Then("success message is shown")
    public void success_message_is_shown() {

    }


}
