package com.utest.dalvareza.util;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AutomationDemoHook {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
}
