/*
 * Decompiled with CFR 0.152.
 */
package ax.Xb;

import ax.Lb.f;
import ax.Vb.G;
import ax.Xb.e;
import ax.Xb.g;
import ax.Xb.i;
import ax.Xb.j;
import java.util.concurrent.TimeUnit;

public final class l {
    public static final String a = G.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");
    public static final long b = G.h("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
    public static final int c = G.g("kotlinx.coroutines.scheduler.core.pool.size", ax.Lb.f.b(G.a(), 2), 1, 0, 8, null);
    public static final int d = G.g("kotlinx.coroutines.scheduler.max.pool.size", 0x1FFFFE, 0, 0x1FFFFE, 4, null);
    public static final long e = TimeUnit.SECONDS.toNanos(G.h("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null));
    public static g f = ax.Xb.e.a;
    public static final i g = new j(0);
    public static final i h = new j(1);
}

