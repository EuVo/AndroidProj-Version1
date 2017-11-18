package com.example.perseus.remindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.perseus.remindme.R;

public class D_fri extends AbstractTabFragment{

    private static final int LAYOUT = R.layout.friday;

    public static D_fri getInstance(Context context){
        Bundle args = new Bundle();
        D_fri fragment = new D_fri();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.DFRI));

        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);



        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}