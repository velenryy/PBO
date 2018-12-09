package com.example.asus.volkerucut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtalvol, edttingvol;
    private TextView txtVolume;
    private Button btnHitung;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getActionBar().setTitle("Hitung Volume Kerucut");

        edtalvol = (EditText) findViewById(R.id.alvol);
        edttingvol = (EditText) findViewById(R.id.tingvol);
        btnHitung = (Button) findViewById(R.id.hitung);
        txtVolume = (TextView) findViewById(R.id.volume);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alas = edtalvol.getText().toString().trim();
                String tinggi = edttingvol.getText().toString().trim();

                double a = Double.parseDouble(alas);
                double t = Double.parseDouble(tinggi);

                double volume = 0.3*0.14*(a*a)*t;
                txtVolume.setText("volume = "+volume);

            }
        });
    }
}
