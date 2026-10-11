/*
 * Decompiled with CFR 0.152.
 */
package ax.N8;

import ax.Z8.a;

public class B {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;

    B(long l8, long l9, long l10, long l11, long l12) {
        this.a = l8;
        this.b = l9;
        this.c = l10;
        this.d = l11;
        this.e = l12;
        this.f = l8 * (l11 *= l12);
        this.g = l9 * l11;
        this.h = l10 * l11;
    }

    public static B c(a.c c8) throws a.b {
        return new B(c8.A(), c8.A(), c8.A(), c8.N(), c8.N());
    }

    public long a() {
        return this.h;
    }

    public long b() {
        return this.f;
    }
}

