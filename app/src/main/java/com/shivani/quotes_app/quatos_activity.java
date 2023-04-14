package com.shivani.quotes_app;

import static com.shivani.quotes_app.R.drawable.img_10;
import static com.shivani.quotes_app.R.drawable.img_11;
import static com.shivani.quotes_app.R.drawable.img_12;
import static com.shivani.quotes_app.R.drawable.img_13;
import static com.shivani.quotes_app.R.drawable.img_14;
import static com.shivani.quotes_app.R.drawable.img_15;
import static com.shivani.quotes_app.R.drawable.img_16;
import static com.shivani.quotes_app.R.drawable.img_4;
import static com.shivani.quotes_app.R.drawable.img_5;
import static com.shivani.quotes_app.R.drawable.img_6;
import static com.shivani.quotes_app.R.drawable.img_7;
import static com.shivani.quotes_app.R.drawable.img_8;
import static com.shivani.quotes_app.R.drawable.img_9;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.shivani.quotes_app.Click.ImageClick;

public class quatos_activity extends AppCompatActivity {
    int imgArray[] = {img_4, img_5,img_6,img_7,img_8,img_9,img_10,img_11,img_12,img_13,img_14,img_15,img_16};

    private static final String TAG = "QuotesActivity";
  RecyclerView imgList;
    TextView txtQuote;
    ImageView Image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quatos);

        txtQuote = findViewById(R.id.txtQuote);
        imgList = findViewById(R.id.imgList);
        Image = findViewById(R.id.Image);

        String quote = getIntent().getStringExtra("quote");
        txtQuote.setText(quote);

        ImageClick click = new ImageClick() {
            @Override
            public void getImage(int pos) {
                Glide.with(quatos_activity.this).load(imgArray[pos]).into(Image);

            }
        };
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        ImgListAdapter adapter = new ImgListAdapter(imgArray,click);
        imgList.setLayoutManager(manager);
        imgList.setAdapter(adapter);
    }
}