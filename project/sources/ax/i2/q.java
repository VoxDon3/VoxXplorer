package ax.i2;

import android.graphics.Point;
import android.view.MotionEvent;

/* loaded from: classes.dex */
final class q {
    static MotionEvent a() {
        return MotionEvent.obtain(0L, 1L, 3, 0.0f, 0.0f, 0);
    }

    static Point b(MotionEvent motionEvent) {
        return new Point((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    private static boolean c(int i, int i2) {
        return (i & i2) != 0;
    }

    static boolean d(MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 3;
    }

    static boolean e(MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 0;
    }

    static boolean f(MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 2;
    }

    static boolean g(MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 1;
    }

    static boolean h(MotionEvent motionEvent) {
        return c(motionEvent.getMetaState(), 2);
    }

    private static boolean i(MotionEvent motionEvent, int i) {
        return i != 0 && (motionEvent.getButtonState() & i) == i;
    }

    static boolean j(MotionEvent motionEvent) {
        return c(motionEvent.getMetaState(), 4096);
    }

    static boolean k(MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    static boolean l(MotionEvent motionEvent) {
        return m(motionEvent) && f(motionEvent);
    }

    static boolean m(MotionEvent motionEvent) {
        return i(motionEvent, 1);
    }

    static boolean n(MotionEvent motionEvent) {
        return i(motionEvent, 2);
    }

    static boolean o(MotionEvent motionEvent) {
        return c(motionEvent.getMetaState(), 1);
    }

    static boolean p(MotionEvent motionEvent) {
        return i(motionEvent, 4);
    }

    static boolean q(MotionEvent motionEvent) {
        return k(motionEvent) && f(motionEvent) && motionEvent.getButtonState() == 0;
    }
}
