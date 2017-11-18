package com.example.perseus.remindme.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.perseus.remindme.R;
import com.example.perseus.remindme.dto.RemindRemark;

import java.util.List;


public class RemindListAdapterV2 extends RecyclerView.Adapter<RemindListAdapterV2.RemindViewHolders>{

    private List<RemindRemark> time;

    public RemindListAdapterV2(List<RemindRemark> time) {
        this.time = time;
    }

    @Override
    public RemindListAdapterV2.RemindViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.remind_item, parent, false);
        return new RemindListAdapterV2.RemindViewHolders(view);
    }

    @Override
    public void onBindViewHolder(RemindListAdapterV2.RemindViewHolders holder, int position) {
        RemindRemark teg = time.get(position);
        holder.remark.setText(teg.getTitle());

    }

    @Override
    public int getItemCount() {
        return time.size();
    }

    public static class RemindViewHolders extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView remark;

        public RemindViewHolders(View itemView) {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.cardView);
            remark = (TextView) itemView.findViewById(R.id.remark);

        }
    }
}