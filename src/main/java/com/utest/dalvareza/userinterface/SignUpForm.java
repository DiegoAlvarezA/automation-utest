package com.utest.dalvareza.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpForm {
    // Step 1
    public static final Target STEP1_TITLE = Target.the("Title")
            .located(By.xpath("//span[contains(text(),'Tell us about yourself')]"));

    public static final Target FIRST_NAME = Target.the("First name")
            .located(By.id("firstName"));

    public static final Target LAST_NAME = Target.the("Last name")
            .located(By.id("lastName"));

    public static final Target EMAIL = Target.the("Email address")
            .located(By.id("email"));

    public static final Target BIRTH_MONTH = Target.the("Birth month")
            .located(By.id("birthMonth"));

    public static final Target BIRTH_DAY = Target.the("Birth day")
            .located(By.id("birthDay"));

    public static final Target BIRTH_YEAR = Target.the("Birth year")
            .located(By.id("birthYear"));

    public static final Target LANGUAGE_LIST = Target.the("Languages (spoken)")
            .located(By.cssSelector("input[aria-label='Select box']"));

    public static final Target NEXT_BUTTON = Target.the("Next button")
            .located(By.cssSelector("a[class^='btn btn-blue']"));

    // Step 2
    public static final Target STEP2_TITLE = Target.the("Title")
            .located(By.xpath("//span[contains(text(),'Add your address')]"));

    public static final Target CITY = Target.the("City")
            .located(By.id("city"));

    public static final Target POSTAL_CODE = Target.the("Postal code")
            .located(By.id("zip"));

    public static final Target COUNTRY_FIELD = Target.the("Country field")
            .located(By.cssSelector("span[aria-label='Select a country']"));

    public static final Target COUNTRY_INPUT = Target.the("Country input")
            .located(By.cssSelector("input[placeholder='Select a country']"));

    // Step 3
    public static final Target STEP3_TITLE = Target.the("Title")
            .located(By.xpath("//span[contains(text(),'Tell us about your devices')]"));

    public static final Target OS_FIELD = Target.the("OS field")
            .located(By.cssSelector("span[aria-label='Select OS']"));

    public static final Target VERSION_FIELD = Target.the("OS field")
            .located(By.cssSelector("span[aria-label='Select a Version']"));

    public static final Target LANGUAGE_FIELD = Target.the("Language field")
            .located(By.cssSelector("span[aria-label='Select OS language']"));

    public static final Target DEVICE_FIELD = Target.the("Device " +
            "field")
            .located(By.cssSelector("span[aria-label='Select Brand']"));

    public static final Target DEVICE_MODEL_FIELD = Target.the("Device model " +
            "field")
            .located(By.cssSelector("span[aria-label='Select a Model']"));

    public static final Target DEVICE_OS_FIELD = Target.the("Device os " +
            "field")
            .located(By.xpath("//div[@id='mobile-device']/div[3]/div/div"));

    public static Target andSelectAnOption(String value) {
        return Target.the("Option " + value)
                .located(By.xpath("//div[contains(text(),'"+ value + "')]"));
    }

    // Step 4
    public static final Target STEP4_TITLE = Target.the("Title")
            .located(By.xpath("//span[contains(text(),'The last step')]"));

    public static final Target PASSWORD = Target.the("Password")
            .located(By.id("password"));

    public static final Target CONFIRM_PASSWORD = Target.the("Confirm password")
            .located(By.id("confirmPassword"));

    public static final Target CHECKBOX_TERMS_OF_USE = Target.the("Terms of " +
            "use")
            .located(By.id("termOfUse"));

    public static final Target CHECKBOX_PRIVACY_POLICY = Target.the("Privacy " +
            "& Security Policy")
            .located(By.id("privacySetting"));
}
