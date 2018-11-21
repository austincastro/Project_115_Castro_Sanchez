package com.example.project_115_castro_sanchez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick (View v)
    {
        Intent i = null, chooser = null;
        if(v.getId() == R.id.button_1)
        {
            i = new Intent(MainActivity.this, SubActivity_1.class);
            MainActivity.this.startActivity(i);
        }

        if(v.getId() == R.id.button_2)
        {
            i = new Intent(MainActivity.this, SubActivity_2.class);
            MainActivity.this.startActivity(i);
        }

        if(v.getId() == R.id.button_3)
        {
            i = new Intent(MainActivity.this, SubActivity_3.class);
            MainActivity.this.startActivity(i);
        }
    }
}
