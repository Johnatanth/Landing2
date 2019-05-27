package com.example.final_progect;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.TreeMap;

public class NetView extends View {
    private float width;
    private float height;


    private TreeMap<Float, Float> list = new TreeMap<>();


    public NetView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    Paint p = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {

        p.setColor(Color.BLACK);
        p.setStyle(Paint.Style.STROKE);

        if (canvas != null) {
            canvas.drawColor(Color.WHITE);

            width = canvas.getWidth();
            height = canvas.getHeight();

            float h = width / 50;
            float w = height / 100;
            for (float x = 0; x < 20 * h; x = x + h) {
                for (float y = 0; y < 28 * w; y = y + w) {
                    canvas.drawRect(x, y, x + h, y + w, p);
                }
                onAddParams(h, w, canvas);
            }
            super.onDraw(canvas);
        }


    }

    private float touchX;
    private float touchY;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        touchX = event.getX();
        touchY = event.getY();
        return super.onTouchEvent(event);
    }


    private void onAddParams(float xt, float yt, Canvas cavas) {
        for (float x = 0; x < 50 * xt; x = x + xt) {
            for (float y = 0; y < 100 * yt; y = y + yt) {
                if ((touchX >= x && touchX <= x + xt)) {
                    if (touchY >= y && touchY <= y + yt) {
                        p.setColor(Color.BLUE);
                        p.setStyle(Paint.Style.FILL);
                        cavas.drawRect(x - xt, y- yt, x+xt,y+yt, p);

                        //draw
                        p.setColor(Color.BLACK);
                        p.setStyle(Paint.Style.STROKE);
                        if (list.containsKey(y)){
                            list.put(x, y);
                            //draw privious rectiangle
                        }else{
                            list.put(x, y);
                        }
                    }
                }
            }
        }
    }
}