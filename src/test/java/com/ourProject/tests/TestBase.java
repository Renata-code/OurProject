package com.ourProject.tests;
import com.ourProject.utilities.ConfigurationReader;
import com.ourProject.utilities.Driver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBase {


    @BeforeMethod
    public void setup(){
        String URL = ConfigurationReader.getProperty("url_Stream");
        Driver.getDriver().get(URL);
        Driver.getDriver().manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(ITestResult iTestResult){
//        //if test failed, take a screenshot
//        if(iTestResult.getStatus() == ITestResult.FAILURE){
//            //BrowserUtils.takeScreenshot();
//        }
        Driver.closeDriver();
    }
}
