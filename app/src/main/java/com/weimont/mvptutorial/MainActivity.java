package com.weimont.mvptutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainScreenContract.View{

    MainScreenContract.Presenter presenter;

    TextView title;
    TextView clientList;
    Button showTitleButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    private void initialize() {

        title = findViewById(R.id.tvClients);
        clientList = findViewById(R.id.tvClients);
        showTitleButton = findViewById(R.id.btnShowTitle);

        presenter = new PresenterImpl(this, new ModelMockImpl());
        presenter.onViewCreated();

    }

    @Override
    public void showClients(List<String> clients) {
        clientList.setText("");
        for(int i=0; i<clients.size(); i++){
            clientList.append(String.valueOf(clients.get(i) + "\n"));
        }

    }

    @Override
    public void showTitle() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onViewDestroy();
    }
}