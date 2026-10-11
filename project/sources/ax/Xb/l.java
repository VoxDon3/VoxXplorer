package ax.Xb;

import ax.Vb.G;
import ax.Vb.I;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class l {
    public static final String a = G.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static g f;
    public static final i g;
    public static final i h;

    static {
        long f2;
        int e2;
        int e3;
        long f3;
        f2 = I.f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        b = f2;
        e2 = I.e("kotlinx.coroutines.scheduler.core.pool.size", ax.Lb.f.b(G.a(), 2), 1, 0, 8, null);
        c = e2;
        e3 = I.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        d = e3;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f3 = I.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        e = timeUnit.toNanos(f3);
        f = e.a;
        g = new j(0);
        h = new j(1);
    }
}
