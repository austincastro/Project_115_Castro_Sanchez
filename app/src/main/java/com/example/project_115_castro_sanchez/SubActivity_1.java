package com.example.project_115_castro_sanchez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SubActivity_1 extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.function_1_view);

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.choices, R.layout.my_spinner);
        adapter.setDropDownViewResource(R.layout.my_spinner);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        String text = parent.getItemAtPosition(position).toString();
        answer = text;

        if(answer.equals("Rosario, La Union"))
            text = "Roasario";

        if(answer.equals("Magalang, Pampanga"))
            text = "Magalang";

        if(answer.equals("Dunarao, Capiz"))
            text = "Dunarao";

        if(answer.equals("Minglanilla, Cebu"))
            text = "Minglanilla";

        if(answer.equals("Malaybalay, Bukidnon"))
            text = "Malaybalay";

        if(answer.equals("Bislig, Surigao del Sur"))
            text = "Bislig";

        Toast.makeText(parent.getContext(), text + " is selected", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {

    }

    public void onClick (View v)
    {
        Intent i = null, chooser = null;
        if(v.getId() == R.id.button_home)
        {
            i = new Intent(SubActivity_1.this, MainActivity.class);
            SubActivity_1.this.startActivity(i);
        }

        if(v.getId() == R.id.button_submit)
        {
            if(answer.equals("Rosario, La Union"))
            {
                i = new Intent(SubActivity_1.this, View_1.class);
                SubActivity_1.this.startActivity(i);
            }

            if(answer.equals("Magalang, Pampanga"))
            {
                i = new Intent( SubActivity_1.this, View_2.class);
                SubActivity_1.this.startActivity(i);
            }

            if(answer.equals("Dunarao, Capiz"))
            {
                i = new Intent( SubActivity_1.this, View_3.class);
                SubActivity_1.this.startActivity(i);
            }

            if(answer.equals("Minglanilla, Cebu"))
            {
                i = new Intent( SubActivity_1.this, View_4.class);
                SubActivity_1.this.startActivity(i);
            }

            if(answer.equals("Malaybalay, Bukidnon"))
            {
                i = new Intent( SubActivity_1.this, View_5.class);
                SubActivity_1.this.startActivity(i);
            }

            if(answer.equals("Bislig, Surigao del Sur"))
            {
                i = new Intent( SubActivity_1.this, View_6.class);
                SubActivity_1.this.startActivity(i);
            }
        }
    }
}
