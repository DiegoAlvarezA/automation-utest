package com.utest.dalvareza.tasks;

import com.utest.dalvareza.model.UtestForm;
import com.utest.dalvareza.userinterface.SignUpForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoSignupStep3 implements Task {
    private UtestForm formData;

    public DoSignupStep3(UtestForm formData) {
        this.formData = formData;
    }

    public static Performable withData(UtestForm formData) {
        return instrumented(DoSignupStep3.class, formData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SignUpForm.OS_FIELD),
                Click.on(SignUpForm.andSelectAnOption(formData.getComputerOs())),
                Click.on(SignUpForm.VERSION_FIELD),
                Click.on(SignUpForm.andSelectAnOption(formData.getComputerVersion())),
                Click.on(SignUpForm.LANGUAGE_FIELD),
                Click.on(SignUpForm.andSelectAnOption(formData.getComputerLanguage())),
                Click.on(SignUpForm.DEVICE_FIELD),
                Click.on(SignUpForm.andSelectAnOption(formData.getMobile())),
                Click.on(SignUpForm.DEVICE_MODEL_FIELD),
                Click.on(SignUpForm.andSelectAnOption(formData.getMobileModel())),
                Click.on(SignUpForm.DEVICE_OS_FIELD),
                Click.on(SignUpForm.andSelectAnOption(formData.getMobileOs())),
                Click.on(SignUpForm.NEXT_BUTTON)
        );
    }
}
