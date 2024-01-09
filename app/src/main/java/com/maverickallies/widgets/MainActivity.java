package com.maverickallies.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText textview;
    Button button;
    TextView FirstText;
    ImageView Firstimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview=(EditText) findViewById(R.id.EditText);
        button=(Button) findViewById(R.id.Button);
        FirstText=(TextView)  findViewById(R.id.FirstTextView);
        Firstimage=(ImageView) findViewById(R.id.myimage);
    }
    public void onMyButtonClick(View view){
        String myName = textview.getText().toString();
        
        if(myName.equals(" ")){
            Toast.makeText(this, "Enter Your name", Toast.LENGTH_SHORT).show();
        }
        else{
            Firstimage.setVisibility(view.VISIBLE);
        }

    }

    }
