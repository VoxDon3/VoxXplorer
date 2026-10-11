/*
 * Decompiled with CFR 0.152.
 */
package ax.w5;

import android.content.Context;
import ax.q5.e;
import ax.w5.r;
import ax.w5.x;
import ax.x5.c;
import ax.x5.d;
import ax.y5.b;
import ax.z5.a;
import java.util.concurrent.Executor;

public final class s
implements ax.r5.b<r> {
    private final ax.ib.a<Context> a;
    private final ax.ib.a<e> b;
    private final ax.ib.a<d> c;
    private final ax.ib.a<x> d;
    private final ax.ib.a<Executor> e;
    private final ax.ib.a<b> f;
    private final ax.ib.a<a> g;
    private final ax.ib.a<a> h;
    private final ax.ib.a<c> i;

    public s(ax.ib.a<Context> a8, ax.ib.a<e> a9, ax.ib.a<d> a10, ax.ib.a<x> a11, ax.ib.a<Executor> a12, ax.ib.a<b> a13, ax.ib.a<a> a14, ax.ib.a<a> a15, ax.ib.a<c> a16) {
        this.a = a8;
        this.b = a9;
        this.c = a10;
        this.d = a11;
        this.e = a12;
        this.f = a13;
        this.g = a14;
        this.h = a15;
        this.i = a16;
    }

    public static s a(ax.ib.a<Context> a8, ax.ib.a<e> a9, ax.ib.a<d> a10, ax.ib.a<x> a11, ax.ib.a<Executor> a12, ax.ib.a<b> a13, ax.ib.a<a> a14, ax.ib.a<a> a15, ax.ib.a<c> a16) {
        return new s(a8, a9, a10, a11, a12, a13, a14, a15, a16);
    }

    public static r c(Context context, e e8, d d8, x x8, Executor executor, b b8, a a8, a a9, c c8) {
        return new r(context, e8, d8, x8, executor, b8, a8, a9, c8);
    }

    public r b() {
        return s.c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}

