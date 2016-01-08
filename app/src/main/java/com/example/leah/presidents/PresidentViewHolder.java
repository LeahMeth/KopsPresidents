package com.example.leah.presidents;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.Bind;
import butterknife.ButterKnife;

public class PresidentViewHolder extends RecyclerView.ViewHolder {

    //need an @bind for each view
    @Bind(R.id.name)
     TextView name;



    public PresidentViewHolder (View itemView){
        super(itemView);
        ButterKnife.bind(this, itemView);


    }

    public void bind(President president){

        name.setText(president.getPresident());

    }
}
