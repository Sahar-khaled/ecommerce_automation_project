package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.example.stepDefs.Hooks.driver;

public class D01_registerStepDef extends P01_register {

    @Given("user go to register page")
    public void goRegisterPage() {
        register_link().click();
    }
    @When("user select gender type")
    public void user_select_gender_type() {
        select_type().click();
    }

@When("user enter first name {string} and last name {string}")
public void user_enter_first_name_and_last_name(String firstName , String lastName) {
    enter_name(firstName,lastName);
}


    @And("user enter date of birth")
    public void birthDay()  {
        select_day();
        Select selectedDay = new Select(select_day());
        selectedDay.selectByIndex(3);
        select_month();
        Select selectedMonth = new Select(select_month());
        selectedMonth.selectByValue("2");
        select_year();
        Select selectedYear = new Select(select_year());
        selectedYear.selectByIndex(2);

    }

    @And("user enter email {string} field")
    public void user_enter_email_field(String email) {
         enter_email(email);

    }
    @And("user fills Password fields {string} {string}")
    public void user_fills_password_fields(String pass, String confirmPass) {
        enter_password(pass,confirmPass);
    }
    @And("user clicks on register button")
    public void user_clicks_on_register_button() {
       enter_register().click();
    }
    @Then("success message is displayed")
    public void success_message_is_displayed() {
        show_message().getText();
    }

}
