package com.example.project_115_castro_sanchez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class View_4_5 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_4_5);
    }

    public void onClick (View v)
    {
        Intent i = null, chooser = null;
        if(v.getId() == R.id.button_prev)
        {
            i = new Intent(View_4_5.this, View_4_4.class);
            View_4_5.this.startActivity(i);
        }

        if(v.getId() == R.id.button_next)
        {
            i = new Intent(View_4_5.this, View_4_6.class);
            View_4_5.this.startActivity(i);
        }
    }
}
