package com.example.tcmsapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;



public class studentfragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_blank,container,false);

        ImageView backbtn = view.findViewById(R.id.backBtn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new calenderFM());

                fragmentTransaction.commit();
            }
        });

        ImageView menubtn = view.findViewById(R.id.menubtn);

        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new calenderFM());

                fragmentTransaction.commit();
            }
        });

        ImageView addtd = view.findViewById(R.id.newStudent);

        addtd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new addStudentFragment());

                fragmentTransaction.commit();
            }
        });
 ImageView activeStd = view.findViewById(R.id.activeStd);

        activeStd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new ActivestudentList());

                fragmentTransaction.commit();
            }
        });

        ImageView idcards = view.findViewById(R.id.ids);

        idcards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new idcards());

                fragmentTransaction.commit();
            }
        });



        return view;
    }
}