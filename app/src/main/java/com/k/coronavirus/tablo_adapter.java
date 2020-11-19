package com.k.coronavirus;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

public class tablo_adapter extends RecyclerView.Adapter<tablo_adapter.viewHolder> {

    private List<tablo_model> tabloList;

    public tablo_adapter(List<tablo_model> tabloList) {
        this.tabloList = tabloList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tablo_item,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.setData(tabloList.get(position).getUrl());

    }

    @Override
    public int getItemCount() {
         return tabloList.size();
    }

    class viewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.tablo_image);

        }

        private void setData(String url){
            Glide.with(itemView.getContext()).load(url).into(imageView);
           }
    }


}
