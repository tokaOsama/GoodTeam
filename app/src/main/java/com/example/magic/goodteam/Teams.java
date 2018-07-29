package com.example.magic.goodteam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Teams extends AppCompatActivity {

    TextView NameLogin ;
    TextView IdLogin ;
    TextView PassLogin ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        UserController userController = new UserController(Teams.this);


        NameLogin = (TextView) findViewById(R.id.name_info);
        IdLogin   = (TextView) findViewById(R.id.ID_info);
        PassLogin = (TextView) findViewById(R.id.pass_info);

        Intent intent = getIntent();

        if(userController.IsRemember()){

            User user = userController.GetData();
            NameLogin.setText(NameLogin.getText() + user.getLName());
            IdLogin.setText(IdLogin.getText() + user.getLId());
            PassLogin.setText(PassLogin.getText() + user.getLPass());
        }
        else {
            User user = (User) intent.getSerializableExtra("user");
            NameLogin.setText(NameLogin.getText() + user.getLName());
            IdLogin.setText(IdLogin.getText() + user.getLId());
            PassLogin.setText(PassLogin.getText() + user.getLPass());
        }
      //  Toast.makeText(Teams.this, "Done",Toast.LENGTH_SHORT).show();

    }
}
