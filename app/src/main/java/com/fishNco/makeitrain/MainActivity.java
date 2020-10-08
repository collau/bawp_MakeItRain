package com.fishNco.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private Button showMoney;
    private Button showTag;

    private TextView moneyText;

    private int moneyCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showMoney = findViewById(R.id.button_make_rain);
        showTag = findViewById(R.id.button_show_tag);
        moneyText = findViewById(R.id.money_text);

        showMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
                moneyCounter += 1000;
                moneyText.setText(String.valueOf(numberFormat.format(moneyCounter)));
            }
        });

    }

    public void showTag(View v) {
        Log.d("MyTag", "onClick: Show Tag");
    }
}