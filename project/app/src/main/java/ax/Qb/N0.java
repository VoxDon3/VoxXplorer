/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.c0;
import ax.Qb.f0;
import ax.Vb.F;
import ax.Vb.K;

public final class N0 {
    public static final N0 a = new N0();
    private static final ThreadLocal<c0> b = K.a(new F("ThreadLocalEventLoop"));

    private N0() {
    }

    public final c0 a() {
        return b.get();
    }

    public final c0 b() {
        c0 c02;
        ThreadLocal<c0> threadLocal = b;
        c0 c03 = c02 = threadLocal.get();
        if (c02 == null) {
            c03 = f0.a();
            threadLocal.set(c03);
        }
        return c03;
    }

    public final void c() {
        b.set(null);
    }

    public final void d(c0 c02) {
        b.set(c02);
    }
}

