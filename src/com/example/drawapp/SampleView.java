package com.example.drawapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class SampleView extends View {

	private Paint paint = new Paint();
	
	public SampleView(Context context) {
		super(context);
		setBackgroundColor(Color.WHITE);
	}
	
	@Override
	public void onDraw(Canvas canvas) {
		canvas.drawText("Hello", 100, 100, paint);
	}

}
