
package com.example.magic.goodteam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ID ;
    EditText Name ;
    EditText Pass ;
    CheckBox Remember ;
    Button   login;
    Button  register ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ID       = (EditText) findViewById(R.id.id);
        Name     = (EditText) findViewById(R.id.Name);
        Pass     = (EditText) findViewById(R.id.Pass);
        Remember = (CheckBox) findViewById(R.id.remember_me);
        login    = (Button)   findViewById(R.id.login);
        register = (Button)   findViewById(R.id.register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              /*  User user = new User();
                user.setLName(Name.getText().toString());
                user.setLId(ID.getText().toString());
                user.setLPass(Pass.getText().toString());
                if(Remember.isChecked()){
                    UserController userController = new UserController(MainActivity.this);
                    userController.SaveData(user);
                }*/
                Intent intent = new Intent(MainActivity.this,Posts_Teams.class);
                startActivity(intent);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , Register.class);
                startActivity(intent);
            }
        });
    }

}
