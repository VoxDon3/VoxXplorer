/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import android.app.Application;
import ax.a6.B0;
import ax.a6.E0;
import ax.a6.G;
import ax.a6.G0;
import ax.a6.H;
import ax.a6.H0;
import ax.a6.J0;
import ax.a6.L0;
import ax.a6.N0;
import ax.a6.a;
import ax.a6.b;
import ax.a6.d;
import ax.a6.f;
import ax.a6.m;
import ax.a6.o;
import ax.a6.q;
import ax.a6.r;
import ax.a6.t;
import ax.a6.u;
import ax.a6.x0;
import ax.a6.y0;
import ax.a6.z0;

final class g
extends a {
    private final g b = this;
    final B0 c;
    final B0 d;
    final B0 e;
    final B0 f;
    final B0 g;
    final B0 h;
    final B0 i;
    final B0 j;
    final B0 k;
    final B0 l;
    final B0 m;
    final B0 n;
    final B0 o;

    g(Application object) {
        B0 b02;
        B0 b03;
        B0 b04;
        y0 y02 = z0.b(object);
        this.c = y02;
        object = x0.b(new q(y02));
        this.d = object;
        this.e = b04 = x0.b(ax.a6.d.a);
        B0 b05 = new f(this);
        this.f = b05;
        u u8 = t.a;
        b05 = x0.b(new H(b05, u8));
        this.g = b05;
        L0 l02 = new L0(y02, (B0)object);
        this.h = l02;
        this.i = b03 = x0.b(new E0(u8));
        this.j = b02 = x0.b(new m(y02));
        this.k = b02 = x0.b(new J0(y02, b02));
        this.l = b02 = new o(y02, (B0)object, b02, u8);
        this.m = b02 = new b(b03, b02, (B0)object);
        y02 = new N0(y02, b04, r.a, u8, (B0)object, b05, l02, b02, b03);
        this.n = y02;
        this.o = x0.b(new H0((B0)object, y02, b05));
    }

    static /* bridge */ /* synthetic */ g d(g g8) {
        return g8.b;
    }

    @Override
    public final G0 b() {
        return (G0)this.o.a();
    }

    @Override
    public final G c() {
        return (G)this.g.a();
    }
}

