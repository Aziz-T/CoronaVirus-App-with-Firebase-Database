package com.k.coronavirus;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ulke_adapter extends RecyclerView.Adapter<ulke_adapter.viewHolder> {

    private List<ulke_model> ulkeList;

    public ulke_adapter(List<ulke_model> ulkeList) {
        this.ulkeList = ulkeList;
    }

    @NonNull
    @Override
    public ulke_adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ulke_item,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ulke_adapter.viewHolder holder, int position) {
        holder.setData(ulkeList.get(position).getBayrakUrl(),ulkeList.get(position).getUlkeAdı(),ulkeList.get(position).getVakaSayı(),ulkeList.get(position).getIyiSayı(),ulkeList.get(position).getOlumSayı());
    }

    @Override
    public int getItemCount() {
        return ulkeList.size();
    }

    class viewHolder extends RecyclerView.ViewHolder{
        private TextView txt1,txt2,txt3,txt4;
        private ImageView imageView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.bayrak_image);
            txt1=itemView.findViewById(R.id.ulke_adi);
            txt2=itemView.findViewById(R.id.test);
            txt3=itemView.findViewById(R.id.vaka);
            txt4=itemView.findViewById(R.id.olum);

        }

        private void setData(String url,String ulke, String vaka, String iyi, String olum ){
            Glide.with(itemView.getContext()).load(url).into(imageView);

            this.txt1.setText(ulke);
            this.txt2.setText(vaka);
            this.txt3.setText(iyi);
            this.txt4.setText(olum);

        }

    }
}
