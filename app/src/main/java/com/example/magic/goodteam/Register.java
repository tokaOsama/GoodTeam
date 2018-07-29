package com.example.magic.goodteam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    EditText Name ;
    EditText Age ;
    EditText Specialty ;
    EditText College ;
    Spinner Granger ;
    Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Name      = (EditText) findViewById(R.id.Name);
        Age       = (EditText) findViewById(R.id.age);
        Specialty = (EditText) findViewById(R.id.specialty);
        College   = (EditText) findViewById(R.id.college);
        Granger   = (Spinner)  findViewById(R.id.grander);
        reg       = (Button)   findViewById(R.id.reg);



        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Register.this,"Done" , Toast.LENGTH_LONG).show();
            }
        });

    }

}
