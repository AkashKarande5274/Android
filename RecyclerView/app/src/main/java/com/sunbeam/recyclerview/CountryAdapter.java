package com.sunbeam.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.MyViewHolder> {

    Context context;

    List<String> countriesList;

    public CountryAdapter(Context context, List<String> countrieslist) {
        this.context = context;
        this.countriesList = countrieslist;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.countrylist,null);
        return  new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.textcountry.setText(countriesList.get(position));

    }




    @Override
    public int getItemCount() {
        return countriesList.size();
    }

    class  MyViewHolder extends RecyclerView.ViewHolder{

        TextView textcountry;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textcountry = itemView.findViewById(R.id.textcountry);

            textcountry.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, countriesList.get(getAdapterPosition()) + "  is selected", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
