/*
 * Decompiled with CFR 0.152.
 */
package ax.Xb;

import ax.Lb.f;
import ax.Qb.i0;
import ax.Vb.G;
import ax.Xb.m;
import ax.wb.i;
import ax.wb.j;
import java.util.concurrent.Executor;

public final class b
extends i0
implements Executor {
    public static final b e0 = new b();
    private static final ax.Qb.G f0 = m.d0.Y0(G.g("kotlinx.coroutines.io.parallelism", f.b(64, G.a()), 0, 0, 12, null));

    private b() {
    }

    @Override
    public void b(i i8, Runnable runnable2) {
        f0.b(i8, runnable2);
    }

    @Override
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override
    public void execute(Runnable runnable2) {
        this.b(j.q, runnable2);
    }

    @Override
    public String toString() {
        return "Dispatchers.IO";
    }
}

