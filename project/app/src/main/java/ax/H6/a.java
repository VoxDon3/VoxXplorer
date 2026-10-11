/*
 * Decompiled with CFR 0.152.
 */
package ax.H6;

import android.animation.TimeInterpolator;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import ax.H6.i;
import ax.i.b;
import ax.k6.c;

public abstract class a<V extends View> {
    private final TimeInterpolator a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
    protected final V b;
    protected final int c;
    protected final int d;
    protected final int e;
    private b f;

    public a(V object) {
        this.b = object;
        object = object.getContext();
        this.c = i.f(object, ax.k6.c.F, 300);
        this.d = i.f(object, ax.k6.c.I, 150);
        this.e = i.f(object, ax.k6.c.H, 100);
    }

    public float a(float f8) {
        return this.a.getInterpolation(f8);
    }

    protected b b() {
        if (this.f == null) {
            Log.w((String)"MaterialBackHelper", (String)"Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        b b8 = this.f;
        this.f = null;
        return b8;
    }

    public b c() {
        b b8 = this.f;
        this.f = null;
        return b8;
    }

    protected void d(b b8) {
        this.f = b8;
    }

    protected b e(b b8) {
        if (this.f == null) {
            Log.w((String)"MaterialBackHelper", (String)"Must call startBackProgress() before updateBackProgress()");
        }
        b b9 = this.f;
        this.f = b8;
        return b9;
    }
}

