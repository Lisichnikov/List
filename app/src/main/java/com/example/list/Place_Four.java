package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Place_Four extends AppCompatActivity {

    ImageButton it;
    TextView txt;
    TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_four);
        it = findViewById(R.id.it);
        txt = findViewById(R.id.txt);
        txt2 = findViewById(R.id.txt2);
        it.setOnLongClickListener(view -> {
            it.setImageResource(R.drawable.povelitel1);
            txt.setText(R.string.povelitel1);
            txt2.setText(R.string.poveliteld1);
            return false;
        });
    }
}