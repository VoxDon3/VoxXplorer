/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.M5.p;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.z2;

final class A2
implements Thread.UncaughtExceptionHandler {
    private final String a;
    private final z2 b;

    public A2(z2 z22, String string) {
        this.b = z22;
        p.l(string);
        this.a = string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void uncaughtException(Thread thread, Throwable throwable) {
        synchronized (this) {
            ((f3)this.b).k().G().b(this.a, throwable);
            return;
        }
    }
}

