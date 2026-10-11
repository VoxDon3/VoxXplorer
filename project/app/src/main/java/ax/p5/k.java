/*
 * Decompiled with CFR 0.152.
 */
package ax.p5;

import ax.p5.j;
import ax.r5.b;
import ax.r5.d;
import java.util.concurrent.Executor;

public final class k
implements b<Executor> {
    public static k a() {
        return a.a;
    }

    public static Executor b() {
        return d.d(j.a());
    }

    public Executor c() {
        return k.b();
    }

    private static final class a {
        private static final k a = new k();
    }
}

