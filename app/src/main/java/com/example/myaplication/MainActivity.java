package com.example.myaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText val1, val2;

    Button button;

    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val1 = findViewById(R.id.val1);
        val2 = findViewById(R.id.val2);
        result = findViewById(R.id.hasil);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(val1.getText().toString().isEmpty() || val2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Mohon isi kedua nilai", Toast.LENGTH_SHORT).show();
                    return;
                }

                int value1 =  Integer.parseInt(val1.getText().toString());
                int value2 = Integer.parseInt(val2.getText().toString());
                int hasil = value1 + value2 ;
                result.setText(String.valueOf(hasil));
            }
        }
        );
        button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(val1.getText().toString().isEmpty() || val2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Mohon isi kedua nilai", Toast.LENGTH_SHORT).show();
                    return;
                }
                int value1 = Integer.parseInt(val1.getText().toString());
                int value2 = Integer.parseInt(val2.getText().toString());
                int hasil = value1-value2;
                result.setText(String.valueOf(hasil));
             }
            }
            );

        button  = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(val1.getText().toString().isEmpty() || val2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Mohon isi kedua nilai", Toast.LENGTH_SHORT).show();
                    return;
                }
                int value1 = Integer.parseInt(val1.getText().toString());
                int value2 = Integer.parseInt(val2.getText().toString());
                int hasil = value1 * value2;
                result.setText(String.valueOf(hasil));
            }
        });

        button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val1.getText().toString().isEmpty() || val2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Mohon isi kedua nilai", Toast.LENGTH_SHORT).show();
                    return;
                }
                float value1 = Integer.parseInt(val1.getText().toString());
                float value2 = Integer.parseInt(val2.getText().toString());
                float hasil = value1 / value2;
                result.setText(String.valueOf(hasil));
            }
        });

    }
}