package com.google.android.gms.measurement.internal;

import ax.M5.C0821p;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
final class C2<V> extends FutureTask<V> implements Comparable<C2<V>> {
    final boolean c0;
    private final String d0;
    private final /* synthetic */ C3779z2 e0;
    private final long q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2(C3779z2 c3779z2, Runnable runnable, boolean z, String str) {
        super(ax.b6.D0.a().b(runnable), null);
        AtomicLong atomicLong;
        this.e0 = c3779z2;
        C0821p.l(str);
        atomicLong = C3779z2.l;
        long andIncrement = atomicLong.getAndIncrement();
        this.q = andIncrement;
        this.d0 = str;
        this.c0 = z;
        if (andIncrement == Long.MAX_VALUE) {
            c3779z2.k().G().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        C2 c2 = (C2) obj;
        boolean z = this.c0;
        if (z != c2.c0) {
            return z ? -1 : 1;
        }
        long j = this.q;
        long j2 = c2.q;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.e0.k().I().b("Two tasks share the same index. index", Long.valueOf(this.q));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.e0.k().G().b(this.d0, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2(C3779z2 c3779z2, Callable<V> callable, boolean z, String str) {
        super(ax.b6.D0.a().a(callable));
        AtomicLong atomicLong;
        this.e0 = c3779z2;
        C0821p.l(str);
        atomicLong = C3779z2.l;
        long andIncrement = atomicLong.getAndIncrement();
        this.q = andIncrement;
        this.d0 = str;
        this.c0 = z;
        if (andIncrement == Long.MAX_VALUE) {
            c3779z2.k().G().a("Tasks index overflow");
        }
    }
}
