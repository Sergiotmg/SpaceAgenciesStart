package com.sergio.spaceagencies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sergio.spaceagencies.api.Controller;

public class MainActivity extends AppCompatActivity implements Controller.ServerResponse {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Controller controller= new Controller(this);
        controller.start();





    }

    @Override
    public void onResponse(ResponseModel responseModel) {

    }
}
