package ax.i2;

import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import ax.b0.C1446g;

/* renamed from: ax.i2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class GestureDetectorOnGestureListenerC2261l<T extends GestureDetector.OnGestureListener & GestureDetector.OnDoubleTapListener> implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    private final C2247L<T> a;

    GestureDetectorOnGestureListenerC2261l(T t) {
        C1446g.a(t != null);
        this.a = new C2247L<>(t);
    }

    public void a(int i, T t) {
        this.a.b(i, t);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        return this.a.a(motionEvent).onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return this.a.a(motionEvent).onDoubleTapEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return this.a.a(motionEvent).onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.a.a(motionEvent2).onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.a.a(motionEvent).onLongPress(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.a.a(motionEvent2).onScroll(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
        this.a.a(motionEvent).onShowPress(motionEvent);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return this.a.a(motionEvent).onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.a.a(motionEvent).onSingleTapUp(motionEvent);
    }

    GestureDetectorOnGestureListenerC2261l() {
        this(new GestureDetector.SimpleOnGestureListener());
    }
}
