package com.fju.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random r = new Random();
    int n = r.nextInt(10)+1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void guess(View view){
        EditText edguess = (EditText) findViewById(R.id.ed_guess);
        int guess = Integer.parseInt(edguess.getText().toString());
        /* int n;
        n=(int)(Math.random()*10)+1;*/
        if (guess < n){
            Toast.makeText(this, "大一點", Toast.LENGTH_SHORT).show();
        }else if(guess > n){
                Toast.makeText(this, "小一點", Toast.LENGTH_SHORT).show();
                }else if(guess == n){
                   /* Toast.makeText(this, "答對了", Toast.LENGTH_SHORT).show();*/
                   new AlertDialog.Builder(this)
                            .setTitle("恭喜!!!")
                            .setMessage("答對了!!")
                            .setPositiveButton("OK", null)
                            .show();


        }
    }
}
