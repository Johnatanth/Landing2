package com.example.final_progect;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Item extends View{
    float y;
    float x;
    int value_power;
    int value_time;


    public Item(Context context,  @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint p =
        super.onDraw(canvas);
    }
}

