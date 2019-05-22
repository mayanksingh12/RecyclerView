package com.example.recyclerview2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class Fragmentname extends Fragment {


    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    int images[] = new int[]{R.drawable.icon, R.drawable.icon,R.drawable.icon,R.drawable.icon,R.drawable.icon,R.drawable.icon,R.drawable.icon,R.drawable.icon};
    String data[] = new String[]{"Beauty and Beast", "Mad Max","Inception","Journey to center of the earth","Crimes of grindalwad","velarian space","Lost  in space"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_fragmentname, container, false);
        recyclerView = v.findViewById(R.id.recyclerview1);

        linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        SingleviewAdapter singleviewAdapter = new SingleviewAdapter(data,images,getActivity());
        recyclerView.setAdapter(singleviewAdapter);

        return v;
    }


}
