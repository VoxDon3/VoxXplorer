/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import ax.c0.a0;
import java.util.Map;
import java.util.WeakHashMap;

public final class Z {
    private static Map<VelocityTracker, a0> a = java.util.DesugarCollections.synchronizedMap(new WeakHashMap());

    public static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 0x400000) {
            if (!a.containsKey(velocityTracker)) {
                a.put(velocityTracker, new a0());
            }
            a.get(velocityTracker).a(motionEvent);
        }
    }

    public static void b(VelocityTracker velocityTracker, int n8) {
        Z.c(velocityTracker, n8, Float.MAX_VALUE);
    }

    public static void c(VelocityTracker object, int n8, float f8) {
        object.computeCurrentVelocity(n8, f8);
        object = Z.e((VelocityTracker)object);
        if (object != null) {
            ((a0)object).c(n8, f8);
        }
    }

    public static float d(VelocityTracker object, int n8) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ax.c0.Z$a.a((VelocityTracker)object, n8);
        }
        if (n8 == 0) {
            return object.getXVelocity();
        }
        if (n8 == 1) {
            return object.getYVelocity();
        }
        if ((object = Z.e((VelocityTracker)object)) != null) {
            return ((a0)object).d(n8);
        }
        return 0.0f;
    }

    private static a0 e(VelocityTracker velocityTracker) {
        return a.get(velocityTracker);
    }

    private static class a {
        static float a(VelocityTracker velocityTracker, int n8) {
            return velocityTracker.getAxisVelocity(n8);
        }

        static float b(VelocityTracker velocityTracker, int n8, int n9) {
            return velocityTracker.getAxisVelocity(n8, n9);
        }

        static boolean c(VelocityTracker velocityTracker, int n8) {
            return velocityTracker.isAxisSupported(n8);
        }
    }
}

