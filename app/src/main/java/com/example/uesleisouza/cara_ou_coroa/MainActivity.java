package com.example.uesleisouza.cara_ou_coroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private String[] option = {"Cara","Coroa"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random random = new Random();
                int position = random.nextInt(2);

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("result", option[position]);

                startActivity(intent);
            }
        });
    }
}
