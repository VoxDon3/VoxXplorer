/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk.internal;

import ax.la.b;
import ax.la.i;
import ax.la.j;
import com.pcloud.sdk.internal.C;
import com.pcloud.sdk.internal.D;
import java.io.IOException;
import java.util.concurrent.Executor;

class E<T>
implements i<T> {
    private final Executor c0;
    private final i<T> q;

    E(i<T> i8, Executor executor) {
        this.q = i8;
        this.c0 = executor;
    }

    @Override
    public void A(j<T> j8) {
        if (j8 != null) {
            this.q.A(new j<T>(){
                final j a;
                final E b;
                {
                    this.b = e8;
                    this.a = j8;
                }

                public static /* synthetic */ void c(a a8, j j8, Object object) {
                    a8.f(j8, object);
                }

                public static /* synthetic */ void d(a a8, j j8, Throwable throwable) {
                    a8.e(j8, throwable);
                }

                private /* synthetic */ void e(j j8, Throwable throwable) {
                    j8.a(this.b, throwable);
                }

                private /* synthetic */ void f(j j8, Object object) {
                    j8.b(this.b, object);
                }

                @Override
                public void a(i<T> i8, Throwable throwable) {
                    this.b.c0.execute(new C(this, this.a, throwable));
                }

                @Override
                public void b(i<T> i8, T t8) {
                    this.b.c0.execute(new D(this, this.a, t8));
                }
            });
            return;
        }
        throw new IllegalArgumentException("Callback argument cannot be null.");
    }

    public E<T> c() {
        return new E<T>(this.q.clone(), this.c0);
    }

    @Override
    public T execute() throws IOException, b {
        return this.q.execute();
    }
}

