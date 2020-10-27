package com.example.appkelompok;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activity_yudha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yudha);
        Intent intent = getIntent();
        String msg = intent.getStringExtra(reza.EXTRA_MESSAGE);
        Log.d("Info text", msg);
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}