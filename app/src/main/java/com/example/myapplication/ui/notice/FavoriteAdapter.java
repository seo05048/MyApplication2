package com.example.myapplication.ui.notice;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;

import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.ui.fragment.Fragment1;

/**
 * Created by js on 2018-05-28.
 */

public class FavoriteAdapter extends RecyclerView.Adapter<FavoriteAdapter.MyViewHolder>{
    private LinkedList<Favorite> mDataset;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public ImageView img;

        //ViewHolder
        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            img =  (ImageView) view.findViewById(R.id.delete);
        }
    }

    public FavoriteAdapter(LinkedList<Favorite> myData){
        this.mDataset = myData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.person_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavoriteAdapter.MyViewHolder holder, final int position) {

        holder.name.setText(mDataset.get(position).getName());

        //클릭이벤트
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                Toast.makeText(activity,"해당 공지가 삭제되었습니다.", Toast.LENGTH_LONG).show();
                //int pos = (int) view.getTag();
                mDataset.remove(position);
                notifyDataSetChanged();

            }
        });

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}


