package com.sunbeam.exam_86991.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sunbeam.exam_86991.R;
import com.sunbeam.exam_86991.activity.DetailsActivity;
import com.sunbeam.exam_86991.entity.Product;

import java.util.List;
import java.util.zip.Inflater;

public class ProductAdapter  extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {

    Context context;

    List<Product> productList;



    public ProductAdapter(Context context, List<Product> productList) {
        this.context = context;
        this.productList = productList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.productlist,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
       Product product = productList.get(position);
       holder.productId.setText(" "+ product.getId());
       holder.productName.setText(product.getName());

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{



        TextView productId,productName;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            productId = itemView.findViewById(R.id.productId);
            productName = itemView.findViewById(R.id.productName);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(context, DetailsActivity.class);
                    context.startActivity(intent);
                }
            });



        }
    }
}
