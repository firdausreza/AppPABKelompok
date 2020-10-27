package com.example.appkelompok;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class reza extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.android.appkelompok.extra.MESSAGE";
    private EditText editText;
    private Spinner spinNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reza);
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.nama_array, R.layout.activity_reza);
//        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
//        spinNama.setAdapter(adapter);

    }

    public void kirim(View view) {
        Intent intent;
        spinNama = (Spinner) findViewById(R.id.spinner);
        editText = (EditText) findViewById(R.id.chat_text);

        String nama = spinNama.getSelectedItem().toString();
        Log.d("Info spin", nama);
        String chatText = editText.getText().toString();

        switch (nama){
            case "Reza":
                Toast.makeText(this, chatText, Toast.LENGTH_SHORT).show();
                break;
            case "Yudha":
                intent = new Intent(this, activity_yudha.class);
                intent.putExtra(EXTRA_MESSAGE, chatText);
                startActivity(intent);
                break;
            case "Fadhlan":
                intent = new Intent(this, FadhlanActivity.class);
                intent.putExtra(EXTRA_MESSAGE, chatText);
                startActivity(intent);
                break;
        }

    }
}