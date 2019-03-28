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
        btn1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //text1.setText("bjpwon!\n" );
                 vote(Name.getText().toString(),Password.getText ().toString ());
            }
        });
    }
private void vote(String userName, String userPassword)
{
    Intent intent=getIntent ();
    int c=intent.getIntExtra(MainActivity.EXTRA_NUMBER,0);
    int c1=intent.getIntExtra(MainActivity.EXTRA_NUMBER,0);
    int c2=intent.getIntExtra(MainActivity.EXTRA_NUMBER,0);
    if( (userName.equals("divij")) && (userPassword.equals("1234")))
    {
        text1.setText("bjp won!\n"+c);
        text1.setText("congress won!\n"+c1);
        text1.setText("NOTA won!\n"+c2);
    }
    else{
        Toast.makeText (getApplicationContext (),str,Toast.LENGTH_LONG).show ();
    }
}
}
