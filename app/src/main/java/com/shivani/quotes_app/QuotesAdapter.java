package com.shivani.quotes_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public class QuotesAdapter extends RecyclerView.Adapter<QuotesAdapter.QuotesHolder>{

    @NonNull
    @Override
    public QuotesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.quotes_item,parent,false);
        return new QuotesHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuotesHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class QuotesHolder extends ViewHolder {
        TextView txtQuotes;
        public QuotesHolder(@NonNull View itemView) {
            super(itemView);

            txtQuotes = itemView.findViewById(R.id.txtQuotes);

        }
    }
}
