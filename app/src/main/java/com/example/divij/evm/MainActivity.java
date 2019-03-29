package com.example.divij.evm;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainActivity1 {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button Button4;
    String mystring="You Voted Successfully!!";
    int count=0;
    int count1=0;
    int count2=0;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        Button button1=(Button)findViewById(R.id.bt1);
        Button button2=(Button)findViewById(R.id.bt2);
        Button button3=(Button) findViewById(R.id.bt3);
        Button button4=(Button) findViewById (R.id.bt4);
        mp = MediaPlayer.create(this, R.raw.beep);

        button1.setOnClickListener (new View.OnClickListener ( ) {
    @Override
    public void onClick(View view) {
        Toast.makeText (getApplicationContext (),mystring,Toast.LENGTH_SHORT).show();
        count++;
        mp.start();
      /*  mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mp.release();
            }
        }); */

    }
});
button2.setOnClickListener (new View.OnClickListener ( ) {
    @Override
    public void onClick(View view) {
        Toast.makeText (getApplicationContext (),mystring,Toast.LENGTH_SHORT ).show();
        count1++;
        mp.start();
    }
});
button3.setOnClickListener (new View.OnClickListener ( ) {
    @Override
    public void onClick(View view) {
        Toast.makeText (getApplicationContext (),mystring,Toast.LENGTH_SHORT ).show();
        count2++;
        mp.start();

    }
});
button4.setOnClickListener (new View.OnClickListener ( ) {
    @Override
    public void onClick(View view) {
        Intent i=new Intent (MainActivity.this,Main2Activity.class);
        i.putExtra("party1", count);
        i.putExtra("party2", count1);
        i.putExtra("nota", count2);
        startActivity (i);
    }
});
    }

 /*   @Override
    protected void onResume() {
        mp= MediaPlayer.create(this, R.raw.beep);
        mp.setLooping(false);
       // mp.start();
        super.onResume();
    }

    @Override
    protected void onPause() {
        mp.stop();
        mp.release();
        super.onPause(); */
    //}
}
