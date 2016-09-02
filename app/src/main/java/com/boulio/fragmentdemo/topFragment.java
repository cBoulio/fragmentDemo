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



public class topFragment extends Fragment {

    private static EditText bottomEditText;
    private static EditText topEditText;

    TopSectionListener activitCommander;

    public interface TopSectionListener{
        public void createMeme(String top, String bottom);
    }



    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        try{
            activitCommander = (TopSectionListener) context;
        }catch(ClassCastException e){
            throw new ClassCastException(context.toString());
        }

    }

    public topFragment(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_top,container, false);

        topEditText = (EditText) view.findViewById(R.id.topEditText);
        bottomEditText =(EditText) view.findViewById(R.id.bottomEditText);

        final Button button  = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClicked(view);
            }
        });
        return view;
    }

    public void buttonClicked(View view) {
            activitCommander.createMeme(topEditText.getText().toString(), bottomEditText.getText().toString());
    }


}
