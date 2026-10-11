/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.o;
import com.google.firebase.concurrent.p;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class h
implements p.c {
    public final o a;
    public final Callable b;
    public final long c;
    public final TimeUnit d;

    public /* synthetic */ h(o o8, Callable callable, long l8, TimeUnit timeUnit) {
        this.a = o8;
        this.b = callable;
        this.c = l8;
        this.d = timeUnit;
    }

    public final ScheduledFuture a(p.b b8) {
        return o.a(this.a, this.b, this.c, this.d, b8);
    }
}

