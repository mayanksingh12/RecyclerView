package com.example.recyclerview2;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SingleviewAdapter extends RecyclerView.Adapter<SingleviewAdapter.MyViewHolder> {


    String[] result;
    int image[];

Context c;

    public SingleviewAdapter(String[] result, int[] image,Context c) {
        this.result = result;
        this.image = image;
        this.c=c;
    }


    @Override
    public SingleviewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemview = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.singleview, viewGroup, false);
        return new MyViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull final SingleviewAdapter.MyViewHolder myViewHolder, int i) {

        myViewHolder.textView.setText(result[i]);
        myViewHolder.imageView1.setImageResource(image[i]);
        myViewHolder.imageView2.setImageResource(image[i]);

        myViewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(c, myViewHolder.textView.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        myViewHolder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(c,Main2Activity.class);
                c.startActivity(i);


            }
        });


    }

    @Override
    public int getItemCount() {
        return result.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView1, imageView2;
        TextView textView;
        LinearLayout linearLayout;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView1 = itemView.findViewById(R.id.image1);
            textView = itemView.findViewById(R.id.txt1);
            imageView2 = itemView.findViewById(R.id.image2);
             linearLayout=itemView.findViewById(R.id.layout1);

        }
    }
}


