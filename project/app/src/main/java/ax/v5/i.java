/*
 * Decompiled with CFR 0.152.
 */
package ax.v5;

import android.content.Context;
import ax.r5.b;
import ax.r5.d;
import ax.v5.h;
import ax.w5.f;
import ax.w5.x;
import ax.z5.a;

public final class i
implements b<x> {
    private final ax.ib.a<Context> a;
    private final ax.ib.a<ax.x5.d> b;
    private final ax.ib.a<f> c;
    private final ax.ib.a<a> d;

    public i(ax.ib.a<Context> a8, ax.ib.a<ax.x5.d> a9, ax.ib.a<f> a10, ax.ib.a<a> a11) {
        this.a = a8;
        this.b = a9;
        this.c = a10;
        this.d = a11;
    }

    public static i a(ax.ib.a<Context> a8, ax.ib.a<ax.x5.d> a9, ax.ib.a<f> a10, ax.ib.a<a> a11) {
        return new i(a8, a9, a10, a11);
    }

    public static x c(Context context, ax.x5.d d8, f f8, a a8) {
        return ax.r5.d.d(h.a(context, d8, f8, a8));
    }

    public x b() {
        return i.c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}

