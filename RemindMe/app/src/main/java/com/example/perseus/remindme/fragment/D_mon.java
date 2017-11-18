package com.example.perseus.remindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.perseus.remindme.R;

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



        return view;
    }


    public void setContext(Context context) {
        this.context = context;
    }

}
