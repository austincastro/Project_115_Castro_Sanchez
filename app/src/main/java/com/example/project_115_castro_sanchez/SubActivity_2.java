package com.example.project_115_castro_sanchez;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class SubActivity_2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    String answer;
    EditText eInput_1, eInput_2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.function_2_donate);

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.choices, R.layout.my_spinner);
        adapter.setDropDownViewResource(R.layout.my_spinner);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        eInput_1 = findViewById(R.id.Input_1);
        eInput_2 = findViewById(R.id.Input_2);
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

    public void onClick(View v)
    {
        Intent i = null, chooser = null;
        if(v.getId() == R.id.button_home)
        {
            i = new Intent(SubActivity_2.this, MainActivity.class);
            SubActivity_2.this.startActivity(i);
        }

        if(v.getId() == R.id.button_submit)
        {
            SharedPreferences sp = getSharedPreferences("data1", Context.MODE_PRIVATE);
            SharedPreferences.Editor writer = sp.edit();

            String val_1 = eInput_1.getText().toString();
            String val_2 = eInput_2.getText().toString();

            writer.putString("name",val_1);
            writer.putString("amount",val_2);
            writer.putString("location",answer);
            writer.commit();

            i = new Intent(SubActivity_2.this, Receipt.class);
            SubActivity_2.this.startActivity(i);
        }
    }
}
