package com.example.norahalbazzai.threadsapp;

import android.util.Log;

public class MyRunnableClass implements Runnable {
    @Override
    public void run() {

        try {
            for(int i=1 ; i< 5 ; i++){
                Thread.sleep(1000);
                Log.e("t1:runnable", "runnable talking" + i);
            }

        }
        catch (InterruptedException e)
        {
            Log.e("t1:runnable",e.getMessage());
        }
    }
}
