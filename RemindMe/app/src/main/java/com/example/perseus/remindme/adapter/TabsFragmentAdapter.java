package com.example.perseus.remindme.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.perseus.remindme.R;
import com.example.perseus.remindme.fragment.AbstractTabFragment;
import com.example.perseus.remindme.fragment.D_fri;
import com.example.perseus.remindme.fragment.D_mon;
import com.example.perseus.remindme.fragment.D_sat;
import com.example.perseus.remindme.fragment.D_thu;
import com.example.perseus.remindme.fragment.D_tue;
import com.example.perseus.remindme.fragment.D_wen;

import java.util.HashMap;
import java.util.Map;

public class TabsFragmentAdapter extends FragmentPagerAdapter{

    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
       this.context = context;
        initTabMap(context);
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {

        return tabs.get(position);
    }

    @Override
    public int getCount() {

        return tabs.size();
    }

    private void initTabMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, D_mon.getInstance(context));
        tabs.put(1, D_tue.getInstance(context));
        tabs.put(2, D_wen.getInstance(context));
        tabs.put(3, D_thu.getInstance(context));
        tabs.put(4, D_fri.getInstance(context));
        tabs.put(5, D_sat.getInstance(context));
    }
}
