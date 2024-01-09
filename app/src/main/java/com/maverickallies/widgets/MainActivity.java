package com.maverickallies.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText textview;
    Button button;
    TextView FirstText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview=(EditText) findViewById(R.id.EditText);
        button=(Button) findViewById(R.id.Button);
        FirstText=(TextView)  findViewById(R.id.FirstTextView);
    }
    public void onMyButtonClick(View view){
        String phoneNumberStr = textview.getText().toString();
        if(!phoneNumberStr.equals("")) {
            FirstText.setText("My Number is" + phoneNumberStr);
        }
        else{
            Toast.makeText(MainActivity.this, "Please enter the number", Toast.LENGTH_SHORT).show();
            }

        }
    }
