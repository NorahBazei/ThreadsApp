package com.example.norahalbazzai.threadsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Runnable myRunnable = new MyRunnableClass();
        Thread t1 = new Thread(myRunnable);
        t1.start();

        MyThread t2 = new MyThread();
        t2.start();

    }
}
