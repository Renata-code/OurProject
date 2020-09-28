package com.ourProject.pages;

import com.ourProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage extends BasePage {

    public CalendarPage() {

        //this line to bo able to use @Findby,@FindBys annotations
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement userNameElement;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordElement;

    @FindBy(xpath = "(//a[@class='menu-item-link'])[6]")
    public WebElement CalendarIcon;


    @FindBy(xpath = "//span[.='22']")
    public WebElement September22;

    @FindBy(xpath = "//input[@value='New Event']")
    public WebElement EventInputBox;

    @FindBy(xpath = "//span[@class='calendar-reminder-clear-icon']")
    public WebElement ClearReminderTime;


    @FindBy(xpath = "//span[@class='calendar-notification-icon']")
    public  WebElement PlusIcon;

   @FindBy(xpath = "//span[.='1 hour before event']")
   public  WebElement HourBefore; ////input[@placeholder='Location']

    @FindBy(xpath = "//input[@placeholder='Location']")
    public  WebElement LocationInputBox;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public  WebElement SaveButton;



}

