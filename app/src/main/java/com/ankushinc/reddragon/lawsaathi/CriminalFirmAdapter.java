package com.ankushinc.reddragon.lawsaathi;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class CriminalFirmAdapter extends RecyclerView.Adapter<CriminalFirmAdapter.CriminalFirmViewHolder> {

    private String[] data;
    public CriminalFirmAdapter(String[] data){

        this.data=data;
    }

    @NonNull
    @Override
    public CriminalFirmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.list_item_layout,parent,false);
        return new CriminalFirmViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull CriminalFirmViewHolder holder, int position) {
        String title=data[position];
        holder.txt.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class CriminalFirmViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;
        public CriminalFirmViewHolder(View itemView) {
            super(itemView);

            img=(ImageView) itemView.findViewById(R.id.list_image);
            txt=(TextView) itemView.findViewById(R.id.list_text);
        }
    }

}