package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes3.dex */
class p<V> extends ax.D.a<V> implements ScheduledFuture<V> {
    private final ScheduledFuture<?> i0;

    class a implements b<V> {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th) {
            p.this.D(th);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(V v) {
            p.this.C(v);
        }
    }

    interface b<T> {
        void a(Throwable th);

        void set(T t);
    }

    interface c<T> {
        ScheduledFuture<?> a(b<T> bVar);
    }

    p(c<V> cVar) {
        this.i0 = cVar.a(new a());
    }

    @Override // java.lang.Comparable
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.i0.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.i0.getDelay(timeUnit);
    }

    @Override // ax.D.a
    protected void j() {
        this.i0.cancel(F());
    }
}
