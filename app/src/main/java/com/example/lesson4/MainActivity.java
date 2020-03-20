package com.example.lesson4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String resultOne;
    String resultTwo;
    String resultThree;
    RecyclerView recyclerView;
    MAinAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);

        recyclerView=findViewById(R.id.recycler_view);
         adapter=new MAinAdapter();
        recyclerView.setAdapter(adapter);




        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,SecondActivity.class);
               startActivityForResult(intent,42);

            }
        });



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 42 && resultCode == RESULT_OK &&data!=null) {
            resultOne = data.getStringExtra("one_text_key");
            resultTwo = data.getStringExtra("two_text_key");
            resultThree= data.getStringExtra("three_text_key");
            adapter.addText(resultOne);
            adapter.notifyDataSetChanged();
            adapter.addText(resultTwo);
            adapter.notifyDataSetChanged();
            adapter.addText(resultThree);
            adapter.notifyDataSetChanged();


        }
    }
}
