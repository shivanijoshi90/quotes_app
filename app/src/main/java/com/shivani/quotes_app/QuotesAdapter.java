package com.shivani.quotes_app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.shivani.quotes_app.Click.QuatosClick;

public class QuotesAdapter extends RecyclerView.Adapter<QuotesAdapter.QuotesHolder>{
    String[] quotes;
    QuatosClick click;
    Context context;

    public QuotesAdapter(String[] quotes, QuatosClick click) {
        this.quotes = quotes;
        this.click = click;

    }

    @NonNull
    @Override
    public QuotesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.quotes_item,parent,false);
        return new QuotesHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuotesHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.txtQuotes.setText(quotes[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click.getQuote(quotes[position]);
                Toast.makeText(context, ""+quotes[position], Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {

        return quotes.length;
    }

    class QuotesHolder extends ViewHolder {
        TextView txtQuotes;
        public QuotesHolder(@NonNull View itemView) {
            super(itemView);

            txtQuotes = itemView.findViewById(R.id.txtQuotes);

        }
    }
}
