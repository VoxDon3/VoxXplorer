/*
 * Decompiled with CFR 0.152.
 */
package ax.v;

import ax.v.a;
import ax.v.b;
import ax.v.d;
import ax.v.e;
import java.util.concurrent.Executor;

public class c
extends e {
    private static volatile c c;
    private static final Executor d;
    private static final Executor e;
    private e a;
    private final e b;

    static {
        d = new a();
        e = new b();
    }

    private c() {
        d d8 = new d();
        this.b = d8;
        this.a = d8;
    }

    public static /* synthetic */ void d(Runnable runnable2) {
        ax.v.c.g().c(runnable2);
    }

    public static /* synthetic */ void e(Runnable runnable2) {
        ax.v.c.g().a(runnable2);
    }

    public static Executor f() {
        return e;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c g() {
        if (c != null) {
            return c;
        }
        synchronized (c.class) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        c c8;
                        if (c != null) break block4;
                        c = c8 = new c();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return c;
            }
            throw throwable2;
        }
    }

    @Override
    public void a(Runnable runnable2) {
        this.a.a(runnable2);
    }

    @Override
    public boolean b() {
        return this.a.b();
    }

    @Override
    public void c(Runnable runnable2) {
        this.a.c(runnable2);
    }
}

