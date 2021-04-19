package com.utest.dalvareza.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/utest_signup.feature",
        //features = "src/test/resources/features",
        tags = "@utest",
        glue = {"com.utest.dalvareza.stepdefinitions", "com.utest.dalvareza.util"},
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
