package com.example.perseus.remindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.perseus.remindme.R;
import com.example.perseus.remindme.adapter.RemindListAdapter;
import com.example.perseus.remindme.dto.RemindDTO;

import java.util.ArrayList;
import java.util.List;

public class D_sat extends AbstractTabFragment{

    private static final int LAYOUT = R.layout.saturday;


    public static D_sat getInstance(Context context){
        Bundle args = new Bundle();
        D_sat fragment = new D_sat();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.DSAT));

        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recycleView);
        rv.setLayoutManager(new LinearLayoutManager(context));
        rv.setAdapter(new RemindListAdapter(createMockRemindListData()));
        return view;
    }


    private List<RemindDTO> createMockRemindListData() {
        List<RemindDTO> data = new ArrayList<>();
        data.add(new RemindDTO("Логика и методология науки - лекция", "09:20-10:50"));
        data.add(new RemindDTO("Логика и методология науки - практика", "11:10-12:45"));

        return data;
    }

    public void setContext(Context context) {
        this.context = context;
    }

}
