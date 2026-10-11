/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import ax.b0.g;
import ax.i2.L;

final class l<T extends GestureDetector.OnGestureListener & GestureDetector.OnDoubleTapListener>
implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener {
    private final L<T> a;

    l() {
        this(new GestureDetector.SimpleOnGestureListener());
    }

    l(T t8) {
        boolean bl = t8 != null;
        g.a(bl);
        this.a = new L<T>(t8);
    }

    public void a(int n8, T t8) {
        this.a.b(n8, t8);
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        return ((GestureDetector.OnDoubleTapListener)((GestureDetector.OnGestureListener)this.a.a(motionEvent))).onDoubleTap(motionEvent);
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return ((GestureDetector.OnDoubleTapListener)((GestureDetector.OnGestureListener)this.a.a(motionEvent))).onDoubleTapEvent(motionEvent);
    }

    public boolean onDown(MotionEvent motionEvent) {
        return ((GestureDetector.OnGestureListener)this.a.a(motionEvent)).onDown(motionEvent);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
        return ((GestureDetector.OnGestureListener)this.a.a(motionEvent2)).onFling(motionEvent, motionEvent2, f8, f9);
    }

    public void onLongPress(MotionEvent motionEvent) {
        ((GestureDetector.OnGestureListener)this.a.a(motionEvent)).onLongPress(motionEvent);
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
        return ((GestureDetector.OnGestureListener)this.a.a(motionEvent2)).onScroll(motionEvent, motionEvent2, f8, f9);
    }

    public void onShowPress(MotionEvent motionEvent) {
        ((GestureDetector.OnGestureListener)this.a.a(motionEvent)).onShowPress(motionEvent);
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return ((GestureDetector.OnDoubleTapListener)((GestureDetector.OnGestureListener)this.a.a(motionEvent))).onSingleTapConfirmed(motionEvent);
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return ((GestureDetector.OnGestureListener)this.a.a(motionEvent)).onSingleTapUp(motionEvent);
    }
}

