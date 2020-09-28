package com.ourProject.pages;
import com.ourProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 2000);//explicit


    public BasePage() {

        //this line to bo able to use @Findby,@FindBys annotations
        PageFactory.initElements(Driver.getDriver(), this);
    }




}
