package com.ria.actions;

public class SignInActions  extends BaseAction{
    public void signIn(String email, String password) {
        //checkLoginToAccount

        signInPage.waitVisibilityOfElement(TIME_TO_WAIT, signInPage.getEmailInputField());
        signInPage.emailSubmit(email);
        signInPage.implicitWait(TIME_TO_WAIT);
        signInPage.passwordSubmit(password);
        signInPage.implicitWait(TIME_TO_WAIT);
        signInPage.waitURLContains(TIME_TO_WAIT, MAIL_URL_KEYWORD);
    }
}
