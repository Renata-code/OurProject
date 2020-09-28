package com.ourProject.stepDefinitions;

import com.ourProject.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

public class DownloadStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Test
    @Given("User logged in to Bitrix24")
    public void user_logged_in_to_bitrix25() {
        loginPage.login();


    }

    @When("User should be able to click on MacOs icon under Desktop Client")
    public void user_should_be_able_to_click_on_mac_os_icon_under_desktop_client() {

    }

    @Then("User should see MacOS version of Bitrix downloaded")
    public void user_should_see_mac_os_version_of_bitrix_downloaded() {

    }

    @Given("User logged in to Bitrix24")
    public void user_logged_in_to_bitrix26() {

    }

    @When("User should be able to click on Windows icon under Desktop Client1")
    public void user_should_be_able_to_click_on_windows_icon_under_desktop_client1() {

    }

    @Then("User should see Windows version of Bitrix downloaded")
    public void user_should_see_windows_version_of_bitrix_downloaded() {

    }



    @Given("User logged in to Bitrix24")
    public void user_logged_in_to_bitrix24() {

    }

    @When("User should be able to click on Linux icon under Desktop Client")
    public void user_should_be_able_to_click_on_linux_icon_under_desktop_client() {

    }
    @Then("User should see Linux version of Bitrix downloaded")
    public void user_should_see_linux_version_of_bitrix_downloaded() {

    }


}
