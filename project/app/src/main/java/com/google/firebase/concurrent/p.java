/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import ax.D.a;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@SuppressLint(value={"RestrictedApi"})
class p<V>
extends a<V>
implements ScheduledFuture<V> {
    private final ScheduledFuture<?> i0;

    p(c<V> c8) {
        this.i0 = c8.a(new b<V>(this){
            final p a;
            {
                this.a = p8;
            }

            @Override
            public void a(Throwable throwable) {
                this.a.D(throwable);
            }

            @Override
            public void set(V v8) {
                this.a.C(v8);
            }
        });
    }

    public int I(Delayed delayed) {
        return this.i0.compareTo(delayed);
    }

    @Override
    public long getDelay(TimeUnit timeUnit) {
        return this.i0.getDelay(timeUnit);
    }

    @Override
    protected void j() {
        this.i0.cancel(this.F());
    }

    static interface b<T> {
        public void a(Throwable var1);

        public void set(T var1);
    }

    static interface c<T> {
        public ScheduledFuture<?> a(b<T> var1);
    }
}

