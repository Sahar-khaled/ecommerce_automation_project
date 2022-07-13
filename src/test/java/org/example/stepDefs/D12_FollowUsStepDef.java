package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P12_followUs;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import java.util.ArrayList;

public class D12_FollowUsStepDef extends P12_followUs {

    @Then("^\"([^\"]*)\" is opened in new tab$")
    public void opens_new_tab(String linkType) throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));

        switch (linkType) {

            case "facebook-Link":
                Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://www.facebook.com/nopCommerce","facebook link");
                break;

            case "twitter-Link":
                Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://twitter.com/nopCommerce","twitter link");
                break;

            case "youtube-Link":
                Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://www.youtube.com/user/nopCommerce","youtube link");
                break;

            case "rss-Link":
                Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/new-online-store-is-open","rss link");
                break;

        }

        Hooks.driver.close();

        Hooks.driver.switchTo().window(Tabs.get(0));
    }
    @When("user opens facebook link")
    public void facebook1() {
        facebook().click();
    }
    @When("user opens twitter link")
    public void twitter2() {
        twitter().click();
    }

    @When("user opens rss link")
    public void rss3() {
        rss().sendKeys(Keys.ENTER);
    }

    @When("user opens youtube link")
    public void youtube4() {
        youtube().click();
    }
}
