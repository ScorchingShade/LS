package com.ankushinc.reddragon.lawsaathi;

import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class CriminalLawyerAdapter extends RecyclerView.Adapter<CriminalLawyerAdapter.CriminalLawyerViewHolder> {

    private String[] data;
    public CriminalLawyerAdapter(String[] data){

        this.data=data;
    }

    @NonNull
    @Override
    public CriminalLawyerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.list_item_layout,parent,false);
        return new CriminalLawyerViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull CriminalLawyerViewHolder holder, int position) {
        String title=data[position];
        holder.txt.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class CriminalLawyerViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;
        public CriminalLawyerViewHolder(View itemView) {
            super(itemView);

            img=(ImageView) itemView.findViewById(R.id.list_image);
            txt=(TextView) itemView.findViewById(R.id.list_text);
        }
    }

}