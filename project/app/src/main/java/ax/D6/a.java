/*
 * Decompiled with CFR 0.152.
 */
package ax.D6;

import android.content.Context;
import android.graphics.Color;
import ax.K6.b;
import ax.k6.c;

public class a {
    private static final int f = (int)Math.round(5.1000000000000005);
    private final boolean a;
    private final int b;
    private final int c;
    private final int d;
    private final float e;

    public a(Context context) {
        this(ax.K6.b.b(context, ax.k6.c.m, false), ax.z6.a.b(context, ax.k6.c.l, 0), ax.z6.a.b(context, ax.k6.c.k, 0), ax.z6.a.b(context, ax.k6.c.i, 0), context.getResources().getDisplayMetrics().density);
    }

    public a(boolean bl, int n8, int n9, int n10, float f8) {
        this.a = bl;
        this.b = n8;
        this.c = n9;
        this.d = n10;
        this.e = f8;
    }

    private boolean e(int n8) {
        return ax.T.a.k(n8, 255) == this.d;
    }

    public float a(float f8) {
        float f9 = this.e;
        if (!(f9 <= 0.0f) && !(f8 <= 0.0f)) {
            return Math.min(((float)Math.log1p(f8 / f9) * 4.5f + 2.0f) / 100.0f, 1.0f);
        }
        return 0.0f;
    }

    public int b(int n8, float f8) {
        int n9;
        f8 = this.a(f8);
        int n10 = Color.alpha((int)n8);
        n8 = n9 = ax.z6.a.k(ax.T.a.k(n8, 255), this.b, f8);
        if (f8 > 0.0f) {
            int n11 = this.c;
            n8 = n9;
            if (n11 != 0) {
                n8 = ax.z6.a.j(n9, ax.T.a.k(n11, f));
            }
        }
        return ax.T.a.k(n8, n10);
    }

    public int c(int n8, float f8) {
        int n9 = n8;
        if (this.a) {
            n9 = n8;
            if (this.e(n8)) {
                n9 = this.b(n8, f8);
            }
        }
        return n9;
    }

    public boolean d() {
        return this.a;
    }
}

