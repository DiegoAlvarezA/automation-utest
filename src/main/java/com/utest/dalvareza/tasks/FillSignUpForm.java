package com.utest.dalvareza.tasks;

import com.utest.dalvareza.model.UtestForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillSignUpForm implements Task {

    private UtestForm formData;

    public FillSignUpForm(UtestForm formData) {
        this.formData = formData;
    }

    public static Performable withData(UtestForm formData) {
        return instrumented(FillSignUpForm.class, formData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                DoSignupStep1.withData(formData),
                DoSignupStep2.withData(formData),
                DoSignupStep3.withData(formData),
                DoSignupStep4.withData(formData)
        );
    }
}
