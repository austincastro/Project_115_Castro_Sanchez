package com.example.project_115_castro_sanchez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class View_5_1 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_5_1);
    }

    public void onClick (View v)
    {
        Intent i = null, chooser = null;
        if(v.getId() == R.id.button_prev)
        {
            i = new Intent(View_5_1.this, View_5.class);
            View_5_1.this.startActivity(i);
        }

        if(v.getId() == R.id.button_next)
        {
            i = new Intent(View_5_1.this, View_5_2.class);
            View_5_1.this.startActivity(i);
        }
    }
}
