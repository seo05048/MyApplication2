package com.example.myapplication.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


import com.example.myapplication.R;
import com.example.myapplication.ui.notice.FavoriteAdapter;

public class Fragment3 extends Fragment {//원래는 App->Fragment였음
    private ArrayAdapter adapter;
    private Spinner spinner;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){

        View v =  inflater.inflate(R.layout.fragment3, container, false);

        spinner= v.findViewById(R.id.hobby);
        adapter= ArrayAdapter.createFromResource(getContext(), R.array.hobby, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        return v;
    }

}
