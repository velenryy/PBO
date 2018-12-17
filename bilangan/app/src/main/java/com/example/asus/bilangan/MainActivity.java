package com.example.asus.bilangan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
      private  EditText et_bilagan1,et_bilagan2;
      private Button btjumlah;
      private Button btkurang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_bilagan1 = (EditText) findViewById(R.id.et_bilagan1);
        et_bilagan2 = (EditText) findViewById(R.id.et_bilagan2);
        btjumlah = (Button) findViewById(R.id.bt_jumlah);
        btkurang = (Button) findViewById(R.id.bt_Kurang);

        btjumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bilangan1 = et_bilagan1.getText().toString().trim();
                String bilangan2 = et_bilagan2.getText().toString().trim();

                int bil1 = Integer.parseInt(bilangan1);
                int bil2 = Integer.parseInt(bilangan2);

                int jumlah = bil1+bil2;

                Bundle bundle = new Bundle();
                bundle.putString("hasil",String.valueOf(jumlah));
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        btkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bilangan1 = et_bilagan1.getText().toString().trim();
                String bilangan2 = et_bilagan2.getText().toString().trim();

                int bil1 = Integer.parseInt(bilangan1);
                int bil2 = Integer.parseInt(bilangan2);

                int kurang = bil1-bil2;

                Bundle bundle = new Bundle();
                bundle.putString("hasil",String.valueOf(kurang));
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        }



}
