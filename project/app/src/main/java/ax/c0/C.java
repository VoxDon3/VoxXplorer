/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.view.MotionEvent;

public final class C {
    @Deprecated
    public static int a(MotionEvent motionEvent, int n8) {
        return motionEvent.findPointerIndex(n8);
    }

    @Deprecated
    public static int b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    public static int c(MotionEvent motionEvent, int n8) {
        return motionEvent.getPointerId(n8);
    }

    @Deprecated
    public static float d(MotionEvent motionEvent, int n8) {
        return motionEvent.getX(n8);
    }

    public static boolean e(MotionEvent motionEvent, int n8) {
        return (motionEvent.getSource() & n8) == n8;
    }
}

