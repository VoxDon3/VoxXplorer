package ax.Vb;

import java.util.Collection;
import java.util.ServiceLoader;

/* renamed from: ax.Vb.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1000g {
    private static final Collection<ax.Qb.H> a = ax.Nb.h.m(ax.Nb.h.d(ServiceLoader.load(ax.Qb.H.class, ax.Qb.H.class.getClassLoader()).iterator()));

    public static final Collection<ax.Qb.H> a() {
        return a;
    }

    public static final void b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
