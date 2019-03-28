package com.example.divij.evm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainActivity1 {
    public static final String EXTRA_NUMBER ="com.example.application.example.EXTRA_NUMBER";
    private Button button1;
    private Button button2;
    private Button button3;
    private Button Button4;
    String mystring="Successful voted";
    int count=0;
    int count1=0;
    int count2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        Button button1=(Button)findViewById(R.id.bt1);
        Button button2=(Button)findViewById(R.id.bt2);
        Button button3=(Button) findViewById(R.id.bt3);
        Button button4=(Button) findViewById (R.id.bt4);
button1.setOnClickListener (new View.OnClickListener ( ) {
    @Override
    public void onClick(View view) {
        Toast.makeText (getApplicationContext (),mystring,Toast.LENGTH_LONG ).show();
        count++;
    }
});
button2.setOnClickListener (new View.OnClickListener ( ) {
    @Override
    public void onClick(View view) {
        Toast.makeText (getApplicationContext (),mystring,Toast.LENGTH_LONG ).show();
        count1++;
    }
});
button3.setOnClickListener (new View.OnClickListener ( ) {
    @Override
    public void onClick(View view) {
        Toast.makeText (getApplicationContext (),mystring,Toast.LENGTH_LONG ).show();
        count2++;

    }
});
button4.setOnClickListener (new View.OnClickListener ( ) {
    @Override
    public void onClick(View view) {
        Intent i=new Intent (MainActivity.this,Main2Activity.class);
        i.putExtra(EXTRA_NUMBER, count);
        i.putExtra(EXTRA_NUMBER, count1);
        i.putExtra(EXTRA_NUMBER, count2);
        startActivity (i);
    }
});
    }
}
