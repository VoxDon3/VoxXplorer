/*
 * Decompiled with CFR 0.152.
 */
package ax.A2;

import android.content.Context;
import ax.A2.m;
import ax.Gb.l;

final class o
implements m {
    public static final o b = new o();

    private o() {
    }

    @Override
    public float a(Context context) {
        l.f(context, "context");
        return context.getResources().getDisplayMetrics().density;
    }
}

