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

public class Fragment3 extends Fragment {//원래는 App->Fragment였음
    private ArrayAdapter adapter;
    private Spinner spinner;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){


        return inflater.inflate(R.layout.fragment3, container, false);
    }

}
