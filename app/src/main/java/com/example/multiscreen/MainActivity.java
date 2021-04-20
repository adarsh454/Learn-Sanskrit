package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        TextView numbers= (TextView)findViewById(R.id.numbers);
        TextView phrases = (TextView)findViewById(R.id.phrases);
        TextView family = (TextView)findViewById(R.id.family);
        TextView colors = (TextView)findViewById(R.id.colors);

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Numb = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(Numb);
            }
        });

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrase = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrase);
            }
        });

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fam = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(fam);
            }
        });

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent col = new Intent(MainActivity.this, ColorActivity.class);
                startActivity(col);
            }
        });
    }
}


