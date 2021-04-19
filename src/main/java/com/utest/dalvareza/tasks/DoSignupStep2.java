package com.utest.dalvareza.tasks;

import com.utest.dalvareza.model.UtestForm;
import com.utest.dalvareza.userinterface.SignUpForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoSignupStep2 implements Task {
    private UtestForm formData;

    public DoSignupStep2(UtestForm formData) {
        this.formData = formData;
    }

    public static Performable withData(UtestForm formData) {
        return instrumented(DoSignupStep2.class, formData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(formData.getCity()).into(SignUpForm.CITY),
                Enter.theValue(formData.getZip()).into(SignUpForm.POSTAL_CODE),
                Click.on(SignUpForm.COUNTRY_FIELD),
                Enter.theValue(formData.getCountry()).into(SignUpForm.COUNTRY_INPUT).thenHit(Keys.ENTER),
                Click.on(SignUpForm.NEXT_BUTTON)
        );
    }
}
