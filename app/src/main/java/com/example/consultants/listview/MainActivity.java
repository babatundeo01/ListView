package com.example.consultants.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.lib.MyClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private MyClass myClass;
    private ArrayList<String> list;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myClass = new MyClass();
        list = myClass.createList(100);
        MyListViewAdapter adapter = new MyListViewAdapter(this, list);

        listView = findViewById(R.id.listViewID);
        listView.setAdapter(adapter);
    }
}
