package com.example.project_115_castro_sanchez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class View_4_3 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_4_3);
    }

    public void onClick (View v)
    {
        Intent i = null, chooser = null;
        if(v.getId() == R.id.button_prev)
        {
            i = new Intent(View_4_3.this, View_4_2.class);
            View_4_3.this.startActivity(i);
        }

        if(v.getId() == R.id.button_next)
        {
            i = new Intent(View_4_3.this, View_4_4.class);
            View_4_3.this.startActivity(i);
        }
    }
}
