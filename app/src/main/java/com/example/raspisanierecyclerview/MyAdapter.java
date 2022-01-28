package com.example.raspisanierecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Item> items;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.dayView.setText(items.get(position).getDay());
        holder.para1View.setText(items.get(position).getPara1());
        holder.para2View.setText(items.get(position).getPara2());
        holder.para3View.setText(items.get(position).getPara3());
        holder.para4View.setText(items.get(position).getPara4());
        holder.para5View.setText(items.get(position).getPara5());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}