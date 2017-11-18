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

public class D_tue extends AbstractTabFragment{

    private static final int LAYOUT = R.layout.thuesday;


    public static D_tue getInstance(Context context){
        Bundle args = new Bundle();
        D_tue fragment = new D_tue();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.DTUE));

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