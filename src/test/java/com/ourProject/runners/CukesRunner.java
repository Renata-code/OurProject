package com.ourProject.runners;
import com.sun.tools.corba.se.idl.StructEntry;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",//path from content root on features package
        glue = "com/ourProject/stepDefinitions",//path from source root on step definitions package
        dryRun = false, //will not run actual implementation of our code it willcheck the feature file steps
        tags = "@download" //which one you want to run

)
public class CukesRunner {




}
