package com.utest.dalvareza.tasks;

import com.utest.dalvareza.model.UtestForm;
import com.utest.dalvareza.userinterface.SignUpForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoSignupStep4 implements Task {
    private UtestForm formData;

    public DoSignupStep4(UtestForm formData) {
        this.formData = formData;
    }

    public static Performable withData(UtestForm formData) {
        return instrumented(DoSignupStep4.class, formData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(formData.getPassword()).into(SignUpForm.PASSWORD),
                Enter.theValue(formData.getPassword()).into(SignUpForm.CONFIRM_PASSWORD),
                Check.whether(formData.isCheckedTerms())
                        .andIfSo(Click.on(SignUpForm.CHECKBOX_TERMS_OF_USE)),
                Check.whether(formData.isCheckedPrivacyPolicy())
                        .andIfSo(Click.on(SignUpForm.CHECKBOX_PRIVACY_POLICY)),
                Click.on(SignUpForm.NEXT_BUTTON)
        );
    }
}
