package com.example.myapplication.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.ui.notice.FavoriteAdapter;
import com.example.myapplication.ui.notice.Favorite;
import java.util.LinkedList;

public class Fragment1 extends Fragment {

    private LinkedList<Favorite> favoritesList = new LinkedList<>();
    private RecyclerView recyclerView;
    private FavoriteAdapter mAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment1, container, false);

        //recyclerview
        recyclerView = v.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        mAdapter = new FavoriteAdapter(favoritesList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        prepareData();

    }

    //데이터 준비(최종적으로는 동적으로 추가하거나 삭제할 수 있어야 한다. 이 데이터를 어디에 저장할지 정해야 한다.)
    private void prepareData() {

        favoritesList.clear();
        favoritesList.add(new Favorite("1.1버전이 업데이트 되었습니다."));
        favoritesList.add(new Favorite("맛집 그룹 채팅방이 오픈되었습니다."));
        favoritesList.add(new Favorite("운동을 좋아하는 그룹 채팅방이 오픈되었습니다."));
        favoritesList.add(new Favorite("맥주를 좋아하는 그룹 채팅방이 오픈되었습니다."));
        favoritesList.add(new Favorite("고민상담소 그룹 채팅방이 오픈되었습니다."));
        favoritesList.add(new Favorite("디저트 탐방 그룹 채팅방이 오픈되었습니다."));
        favoritesList.add(new Favorite("PC방을 가는 그룹 채팅방이 오픈되었습니다."));
    }
}
