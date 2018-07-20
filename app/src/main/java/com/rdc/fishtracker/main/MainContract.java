package com.rdc.fishtracker.main;

/**
 * This defines the contract between the View {@link MainActivity} and Presenter
 * {@link MainPresenter}.
 */
public interface MainContract {
    interface MVPView {
        void showSignInScreen();
        void showSignUpScreen();
    }
    interface MVPPresenter {
        void handleSignInButtonClick();
        void handleSignUpButtonClick();
    }

}
