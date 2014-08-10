package com.example.drawapp;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;


public class MainActivity extends Activity {

	private Handler handler = new Handler();
	
	private View view;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        view = new SampleView(this);
        setContentView(view);
        
        Timer timer = new Timer(false);

        // 匿名クラス（無名クラス）
        timer.schedule(new TimerTask() {
        	public void run() {
        		handler.post(new Runnable() {
        			public void run() {
        				view.invalidate();
        			}
        		});
        	}
        }, 0, 30);
    }

}


