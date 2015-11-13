package com.example.leah.presidents;


import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PresidentPagerAdapter extends PagerAdapter{

    private President presidents[];
    ImageView image;

    public PresidentPagerAdapter(President[] presidents){
        this.presidents = presidents;
    }

    @Override
    public int getCount() {
        return presidents.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        LayoutInflater inflater = LayoutInflater.from(container.getContext());
        View view = inflater.inflate(R.layout.president_pager_item, null);

        ImageView image = (ImageView) view.findViewById(R.id.image);
        TextView name = (TextView) view.findViewById(R.id.name);
        TextView number = (TextView) view.findViewById(R.id.number);
        TextView birthDate = (TextView) view.findViewById(R.id.birthDate);
        TextView deathDate = (TextView) view.findViewById(R.id.deathDate);
        TextView tookOffice = (TextView) view.findViewById(R.id.tookOffice);
        TextView leftOffice = (TextView) view.findViewById(R.id.leftOffice);
        TextView party = (TextView) view.findViewById(R.id.party);


        President president = presidents[position];
        //image.setImageDrawable(president.getImage());
        name.setText(president.getPresident());
        number.setText(String.valueOf(president.getNumber()));
        birthDate.setText(String.valueOf(president.getBirthYear()));
        deathDate.setText(String.valueOf(president.getDeathYear()));
        tookOffice.setText(president.getTookOffice());
        leftOffice.setText(president.getLeftOffice());
        party.setText(president.getParty());


        container.addView(view);
        return view;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((View) object);

    }

}
