package com.david.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class FirstScreenActivity extends AppCompatActivity {
    //Initializing variable
    EditText inputName;
    EditText inputEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen1);
        inputName=(EditText) findViewById(R.id.name);
        inputEmail=(EditText) findViewById(R.id.email);
        Button btnNextScreen=(Button) findViewById(R.id.btnNextScreen);
        //Listening to Button event
        btnNextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen=new Intent(getApplicationContext(),SecondScreenActivity.class);
                //sending data to another Activity
                nextScreen.putExtra("name",inputName.getText().toString());
                nextScreen.putExtra("email",inputEmail.getText().toString());
                Log.e("n",inputName.getText()+"."+inputEmail.getText());
                startActivity(nextScreen);
            }
        });
    }
}

