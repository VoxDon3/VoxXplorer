/*
 * Decompiled with CFR 0.152.
 */
package ax.Pb;

import ax.Gb.l;
import ax.Lb.f;
import ax.Pb.a;
import ax.Pb.d;
import ax.Pb.e;

public final class c {
    public static final /* synthetic */ long a(long l8, int n8) {
        return c.d(l8, n8);
    }

    public static final /* synthetic */ long b(long l8) {
        return c.e(l8);
    }

    public static final /* synthetic */ long c(long l8) {
        return c.g(l8);
    }

    private static final long d(long l8, int n8) {
        return a.n((l8 << 1) + (long)n8);
    }

    private static final long e(long l8) {
        return a.n((l8 << 1) + 1L);
    }

    private static final long f(long l8) {
        return a.n(l8 << 1);
    }

    private static final long g(long l8) {
        return l8 * (long)1000000;
    }

    public static final long h(int n8, d d8) {
        l.f((Object)d8, "unit");
        if (d8.compareTo(d.f0) <= 0) {
            return c.f(e.b(n8, d8, d.c0));
        }
        return c.i(n8, d8);
    }

    public static final long i(long l8, d d8) {
        l.f((Object)d8, "unit");
        d d9 = d.c0;
        long l9 = e.b(4611686018426999999L, d9, d8);
        if (-l9 <= l8 && l8 <= l9) {
            return c.f(e.b(l8, d8, d9));
        }
        return c.e(f.h(e.a(l8, d8, d.e0), -4611686018427387903L, 0x3FFFFFFFFFFFFFFFL));
    }
}

