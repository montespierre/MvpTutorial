package com.weimont.mvptutorial;

import java.util.List;

public class PresenterImpl implements MainScreenContract.Presenter{

    MainScreenContract.View view;
    MainScreenContract.Model model;

    public PresenterImpl(MainScreenContract.View view, MainScreenContract.Model model){
        this.view = view;
        this.model = model;
    }

    @Override
    public void listClients() {
        List<String> clients = model.getClients();
        view.showClients(clients);

    }

    @Override
    public void onHideTitleButtonPressed() {

    }

    @Override
    public void onViewDestroy() {
        view = null;

    }

    @Override
    public void onViewCreated() {
        listClients();
    }
}
