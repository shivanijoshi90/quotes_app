package com.shivani.quotes_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.shivani.quotes_app.Utils.utils;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    RecyclerView rcvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvList = findViewById(R.id.rcvList);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
        QuotesAdapter adapter = new QuotesAdapter(utils.quotes.length);
        rcvList.setLayoutManager(manager);
        rcvList.setAdapter(adapter);
    }
}