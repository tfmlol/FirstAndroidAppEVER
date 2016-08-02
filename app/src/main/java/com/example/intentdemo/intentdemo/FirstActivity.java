package com.example.intentdemo.intentdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class FirstActivity extends AppCompatActivity {
    // Creates our empty activity, This is like our Main method for Android
    @Override
    // Override allows us to manipulate the onCreate function the way we want it to
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // super calls the constructor from the parent class
        setContentView(R.layout.activity_first);
        // calls the layout final and places it on the screen
        initButtonActivity();
        // calling our method
    }

    public void initButtonActivity() {
        final Button button = (Button) findViewById(R.id.btnListener);
        // Created a new button Object, you do not need to call new in Android because it calls it from the library
        button.setOnClickListener(new View.OnClickListener() {
            // Attaching the listener to the corresponding button

            public void onClick(View V) {
                Intent i = new Intent(FirstActivity.this, SecondActivity.class);
                // intent i is located in THIS scope, and it will take us to the SecondActivity.class
                startActivity(i);
                // passes the intent to the Activity
            }
        });
    }

    public void LoadXMLClick(View view){
        Intent i = new Intent(FirstActivity.this, SecondActivity.class);
        startActivity(i);
    }

    public void LoadSite(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.google.ca"));
        startActivity(i);
    }



}
