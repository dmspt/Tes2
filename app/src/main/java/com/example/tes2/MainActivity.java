package com.example.tes2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Button btn_selesai;
    EditText edt_nama;
    ImageButton img_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_selesai = (Button) findViewById(R.id.btnSelesai);
        edt_nama = (EditText) findViewById(R.id.edtNama);
        img_btn = (ImageButton) findViewById(R.id.imgBtnPhoto);

        btn_selesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });

    }
}