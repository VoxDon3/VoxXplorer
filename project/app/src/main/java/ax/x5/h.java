/*
 * Decompiled with CFR 0.152.
 */
package ax.x5;

import android.content.Context;
import ax.ib.a;
import ax.r5.b;
import ax.r5.d;
import ax.x5.f;

public final class h
implements b<String> {
    private final a<Context> a;

    public h(a<Context> a8) {
        this.a = a8;
    }

    public static h a(a<Context> a8) {
        return new h(a8);
    }

    public static String c(Context context) {
        return d.d(f.b(context));
    }

    public String b() {
        return h.c(this.a.get());
    }
}

