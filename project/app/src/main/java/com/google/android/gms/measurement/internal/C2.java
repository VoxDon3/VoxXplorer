/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.M5.p;
import ax.b6.D0;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.z2;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

final class C2<V>
extends FutureTask<V>
implements Comparable<C2<V>> {
    final boolean c0;
    private final String d0;
    private final z2 e0;
    private final long q;

    C2(z2 z22, Runnable runnable2, boolean bl, String string) {
        long l8;
        this.e0 = z22;
        super(D0.a().b(runnable2), null);
        p.l(string);
        this.q = l8 = z2.F().getAndIncrement();
        this.d0 = string;
        this.c0 = bl;
        if (l8 == Long.MAX_VALUE) {
            ((f3)z22).k().G().a("Tasks index overflow");
        }
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    C2(z2 z22, Callable callable, boolean bl, String string) {
        long l8;
        this.e0 = z22;
        super(D0.a().a(callable));
        p.l(string);
        this.q = l8 = z2.F().getAndIncrement();
        this.d0 = string;
        this.c0 = bl;
        if (l8 == Long.MAX_VALUE) {
            ((f3)z22).k().G().a("Tasks index overflow");
        }
    }

    @Override
    public final /* synthetic */ int compareTo(Object object) {
        object = (C2)object;
        boolean bl = this.c0;
        if (bl != ((C2)object).c0) {
            if (bl) {
                return -1;
            }
            return 1;
        }
        long l8 = this.q;
        long l9 = ((C2)object).q;
        if (l8 < l9) {
            return -1;
        }
        if (l8 > l9) {
            return 1;
        }
        ((f3)this.e0).k().I().b("Two tasks share the same index. index", this.q);
        return 0;
    }

    @Override
    protected final void setException(Throwable throwable) {
        ((f3)this.e0).k().G().b(this.d0, throwable);
        super.setException(throwable);
    }
}

