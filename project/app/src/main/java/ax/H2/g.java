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

public final class g
extends c<b> {
    public g(h<b> h8) {
        l.f(h8, "tracker");
        super(h8);
    }

    @Override
    public boolean b(v object) {
        l.f(object, "workSpec");
        object = object.j.d();
        return object == j.d0 || Build.VERSION.SDK_INT >= 30 && object == j.g0;
        {
        }
    }

    public boolean i(b b8) {
        l.f(b8, "value");
        return !b8.a() || b8.b();
        {
        }
    }
}

