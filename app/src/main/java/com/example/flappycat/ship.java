package com.example.flappycat;

import android.graphics.Canvas;
import android.graphics.Paint;

public class ship {
    float x, y, dx, dy, diameter;
    float width, height;

    public void update()
    {
        x += dx;
        y += dy;
        if (x < 0) dx = -dx;
        if (y < 0) dy = -dy;
        if (x > width) dx = -dx;
        if (y > height) dy = -dy;

    }

    public void draw(Canvas canvas, Paint paint)
    {
        canvas.drawRect(100, 100, 400, 0, paint);
    }

}