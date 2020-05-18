package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView helloWorldTextView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setOnBtnClickListener();
    }
    private void initViews() {
        helloWorldTextView= findViewById(R.id.helloWorldTextView);
        button= findViewById(R.id.button);
    }
    private void setOnBtnClickListener(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helloWorldTextView.setText("Привет, гн ботик");
            }
        });
    }
}
