package com.example.project_115_castro_sanchez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class View_4_2 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_4_2);
    }

    public void onClick (View v)
    {
        Intent i = null, chooser = null;
        if(v.getId() == R.id.button_prev)
        {
            i = new Intent(View_4_2.this, View_4_1.class);
            View_4_2.this.startActivity(i);
        }

        if(v.getId() == R.id.button_next)
        {
            i = new Intent(View_4_2.this, View_4_3.class);
            View_4_2.this.startActivity(i);
        }
    }
}