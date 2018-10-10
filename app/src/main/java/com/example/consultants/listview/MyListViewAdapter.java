package com.example.consultants.listview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class MyListViewAdapter extends ArrayAdapter<String> {
    private final Activity activity;
    private final ArrayList<String> strArray;
    private TextView textView;

    public MyListViewAdapter(Activity activity, ArrayList<String> strArray) {
        super(activity, R.layout.listview_item, strArray);
        this.activity = activity;
        this.strArray = strArray;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.listview_item, viewGroup, false);
        }

        textView = view.findViewById(R.id.textView);
        String value = strArray.get(i);
        textView.setText(value);
        return view;
    }

}
