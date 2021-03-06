package com.example.tcmsapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;



public class calenderFM extends Fragment{

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_calender_f_m,container,false);
       ImageView imageView = view.findViewById(R.id.std);
       ImageView todoTask = view.findViewById(R.id.dtodotask);
       ImageView incomeExpBtn = view.findViewById(R.id.incomeExpBtn);
       ImageButton btnBackMainMenu = view.findViewById(R.id.btnBackMainMenu);

       ImageView batches = view.findViewById(R.id.batches);

        btnBackMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Signin.class);
                startActivity(intent);
            }
        });

       batches.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
               fragmentTransaction.replace(R.id.contrainer,new batchesfragment());
               fragmentTransaction.commit();
           }
       });
       ImageView enquery = view.findViewById(R.id.enquery);
        enquery.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
               fragmentTransaction.replace(R.id.contrainer,new enqueryOptions());
               fragmentTransaction.commit();
           }
       });
        ImageView staff = view.findViewById(R.id.staff);
        staff.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
               fragmentTransaction.replace(R.id.contrainer,new staffMain());
               fragmentTransaction.commit();
           }
       });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new studentfragment());
                fragmentTransaction.commit();

            }
        });
              todoTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new todo_task_list());
                fragmentTransaction.commit();

            }
        });

        incomeExpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new incomeAndExp());
                fragmentTransaction.commit();

            }
        });
       return view;
    }
}