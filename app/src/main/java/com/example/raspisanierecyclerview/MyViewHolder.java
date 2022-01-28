package com.example.raspisanierecyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView dayView, para1View, para2View, para3View, para4View, para5View;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        dayView = itemView.findViewById(R.id.day);
        para1View = itemView.findViewById(R.id.para1);
        para2View = itemView.findViewById(R.id.para2);
        para3View = itemView.findViewById(R.id.para3);
        para4View = itemView.findViewById(R.id.para4);
        para5View = itemView.findViewById(R.id.para5);
    }
}
