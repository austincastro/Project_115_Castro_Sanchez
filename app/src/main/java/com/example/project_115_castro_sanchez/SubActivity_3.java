package com.example.project_115_castro_sanchez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class SubActivity_3 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.function_3_about);

        TextView t = (TextView) findViewById(R.id.Title_5);
        t.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void onClick (View v)
    {
        Intent i = null, chooser = null;
        if(v.getId() == R.id.button_home)
        {
            i = new Intent(SubActivity_3.this, MainActivity.class);
            SubActivity_3.this.startActivity(i);
        }
    }
}
