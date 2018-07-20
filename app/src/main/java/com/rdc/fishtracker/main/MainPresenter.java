package com.rdc.fishtracker.main;

/**
 * Responsible for handling actions from the View and updating the UI as required
 */
public class MainPresenter implements MainContract.MVPPresenter {
    private MainContract.MVPView mView;

    MainPresenter(MainContract.MVPView view) {
        mView = view;
    }
}
