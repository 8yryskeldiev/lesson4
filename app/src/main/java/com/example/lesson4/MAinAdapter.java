package com.example.lesson4;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MAinAdapter extends RecyclerView.Adapter<MainViewHolder> {//по запросу RW этот адаптер обращается к вьюхолдеру за заполнением и созданием

    ArrayList<String>data;//массив для вызова по индексу, заполнение RW
    int viewHolderCounter=0;

    public  MAinAdapter(){
        data= new ArrayList<>();

    }


    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("ololo","onCreateViewHolder"+ viewHolderCounter);
        viewHolderCounter++;

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());//

        View view=inflater.inflate(R.layout.view_holder_main,parent,false);
   return new MainViewHolder(view);
   }

    @Override

    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        Log.d("ololo","onBindViewHolder"+ position);
       holder.textView.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    public void addText(String s){
        data.add(s);
    }
}
