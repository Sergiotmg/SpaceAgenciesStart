package com.sergio.spaceagencies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sergio.spaceagencies.api.Controller;

public class MainActivity extends AppCompatActivity implements Controller.ServerResponse {
    private RecyclerView recyclerView;
    private AgenciesAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Controller controller= new Controller(this);
        controller.start();

        recyclerView=findViewById(R.id.recyclerView);
        adapter=new AgenciesAdapter(this);

        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


    }

    @Override
    public void onResponse(ResponseModel response) {
        adapter.setData(response.getAgencies());

    }
}
