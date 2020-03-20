package com.example.lesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText editText1 ;
    EditText editText2 ;
    EditText editText3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button=findViewById(R.id.botton_two);
       editText1=findViewById(R.id.edit_text_one);
        editText2=findViewById(R.id.edit_text_two);
         editText3=findViewById(R.id.edit_text_three);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String someText1 = editText1.getText().toString();
                String someText2 = editText2.getText().toString();
                String someText3 = editText3.getText().toString();


                Intent intent = new Intent();
                intent.putExtra("one_text_key",someText1);
                intent.putExtra("two_text_key",someText2);
                intent.putExtra("three_text_key",someText3);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
