package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;


public class D02_loginStepDef extends P02_login {

    @Given("user go to login page")
    public void user_go_to_login() {
        login().click();

    }

    @When("user login with valid \"test@example.com\" and \"P@ssw0rd\"")
    public void login_with_valid_mail_and_password() {
        enterValidNameAndPass("test@example.com", "P@ssw0rd");
    }

    @When("user press on login button")
    public void user_press_on_login_button() {
        pressLoginBtn().click();

    }

    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully() {
        loginSuccessfully();
    }

    // bad

    @And("user login with \"invalid\" \"tesst@example.com\" and \"P@sssw0rd\"")
    public void login_with_invalid_mail_and_password() {
        enterInValidNameAndPass("tesst@example.com", "P@sssw0rd");
    }


    @Then("user could not login to the system")
    public void user_could_not_login_to_the_system() {
        failedToLogin();
    }
}
