package com.boulio.fragmentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements topFragment.TopSectionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createMeme(String top, String bottom){
        bottomFragment bottomFragment =(bottomFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomFragment.setMemeText(top, bottom);
    }
}
