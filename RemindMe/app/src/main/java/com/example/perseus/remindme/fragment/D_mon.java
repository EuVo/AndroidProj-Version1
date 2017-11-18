package com.example.perseus.remindme.fragment;

import android.content.ContentProvider;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.perseus.remindme.R;
import com.example.perseus.remindme.adapter.RemindListAdapter;
import com.example.perseus.remindme.adapter.RemindListAdapterV2;
import com.example.perseus.remindme.dto.RemindDTO;
import com.example.perseus.remindme.dto.RemindRemark;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class D_mon extends AbstractTabFragment{

    private static final int LAYOUT = R.layout.monday;

    public static D_mon getInstance(Context context){
        Bundle args = new Bundle();
        D_mon fragment = new D_mon();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.DMON));

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
        data.add(new RemindDTO("Спецглавы математики - лекция", "09:45-11:25"));
        data.add(new RemindDTO("Спецглавы математики - практика", "11:35-13:10"));
        data.add(new RemindDTO("Разработка цифровой модели рельефа местности - лекция", "13:30-15:10"));
        data.add(new RemindDTO("Разработка цифровой модели рельефа местности - лабы", "15:20-16:50"));

        return data;
    }

    public void setContext(Context context) {
        this.context = context;

    }

}
