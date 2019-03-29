package com.example.divij.evm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
private EditText Name,Password;
private Button btn1;
private TextView text1;
    String str="Wrong Username or Password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main2);

        Name=(EditText) findViewById (R.id.et1);
        Password=(EditText) findViewById (R.id.et2);
        btn1=(Button) findViewById (R.id.bt5);
        text1=(TextView) findViewById (R.id.txt2);
        //text2= (TextView)findViewById(R.id.winner);
        btn1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 vote(Name.getText().toString(),Password.getText ().toString ());
            }
        });
    }
private void vote(String userName, String userPassword)
{
    Name.setVisibility(View.INVISIBLE);
    Password.setVisibility(View.INVISIBLE);
    btn1.setVisibility(View.INVISIBLE);
    text1.setVisibility(View.VISIBLE);
    Intent intent=getIntent ();
    int c=intent.getIntExtra("party1",0);
    int c1=intent.getIntExtra("party2",0);
    int c2=intent.getIntExtra("nota",0);
    if( (userName.equals("divij")) && (userPassword.equals("1234")))
    {
        text1.setText("Vote count:\nParty 1:\t"+c+"\nParty 2:\t"+c1+"\nNOTA:\t"+c2);
    }
    else{
        Toast.makeText (getApplicationContext (),str,Toast.LENGTH_LONG).show ();
    }
}
}
