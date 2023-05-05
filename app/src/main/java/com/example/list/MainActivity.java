package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] places = { "10 место", "9 место", "8 место", "7 место", "6 место", "5 место", "4 место", "3 место", "2 место", "1 место",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.igorek);
        imageView.setImageResource(R.drawable.igor);

        ListView animeList = findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter(this, R.layout.item_prikol, R.id.text_item, places);
        animeList.setAdapter(adapter);
        animeList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, Place_Ten.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(MainActivity.this, Place_Nine.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(MainActivity.this, Place_Eight.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(MainActivity.this, Place_Seven.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(MainActivity.this, Place_Six.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(MainActivity.this, Place_Five.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(MainActivity.this, Place_Four.class);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(MainActivity.this, Place_Three.class);
                    startActivity(intent);

                }
                if (position == 8) {
                    Intent intent = new Intent(MainActivity.this, Place_Two.class);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(MainActivity.this, Place_One.class);
                    startActivity(intent);

                }

            }
        });
    }
}