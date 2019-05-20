package com.example.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    String data[] = new String[]{"12", "42", "42", "42", "42", "42", "42", "42", "42", "42", "42", "42", "42", "42", "42", "42", "42", "42", "42", "42", "42", "42", "42", "42", "42"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recview);
        LinearLayoutManager linearLayou = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayou);
        recyclerView.setAdapter(new MyAdap(data, this));
    }
}

class MyAdap extends RecyclerView.Adapter<MyAdap.myHold> {
    String data[];
    Context context;

    public MyAdap(String[] data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public myHold onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.single, viewGroup, false);
        myHold myHold = new myHold(v);
        return myHold;
    }

    @Override
    public void onBindViewHolder(@NonNull myHold myHold, int i) {
        myHold.textView.setText(data[i]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    class myHold extends RecyclerView.ViewHolder {
        TextView textView;

        public myHold(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textview);
        }
    }

}
