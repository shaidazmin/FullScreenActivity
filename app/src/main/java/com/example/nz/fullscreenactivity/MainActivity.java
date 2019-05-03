package com.example.nz.fullscreenactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        progressBar = (ProgressBar) findViewById(R.id.progressbar);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                myMethod();
            }
        });
        thread.start();

        Toast.makeText(MainActivity.this,"Progressing..",Toast.LENGTH_LONG).show();
    }

    public  void myMethod(){
        for(int i = 20; i<=100; i+=20)
        try {
            Thread.sleep(1000);

            progressBar.setProgress(i);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
