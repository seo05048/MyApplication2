package com.example.myapplication.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.ui.notice.Person;
import com.example.myapplication.ui.notice.PersonAdapter;

public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){

//        RecyclerView recyclerView = findViewById().id.recyclerView);
//
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
//        recyclerView.setLayoutManager(layoutManager);
//        PersonAdapter adapter = new PersonAdapter();
//
//        adapter.addItem(new Person(20190529, "6번째 업데이트가 끝났습니다."));
//        adapter.addItem(new Person(20190523, "5번째 업데이트가 끝났습니다."));
//        adapter.addItem(new Person(20190521, "4번째 업데이트가 끝났습니다."));
//        adapter.addItem(new Person(20190518, "3번째 업데이트가 끝났습니다."));
//        adapter.addItem(new Person(20190516, "2번째 업데이트가 끝났습니다."));
//        adapter.addItem(new Person(20190515, "1번째 업데이트가 끝났습니다."));
//
//        recyclerView.setAdapter(adapter);

        return inflater.inflate(R.layout.fragment1, container, false);
    }
}
