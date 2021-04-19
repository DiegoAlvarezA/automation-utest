package com.utest.dalvareza.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class WelcomePage {

    public static Question<String> title() {
        return actor -> Text.of(com.utest.dalvareza.userinterface.WelcomePage.WELCOME_MESSAGE).viewedBy(actor).asString();
    }
}
