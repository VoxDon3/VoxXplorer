package ax.D6;

import android.content.Context;
import android.graphics.Color;
import ax.K6.b;
import ax.k6.C2402c;
import ax.z6.C3555a;

/* loaded from: classes3.dex */
public class a {
    private static final int f = (int) Math.round(5.1000000000000005d);
    private final boolean a;
    private final int b;
    private final int c;
    private final int d;
    private final float e;

    public a(Context context) {
        this(b.b(context, C2402c.m, false), C3555a.b(context, C2402c.l, 0), C3555a.b(context, C2402c.k, 0), C3555a.b(context, C2402c.i, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean e(int i) {
        return ax.T.a.k(i, 255) == this.d;
    }

    public float a(float f2) {
        if (this.e <= 0.0f || f2 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f2 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i, float f2) {
        int i2;
        float a = a(f2);
        int alpha = Color.alpha(i);
        int k = C3555a.k(ax.T.a.k(i, 255), this.b, a);
        if (a > 0.0f && (i2 = this.c) != 0) {
            k = C3555a.j(k, ax.T.a.k(i2, f));
        }
        return ax.T.a.k(k, alpha);
    }

    public int c(int i, float f2) {
        return (this.a && e(i)) ? b(i, f2) : i;
    }

    public boolean d() {
        return this.a;
    }

    public a(boolean z, int i, int i2, int i3, float f2) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f2;
    }
}
