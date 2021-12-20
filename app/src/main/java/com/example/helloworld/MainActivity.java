package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.hello));


        //Let user change the color of the text
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change color of the label
                ((TextView) findViewById(R.id.hello)).setTextColor(getResources().getColor(R.color.teal_200));
            }
        });

        //lets user change the background color
        findViewById(R.id.bgcolor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.phone).setBackgroundColor(getResources().getColor(R.color.orange));
            }
        });
        //User can change the text string to whatever they want
        findViewById(R.id.changetext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.hello)).setText("Android is Awesome!");

            }
        });

        //User can tap on the background view to reset all views to default settings.
        //1. Reset text color from teal_200 to black
        //2. Reset text from "Android is Awesome!" to "Hello from Rawad!" @id/hello
        //3. Reset bg color from "orange">#f07847</color> to #6f1bbf @id/bgcolor
        findViewById(R.id.phone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //2.
                ((TextView) findViewById(R.id.hello)).setText("Hello from Rawad!");
                //1.
                textView.setTextColor(getResources().getColor(R.color.black));
                //3.
                findViewById(R.id.phone).setBackgroundColor(getResources().getColor(R.color.dark_purple));
            }
        });
        // User can tap the “Change text string” button to update the label with the text from the text field.
        findViewById(R.id.ChangeToCustom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String UserEntered = ((EditText) findViewById(R.id.editText)).getText().toString();
                textView.setText(UserEntered);

                if (UserEntered.isEmpty()){
                    textView.setText("Set your own text!");
                } else {
                    textView.setText(UserEntered);
                }
            }
        });
    }
}