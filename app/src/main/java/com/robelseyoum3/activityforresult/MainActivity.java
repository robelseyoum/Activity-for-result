package com.robelseyoum3.activityforresult;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_result;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_result = findViewById(R.id.tv_show_result);
        button = findViewById(R.id.btn_go);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transition();
            }
        });
    }

    private void transition()
    {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, 1);
    }


    //overide the activity
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //check if the request code is the same

        if(requestCode == 1){
            if(resultCode == RESULT_OK){
                tv_result.setText(data.getStringExtra("result"));
            }
            if(resultCode == RESULT_CANCELED){
                //Handle case, if we don't get any response
            }
        }
    }
}
