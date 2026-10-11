/*
 * Decompiled with CFR 0.152.
 */
package ax.H2;

import android.os.Build;
import ax.B2.j;
import ax.G2.b;
import ax.Gb.l;
import ax.H2.c;
import ax.I2.h;
import ax.K2.v;

public final class d
extends c<b> {
    public d(h<b> h8) {
        l.f(h8, "tracker");
        super(h8);
    }

    @Override
    public boolean b(v v8) {
        l.f(v8, "workSpec");
        return v8.j.d() == j.c0;
    }

    public boolean i(b b8) {
        l.f(b8, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            return !b8.a() || !b8.d();
            {
            }
        }
        return !b8.a();
    }
}

