package com.example.asus.bilangan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    protected void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity2);
        TextView tvhasil = (TextView) findViewById(R.id.tv_hasil);

        Bundle bundle = getIntent().getExtras();
        tvhasil.setText(bundle.getString("hasil"));
    }
}
