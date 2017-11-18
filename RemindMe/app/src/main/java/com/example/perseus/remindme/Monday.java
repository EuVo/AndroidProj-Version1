package com.example.perseus.remindme;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/**
 * Created by Perseus on 18.11.2017.
 */

public class Monday extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
    View v = inflater.inflate(R.layout.monday,container,false);
    return v;
    }
}
