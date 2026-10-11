/*
 * Decompiled with CFR 0.152.
 */
package ax.p1;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import ax.p1.d;

final class m
extends GestureDetector.SimpleOnGestureListener
implements View.OnTouchListener,
d.a {
    private final PointF a = new PointF();
    private final PointF b = new PointF();
    private final a c;
    private final float d;
    private final GestureDetector e;
    private volatile float f;

    public m(Context context, a a8, float f8) {
        this.c = a8;
        this.d = f8;
        this.e = new GestureDetector(context, (GestureDetector.OnGestureListener)this);
        this.f = (float)Math.PI;
    }

    @Override
    public void a(float[] fArray, float f8) {
        this.f = -f8;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
        f8 = (motionEvent2.getX() - this.a.x) / this.d;
        f9 = motionEvent2.getY();
        motionEvent = this.a;
        f9 = (f9 - motionEvent.y) / this.d;
        motionEvent.set(motionEvent2.getX(), motionEvent2.getY());
        double d8 = this.f;
        float f10 = (float)Math.cos(d8);
        float f11 = (float)Math.sin(d8);
        motionEvent = this.b;
        motionEvent.x -= f10 * f8 - f11 * f9;
        motionEvent.y = f8 = motionEvent.y + (f11 * f8 + f10 * f9);
        motionEvent.y = Math.max(-45.0f, Math.min(45.0f, f8));
        this.c.b(this.b);
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.c.onSingleTapUp(motionEvent);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.e.onTouchEvent(motionEvent);
    }

    public static interface a {
        public void b(PointF var1);

        public boolean onSingleTapUp(MotionEvent var1);
    }
}

