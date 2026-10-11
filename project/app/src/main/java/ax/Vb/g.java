/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Nb.h;
import ax.Qb.H;
import java.util.Collection;
import java.util.ServiceLoader;

public final class g {
    private static final Collection<H> a = h.m(h.d(ServiceLoader.load(H.class, H.class.getClassLoader()).iterator()));

    public static final Collection<H> a() {
        return a;
    }

    public static final void b(Throwable throwable) {
        Thread thread = Thread.currentThread();
        thread.getUncaughtExceptionHandler().uncaughtException(thread, throwable);
    }
}

