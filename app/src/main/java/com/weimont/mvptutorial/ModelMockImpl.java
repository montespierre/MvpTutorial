package com.weimont.mvptutorial;

import java.util.ArrayList;
import java.util.List;

public class ModelMockImpl implements MainScreenContract.Model{

    List<String> clients;

    public ModelMockImpl(){
        clients = new ArrayList<>();
        clients.add("Adri");
        clients.add("Juan");
        clients.add("Carlos");
        clients.add("Gustavo");
    }

    @Override
    public List<String> getClients() {
        return this.clients;
    }
}
