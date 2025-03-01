package com.sunbeam.fragmentapp1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sunbeam.fragmentapp1.R;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.MyViewHolder> {

   Context context;
   List<String> countries;

    public CountryAdapter(Context context, List<String> countries) {
        this.context = context;
        this.countries = countries;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View view = LayoutInflater.from(context).inflate(R.layout.list_country,null);
     return  new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.textCountry.setText(countries.get(position));
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    class MyViewHolder extends  RecyclerView.ViewHolder{
        TextView textCountry;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textCountry = itemView.findViewById(R.id.textCountry);

        }
    }
}
