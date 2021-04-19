package com.utest.dalvareza.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestHomePage  {
    public static final Target SIGNUP_BUTTON = Target.the("Sign up button")
            .located(By.cssSelector("a.unauthenticated-nav-bar__sign-up"));
}
