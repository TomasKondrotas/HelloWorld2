package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {

    TextView TvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.TvMain = findViewById(R.id.TvMain);
    }

    public void ChangeText(View view) {

        this.TvMain.setText("Text Was Changed");
    }

    public void ColorChange(View view) {
        this.TvMain.setTextColor(Color.rgb(200, 0, 0));
    }
}