package com.example.leah.presidents;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by student1 on 12/10/2015.
 */
public class PresidentDetailFragment extends Fragment {
    ViewPager viewPager;
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

       viewPager = (ViewPager) view.findViewById(R.id.viewPager);
   //    President presidents[] =(President[]) getIntent().getSerializableExtra("PRESIDENTS");


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_president_detail,container,false);


    }

    public void showPresidentDetail(President presidents[], int position){
        PresidentPagerAdapter adapter = new PresidentPagerAdapter(presidents);
       // position = getIntent().getIntExtra("POSITION", 0);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(position);
    }
}
