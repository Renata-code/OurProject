package com.ourProject.stepDefinitions;

import com.ourProject.pages.BasePage;
import com.ourProject.pages.CalendarPage;
import com.ourProject.pages.LoginPage;
import com.ourProject.utilities.ConfigurationReader;
import com.ourProject.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CalendarStepDefinitions extends BasePage {

    CalendarPage calendarPage = new CalendarPage();
    LoginPage loginPage = new LoginPage();



    @Then("User enters credentials")
    public void user_enters_credentials()throws Exception {
       //ConfigurationReader.getProperty("url_Stream");
        loginPage.login();
    }

    @Then("User clicks on Calendar icon")
    public void user_clicks_on_calendar_icon() throws Exception {
        //Thread.sleep(1000);
        calendarPage.CalendarIcon.click();
        Thread.sleep(1000);
        calendarPage.September22.click();
    }

    @Then("User fill out the event pop-up")
    public void user_fill_out_the_event_pop_up() throws Exception {

       Thread.sleep(1000);

        calendarPage.EventInputBox.sendKeys("Birthday Event");
        calendarPage.ClearReminderTime.click();
        Thread.sleep(2000);
        calendarPage.PlusIcon.click();


        Actions actions = new Actions(Driver.getDriver());

        //using actions instance we use movetoElement method
        WebElement HourBefore1 = Driver.getDriver().findElement(By.xpath("//span[.='1 hour before event']"));
        actions.moveToElement(HourBefore1).build().perform();
        Thread.sleep(2000);
        calendarPage.HourBefore.click();
        calendarPage.LocationInputBox.sendKeys("My office");
        //calendarPage.passwordElement.click();
    }

    @Then("User should be able to click on save button")
    public void user_should_be_able_to_click_on_save_button() {

        calendarPage.SaveButton.click();


    }

}
