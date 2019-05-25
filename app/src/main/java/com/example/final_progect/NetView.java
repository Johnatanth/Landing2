package com.example.final_progect;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class NetView extends View {
    private int widthView;
    private int heightView;


    public NetView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float lenght = canvas.getWidth()/50;
        float hight = canvas.getHeight()/100;
        for (float x = 0; x < lenght*50; x+= lenght) {
            for (float y = 0; y < hight; y = y + a) {
                canvas.drawRect(x, y, x + a, y + a, p);
            }
        }
    }
}
