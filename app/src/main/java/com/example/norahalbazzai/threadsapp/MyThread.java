package com.example.norahalbazzai.threadsapp;

import android.util.Log;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();

        try {
            for(int i=1 ; i< 5 ; i++){
                Thread.sleep(1000);
                Log.e("t2:thread", "thread talking" + i);
            }

        }
        catch (InterruptedException e)
        {
            Log.e("t2:thread",e.getMessage());
        }
    }
}
