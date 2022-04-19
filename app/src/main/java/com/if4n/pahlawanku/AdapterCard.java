package com.if4n.pahlawanku;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterCard extends RecyclerView.Adapter<AdapterCard.CardViewHolder> {
    private ArrayList<ModelPahlawan> dataPahlawan;

    public AdapterCard(ArrayList<ModelPahlawan> dataPahlawan) {
        this.dataPahlawan = dataPahlawan;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_pahlawan, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        
    }

    @Override
    public int getItemCount() {
        return dataPahlawan.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView ivPahlawan;
        TextView tvNamaPahlawan, tvTentangPahlawan;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPahlawan = itemView.findViewById(R.id.iv_pahlawan);
            tvNamaPahlawan = itemView.findViewById(R.id.tv_nama_pahlawan);
            tvTentangPahlawan = itemView.findViewById(R.id.tv_tentang_pahlawan);
        }
    }

}
