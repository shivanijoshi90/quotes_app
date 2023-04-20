package com.shivani.quotes_app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.shivani.quotes_app.Click.ImageClick;

public class ImgListAdapter extends RecyclerView.Adapter<ImgListAdapter.ImageListHolder> {
    int[] imgArray;
  ImageClick click;
    Context context;

    public ImgListAdapter(int[] imgArray, ImageClick click) {
        this.imgArray = imgArray;
        this.click = click;

    }

    @NonNull
    @Override
    public ImageListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.img_item,parent,false);
        return new ImageListHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageListHolder holder, @SuppressLint("RecyclerView") int position) {
        Glide.with(context).load(imgArray[position]).into(holder.imgItem);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                click.getImage(position);
            }
        });

    }

    @Override
    public int getItemCount() {

        return imgArray.length;
    }

    class ImageListHolder extends RecyclerView.ViewHolder {
            ImageView imgItem;

        public ImageListHolder(@NonNull View itemView) {
            super(itemView);
            imgItem = itemView.findViewById(R.id.imgItem);
        }
    }

    }