package com.example.yumfood.customer.home.homepage;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.yumfood.R;
import com.example.yumfood.models.Store;

import java.util.List;
import java.util.Random;

public class ListStoreAdapter extends RecyclerView.Adapter<ListStoreAdapter.StoreForHomeViewHolder>{

    private final List<Store> storeList;
    private Context context;

    public ListStoreAdapter(List<Store> storeList, Context context) {
        this.storeList = storeList;
        this.context = context;
    }

    @NonNull
    @Override
    public StoreForHomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_categories_store_home, parent,false);
        return new StoreForHomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoreForHomeViewHolder holder, int position) {
        Store store = storeList.get(position);
        if(store == null)
            return ;
        holder.tvStoreName.setText(store.getStoreName());
        Glide.with(context).load("https://firebasestorage.googleapis.com/v0/b/gofooddatabase.appspot.com/o/system_image%2Fdefault_store.png?alt=media&token=89b07997-d877-40ad-bc63-4b9b6b591819").into(holder.ivStoreAvatar);
        if(!store.getAvatar().isEmpty())
        {
            Glide.with(context).load(store.getAvatar()).into(holder.ivStoreAvatar);
        }
//        holder.clStore.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent switchActivityIntent = new Intent(context, StorePageDetailActivity.class);
//                switchActivityIntent.putExtra("store", store);
//                context.startActivity(switchActivityIntent);
//            }
//        });
        Random rand = new Random();
//        int deliveryTime = 10 + rand.nextInt(40);
        double distance = rand.nextInt(4) + (double) Math.round(rand.nextDouble() * 10) / 10;
        holder.tvDeliveryTime.setText(store.getDeliveryTime());
        holder.tvDistance.setText(distance+"km");
    }

    @Override
    public int getItemCount() {
        if(storeList != null)
            return storeList.size();
        return 0;
    }

    public class StoreForHomeViewHolder  extends RecyclerView.ViewHolder{
        private TextView tvStoreName, tvDeliveryTime, tvDistance;
        private ImageView ivStoreAvatar;
        private ConstraintLayout clStore;

        public StoreForHomeViewHolder(@NonNull View itemView) {
            super(itemView);
            tvStoreName = (TextView) itemView.findViewById(R.id.txt_store_home_name);
            ivStoreAvatar = (ImageView) itemView.findViewById(R.id.img_store_home);
            clStore = (ConstraintLayout) itemView.findViewById(R.id.cl_store_home);
            tvDeliveryTime = itemView.findViewById(R.id.txt_time);
            tvDistance= itemView.findViewById(R.id.txt_distance);
        }
    }
}
