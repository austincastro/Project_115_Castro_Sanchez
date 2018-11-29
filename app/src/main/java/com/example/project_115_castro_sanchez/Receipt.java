package com.example.project_115_castro_sanchez;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Receipt extends AppCompatActivity
{
    TextView eTitle_2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receipt);
        eTitle_2 = findViewById(R.id.Title_2);
    }

    public void onClick(View v)
    {
        Intent i = null, chooser = null;
        if(v.getId() == R.id.button_home)
        {
            i = new Intent(Receipt.this, MainActivity.class);
            Receipt.this.startActivity(i);
        }

        if(v.getId() == R.id.button_display)
        {
            SharedPreferences sp = getSharedPreferences("data1", Context.MODE_PRIVATE);
            String val_1 = sp.getString("name",null);
            String val_2 = sp.getString("amount",null);
            String val_3 = sp.getString("location", null);

            String message = "Thank you!!!\n" + val_1 + "\nYou've successfully\ndonated ₱" + val_2 + ".00\nto " + val_3;
            eTitle_2.setText(message);
        }
    }
}
