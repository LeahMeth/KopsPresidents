package com.example.leah.presidents;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PresidentRecyclerViewAdapter extends RecyclerView.Adapter<PresidentViewHolder>{

    private President presidents[];
    private View.OnClickListener onClickListener;

    public PresidentRecyclerViewAdapter(President[] presidents, OnPresidentSelectedListener listener){
        this.presidents = presidents;
        this.onClickListener = onClickListener;
    }


    @Override
    public PresidentViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.president_list_item, parent, false);

        return new PresidentViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(final PresidentViewHolder holder, final int position){
        holder.bind(presidents[position]);

        holder.itemView.setOnClickListener(onClickListener, new View.OnClickListener(){
                    @Override
                public void onClick(View v){
                        listener.onSelect(presidents,position);
                    }
                }
        );
    }

    @Override
    public int getItemCount(){
        return presidents.length;
    }

}
