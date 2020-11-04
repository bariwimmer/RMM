package com.example.mysqldemotrial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    EditText user_name,password,role;
    //String str_user_name,str_password,str_role;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //Cast the input into EditText (link input)
        user_name = (EditText)findViewById(R.id.et_username);
        password = (EditText)findViewById(R.id.et_password);
        role = (EditText)findViewById(R.id.et_role);
    }

    public void OnReg(View view){

        //General format String variable = variable.getText().toString();
        String str_user_name = user_name.getText().toString();
        String str_password = password.getText().toString();
        String str_role = role.getText().toString();
        String type = "register";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        //passed the strings to the backgroundWorker
        backgroundWorker.execute(type, str_user_name, str_password,str_role);
    }
}