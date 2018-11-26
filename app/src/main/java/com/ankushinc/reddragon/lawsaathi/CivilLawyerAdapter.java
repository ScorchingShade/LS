package com.ankushinc.reddragon.lawsaathi;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class CivilLawyerAdapter extends RecyclerView.Adapter<CivilLawyerAdapter.CivilLawyerViewHolder> {

    private String[] data;
    public CivilLawyerAdapter(String[] data){

        this.data=data;
    }

    @NonNull
    @Override
    public CivilLawyerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.list_item_layout,parent,false);
        return new CivilLawyerViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull CivilLawyerViewHolder holder, int position) {
        String title=data[position];
        holder.txt.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class CivilLawyerViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;
        public CivilLawyerViewHolder(View itemView) {
            super(itemView);

            img=(ImageView) itemView.findViewById(R.id.list_image);
            txt=(TextView) itemView.findViewById(R.id.list_text);
        }
    }

}