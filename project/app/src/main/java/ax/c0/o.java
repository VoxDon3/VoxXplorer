/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import ax.c0.Z;
import ax.c0.h0;
import ax.c0.m;
import ax.c0.n;
import ax.c0.p;

public class o {
    private final Context a;
    private final p b;
    private final b c;
    private final a d;
    private VelocityTracker e;
    private float f;
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private final int[] j = new int[]{Integer.MAX_VALUE, 0};

    public o(Context context, p p8) {
        this(context, p8, new m(), new n());
    }

    o(Context context, p p8, b b8, a a8) {
        this.a = context;
        this.b = p8;
        this.c = b8;
        this.d = a8;
    }

    public static /* synthetic */ void a(Context context, int[] nArray, MotionEvent motionEvent, int n8) {
        o.c(context, nArray, motionEvent, n8);
    }

    public static /* synthetic */ float b(VelocityTracker velocityTracker, MotionEvent motionEvent, int n8) {
        return o.f(velocityTracker, motionEvent, n8);
    }

    private static void c(Context context, int[] nArray, MotionEvent motionEvent, int n8) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get((Context)context);
        nArray[0] = h0.i(context, viewConfiguration, motionEvent.getDeviceId(), n8, motionEvent.getSource());
        nArray[1] = h0.h(context, viewConfiguration, motionEvent.getDeviceId(), n8, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int n8) {
        int n9 = motionEvent.getSource();
        int n10 = motionEvent.getDeviceId();
        if (this.h == n9 && this.i == n10 && this.g == n8) {
            return false;
        }
        this.c.a(this.a, this.j, motionEvent, n8);
        this.h = n9;
        this.i = n10;
        this.g = n8;
        return true;
    }

    private float e(MotionEvent motionEvent, int n8) {
        if (this.e == null) {
            this.e = VelocityTracker.obtain();
        }
        return this.d.a(this.e, motionEvent, n8);
    }

    private static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int n8) {
        Z.a(velocityTracker, motionEvent);
        Z.b(velocityTracker, 1000);
        return Z.d(velocityTracker, n8);
    }

    public void g(MotionEvent object, int object2) {
        float f8;
        float f9;
        block9: {
            block8: {
                boolean bl;
                block7: {
                    bl = this.d((MotionEvent)object, (int)object2);
                    if (this.j[0] != Integer.MAX_VALUE) break block7;
                    object = this.e;
                    if (object != null) {
                        object.recycle();
                        this.e = null;
                        return;
                    }
                    break block8;
                }
                f9 = this.e((MotionEvent)object, (int)object2) * this.b.b();
                float f10 = Math.signum(f9);
                f8 = 0.0f;
                if (bl || f10 != Math.signum(this.f) && f10 != 0.0f) {
                    this.b.c();
                }
                if (!((f10 = Math.abs(f9)) < (float)(object = (Object)this.j)[0])) break block9;
            }
            return;
        }
        object2 = object[1];
        if (this.b.a(f9 = Math.max((float)(-object2), Math.min(f9, (float)object2)))) {
            f8 = f9;
        }
        this.f = f8;
    }

    static interface a {
        public float a(VelocityTracker var1, MotionEvent var2, int var3);
    }

    static interface b {
        public void a(Context var1, int[] var2, MotionEvent var3, int var4);
    }
}

