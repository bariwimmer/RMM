package com.example.mysqldemotrial;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);
    }

    public void onButtonClick( View v){
        if(v.getId() == R.id.bStock){
            Intent i = new Intent(MainMenu.this, Stock.class);
            startActivity(i);
        }
    }

}
