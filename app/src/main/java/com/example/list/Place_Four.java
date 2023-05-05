package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Place_Four extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_four);
    }

    ImageButton imageButton;
    TextView txt;
    TextView txt2;
    boolean flag = true;
        public void onClick(View v)
        {
            if (flag) {
                imageButton.setImageResource(R.drawable.povelitel1);

            }
            else
                imageButton.setImageResource(R.drawable.povelitel);
            flag = !flag;
        }
}