package com.example.project_115_castro_sanchez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class View_4 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_4);
    }

    public void onClick (View v)
    {
        Intent i = null, chooser = null;
        if(v.getId() == R.id.button_next)
        {
            i = new Intent(View_4.this, View_4_1.class);
            View_4.this.startActivity(i);
        }

        if(v.getId() == R.id.button_home)
        {
            i = new Intent(View_4.this, MainActivity.class);
            View_4.this.startActivity(i);
        }
    }
}
