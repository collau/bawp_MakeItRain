package com.fishNco.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button showMoney;
    private Button showTag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showMoney = findViewById(R.id.button_make_rain);
        showTag = findViewById(R.id.button_show_tag);

        showMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MyTag", "onClick: Show Money");
            }
        });

    }

    public void showTag(View v) {
        Log.d("MyTag", "onClick: Show Tag");
    }
}