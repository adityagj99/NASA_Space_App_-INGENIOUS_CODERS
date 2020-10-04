package com.example.sleep_shift;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public class MyHolder extends ViewHolder {

    ImageView mImaeView;
    TextView  mTitle,mDes;

    public MyHolder(@NonNull View itemView) {
        super(itemView);
        this.mImaeView=itemView.findViewById(R.id.imageIv);
        this.mTitle=itemView.findViewById(R.id.titleTv);
        this.mDes=itemView.findViewById(R.id.descriptionTv);


    }
}
