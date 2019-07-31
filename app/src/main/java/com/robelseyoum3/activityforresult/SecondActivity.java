package com.robelseyoum3.activityforresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private EditText et_insert;
    private Button btn_insert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et_insert = findViewById(R.id.et_name);
        btn_insert = findViewById(R.id.btn_second_insertname);


        btn_insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            sendBackName();
            }
        });
    }

    private void sendBackName(){

        Intent intent = new Intent();
        intent.putExtra("result", et_insert.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}
