package com.boulio.fragmentdemo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class bottomFragment extends Fragment {

    private static EditText bottomEditText;
    private static EditText topEditText;


    public bottomFragment(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bottom, container, false);
        topEditText = (EditText) view.findViewById(R.id.topEditText);
        bottomEditText = (EditText) view.findViewById(R.id.bottomEditText);

        return view;
    }



    public void setMemeText(String top, String bottom){
        topEditText.setText(top);
        bottomEditText.setText(bottom);
    }
}
