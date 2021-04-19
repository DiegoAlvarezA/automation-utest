package com.utest.dalvareza.tasks;

import com.utest.dalvareza.model.UtestForm;
import com.utest.dalvareza.userinterface.SignUpForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoSignupStep1 implements Task {
    private UtestForm formData;

    public DoSignupStep1(UtestForm formData) {
        this.formData = formData;
    }

    public static Performable withData(UtestForm formData) {
        return instrumented(DoSignupStep1.class, formData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(formData.getFirstName()).into(SignUpForm.FIRST_NAME),
                Enter.theValue(formData.getLastName()).into(SignUpForm.LAST_NAME),
                Enter.theValue(formData.getEmail()).into(SignUpForm.EMAIL),
                SelectFromOptions.byVisibleText(formData.getBirthDate("month")).from(SignUpForm.BIRTH_MONTH),
                SelectFromOptions.byVisibleText(formData.getBirthDate("day")).from(SignUpForm.BIRTH_DAY),
                SelectFromOptions.byVisibleText(formData.getBirthDate("year")).from(SignUpForm.BIRTH_YEAR),
                Enter.theValue(formData.getLanguage()).into(SignUpForm.LANGUAGE_LIST).thenHit(Keys.ENTER),
                Click.on(SignUpForm.NEXT_BUTTON)
        );
    }
}
