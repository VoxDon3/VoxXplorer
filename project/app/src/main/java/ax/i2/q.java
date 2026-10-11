/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.graphics.Point;
import android.view.MotionEvent;

final class q {
    static MotionEvent a() {
        return MotionEvent.obtain((long)0L, (long)1L, (int)3, (float)0.0f, (float)0.0f, (int)0);
    }

    static Point b(MotionEvent motionEvent) {
        return new Point((int)motionEvent.getX(), (int)motionEvent.getY());
    }

    private static boolean c(int n8, int n9) {
        return (n8 & n9) != 0;
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
        return q.c(motionEvent.getMetaState(), 2);
    }

    private static boolean i(MotionEvent motionEvent, int n8) {
        if (n8 == 0) {
            return false;
        }
        return (motionEvent.getButtonState() & n8) == n8;
    }

    static boolean j(MotionEvent motionEvent) {
        return q.c(motionEvent.getMetaState(), 4096);
    }

    static boolean k(MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    static boolean l(MotionEvent motionEvent) {
        return q.m(motionEvent) && q.f(motionEvent);
    }

    static boolean m(MotionEvent motionEvent) {
        return q.i(motionEvent, 1);
    }

    static boolean n(MotionEvent motionEvent) {
        return q.i(motionEvent, 2);
    }

    static boolean o(MotionEvent motionEvent) {
        return q.c(motionEvent.getMetaState(), 1);
    }

    static boolean p(MotionEvent motionEvent) {
        return q.i(motionEvent, 4);
    }

    static boolean q(MotionEvent motionEvent) {
        return q.k(motionEvent) && q.f(motionEvent) && motionEvent.getButtonState() == 0;
    }
}

