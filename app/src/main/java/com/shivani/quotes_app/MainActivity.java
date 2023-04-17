package com.shivani.quotes_app;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.shivani.quotes_app.Click.QuatosClick;
import com.shivani.quotes_app.Utils.utils;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvList = findViewById(R.id.rcvList);

        QuatosClick click = new QuatosClick() {
            @Override
            public void getQuote(String quote) {
                Intent intent = new Intent(MainActivity.this, quatos_activity.class);
                intent.putExtra("quote",quote);
                startActivity(intent);
            }
        };

        RecyclerView.LayoutManager manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        QuotesAdapter adapter = new QuotesAdapter(utils.quotes,click);
        rcvList.setLayoutManager(manager);
        rcvList.setAdapter(adapter);
    }
}