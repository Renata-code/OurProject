package com.ourProject.pages;
import com.ourProject.utilities.ConfigurationReader;
import com.ourProject.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    private WebElement userNameElement;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    private WebElement passwordElement;

    public void login1(String hr_username, String bitrix_password){
        wait.until(ExpectedConditions.visibilityOf(userNameElement)).sendKeys(hr_username);
        wait.until(ExpectedConditions.visibilityOf(passwordElement)).sendKeys(bitrix_password, Keys.ENTER);
    }

    public void login(){
        String URL = ConfigurationReader.getProperty("url_Stream");
        Driver.getDriver().get(URL);
        String userName = ConfigurationReader.getProperty("hr_username");
        String password = ConfigurationReader.getProperty("bitrix_password");
        userNameElement.sendKeys(userName);
        passwordElement.sendKeys(password, Keys.ENTER);
    }

}
