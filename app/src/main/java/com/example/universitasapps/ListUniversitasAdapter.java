package com.example.universitasapps;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListUniversitasAdapter extends RecyclerView.Adapter<ListUniversitasAdapter.ListViewHolder> {
    private ArrayList<Universitas> listUniversitas;
    private OnItemClickCallback onItemClickCallback;

    void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    ListUniversitasAdapter(ArrayList<Universitas> list) {
        this.listUniversitas = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_univ, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Universitas universitas = listUniversitas.get(position);

        Glide.with(holder.itemView.getContext())
                .load(universitas.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvName.setText(universitas.getName());
        holder.tvDetail.setText(universitas.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //onItemClickCallback.onItemClicked(listUniversitas.get(holder.getAdapterPosition()));

                //Mendapatkan Nama pada salah satu item yang diklik, berdasarkan posisinya
                Universitas getName = listUniversitas.get(holder.getAdapterPosition);
                Universitas getDetail = listUniversitas.get(holder.getAdapterPosition);
                Universitas getPhoto = listUniversitas.get(holder.getAdapterPosition);



            }
        });
    }

    @Override
    public int getItemCount() {
        return listUniversitas.size();
    }


    static class ListViewHolder extends RecyclerView.ViewHolder {
        public int getAdapterPosition;
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Universitas data);
        //Berpindah Activity dan Mempassing data Nama pada Activity Selanjutnya
        Intent sendData = new Intent(ListUniversitasAdapter.this, UniversitasData.class);
        sendData.putExtra("MyName", getName,getDetail,getPhoto,);
        startActivity(sendData);
    }
}