package com.weimont.mvptutorial;

import java.util.List;

public interface MainScreenContract {

    interface View{
        void showClients(List<String> clients);
        void showTitle();

    }

    interface Presenter{
        void listClients();
        void onHideTitleButtonPressed();
        void onViewDestroy();
        void onViewCreated();

    }

    interface Model{
        List<String> getClients();

    }
}
