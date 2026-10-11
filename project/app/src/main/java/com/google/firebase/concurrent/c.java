/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.o;
import com.google.firebase.concurrent.p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class c
implements p.c {
    public final o a;
    public final Runnable b;
    public final long c;
    public final TimeUnit d;

    public /* synthetic */ c(o o8, Runnable runnable2, long l8, TimeUnit timeUnit) {
        this.a = o8;
        this.b = runnable2;
        this.c = l8;
        this.d = timeUnit;
    }

    public final ScheduledFuture a(p.b b8) {
        return o.A(this.a, this.b, this.c, this.d, b8);
    }
}

