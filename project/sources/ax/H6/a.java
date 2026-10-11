package ax.H6;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import ax.i.C2186b;
import ax.k6.C2402c;

/* loaded from: classes3.dex */
public abstract class a<V extends View> {
    private final TimeInterpolator a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
    protected final V b;
    protected final int c;
    protected final int d;
    protected final int e;
    private C2186b f;

    public a(V v) {
        this.b = v;
        Context context = v.getContext();
        this.c = i.f(context, C2402c.F, 300);
        this.d = i.f(context, C2402c.I, 150);
        this.e = i.f(context, C2402c.H, 100);
    }

    public float a(float f) {
        return this.a.getInterpolation(f);
    }

    protected C2186b b() {
        if (this.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C2186b c2186b = this.f;
        this.f = null;
        return c2186b;
    }

    public C2186b c() {
        C2186b c2186b = this.f;
        this.f = null;
        return c2186b;
    }

    protected void d(C2186b c2186b) {
        this.f = c2186b;
    }

    protected C2186b e(C2186b c2186b) {
        if (this.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C2186b c2186b2 = this.f;
        this.f = c2186b;
        return c2186b2;
    }
}
