package com.ppb.kelompok;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    
    private CheckBox cbEdu, cbLife, cbTech;
    private Button btSubmit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setCheckBoxListener();

    }

    private void setCheckBoxListener() {
        cbEdu = (CheckBox) findViewById(R.id.cb_education);
        cbLife = (CheckBox) findViewById(R.id.cb_lifestyle);
        cbTech = (CheckBox) findViewById(R.id.cb_technology);
        cbEdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox) view).isChecked()) {
                    Toast.makeText(MainActivity.this,
                            "Anda memilih Education", Toast.LENGTH_LONG).show(); }
            }});
        cbLife.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (((CheckBox) view).isChecked()) {
                            Toast.makeText(MainActivity.this,
                                    "Anda memilih Lifestyle", Toast.LENGTH_LONG).show();
                        }
            }
        });
        cbTech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox) view).isChecked()) {
                    Toast.makeText(MainActivity.this,
                            "Anda memilih Technology", Toast.LENGTH_LONG).show();}}});}}