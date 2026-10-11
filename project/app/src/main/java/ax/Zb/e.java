/*
 * Decompiled with CFR 0.152.
 */
package ax.Zb;

import ax.Vb.F;
import ax.Vb.G;
import ax.Zb.f;

public final class e {
    private static final int a = G.g("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
    private static final F b = new F("PERMIT");
    private static final F c = new F("TAKEN");
    private static final F d = new F("BROKEN");
    private static final F e = new F("CANCELLED");
    private static final int f = G.g("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    public static final /* synthetic */ f a(long l8, f f8) {
        return ax.Zb.e.h(l8, f8);
    }

    public static final /* synthetic */ F b() {
        return d;
    }

    public static final /* synthetic */ F c() {
        return e;
    }

    public static final /* synthetic */ int d() {
        return a;
    }

    public static final /* synthetic */ F e() {
        return b;
    }

    public static final /* synthetic */ int f() {
        return f;
    }

    public static final /* synthetic */ F g() {
        return c;
    }

    private static final f h(long l8, f f8) {
        return new f(l8, f8, 0);
    }
}

