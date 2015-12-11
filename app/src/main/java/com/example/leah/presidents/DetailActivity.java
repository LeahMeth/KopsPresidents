package com.example.leah.presidents;


import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //call showPresidentDetail
        PresidentDetailFragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.detailFragment);
        President presidents[] =(President[]) getIntent().getSerializableExtra("PRESIDENTS");
        int position = getIntent().getIntExtra("POSITION", 0);
        fragment.showPresidentDetail(presidents, position);

    }
}
