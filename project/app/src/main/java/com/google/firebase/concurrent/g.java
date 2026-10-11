/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.o;
import com.google.firebase.concurrent.p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class g
implements p.c {
    public final o a;
    public final Runnable b;
    public final long c;
    public final long d;
    public final TimeUnit e;

    public /* synthetic */ g(o o8, Runnable runnable2, long l8, long l9, TimeUnit timeUnit) {
        this.a = o8;
        this.b = runnable2;
        this.c = l8;
        this.d = l9;
        this.e = timeUnit;
    }

    public final ScheduledFuture a(p.b b8) {
        return o.b(this.a, this.b, this.c, this.d, this.e, b8);
    }
}

