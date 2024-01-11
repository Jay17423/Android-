package com.maverickallies.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
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
        CheckBox BasicCheckBox = (CheckBox) findViewById(R.id.basicCheckbox);
        String myName = textview.getText().toString();
        
        if(myName.equals(" ")){
            Toast.makeText(this, "Enter Your name", Toast.LENGTH_SHORT).show();
        }
        else{
            Firstimage.setVisibility(view.VISIBLE);
        }

        boolean ischecked =BasicCheckBox.isChecked();
        if(ischecked){
            Toast.makeText(this, "You will be successfull", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Please accept the terms and condition", Toast.LENGTH_SHORT).show();
        }



    }

    }
