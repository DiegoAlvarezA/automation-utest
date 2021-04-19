package com.utest.dalvareza.exceptions;

public class WelcomeMessageNotFoundException extends AssertionError{

    public static final String WELCOME_MESSAGE_NOT_FOUND = "Errores en el formulario, verificar información";

    public WelcomeMessageNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
