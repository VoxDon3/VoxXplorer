package com.pcloud.sdk.internal;

import ax.la.C2492b;
import com.pcloud.sdk.internal.E;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
class E<T> implements ax.la.i<T> {
    private final Executor c0;
    private final ax.la.i<T> q;

    class a implements ax.la.j<T> {
        final /* synthetic */ ax.la.j a;

        a(ax.la.j jVar) {
            this.a = jVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(ax.la.j jVar, Throwable th) {
            jVar.a(E.this, th);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(ax.la.j jVar, Object obj) {
            jVar.b(E.this, obj);
        }

        @Override // ax.la.j
        public void a(ax.la.i<T> iVar, final Throwable th) {
            Executor executor = E.this.c0;
            final ax.la.j jVar = this.a;
            executor.execute(new Runnable() { // from class: com.pcloud.sdk.internal.C
                @Override // java.lang.Runnable
                public final void run() {
                    E.a.this.e(jVar, th);
                }
            });
        }

        @Override // ax.la.j
        public void b(ax.la.i<T> iVar, final T t) {
            Executor executor = E.this.c0;
            final ax.la.j jVar = this.a;
            executor.execute(new Runnable() { // from class: com.pcloud.sdk.internal.D
                @Override // java.lang.Runnable
                public final void run() {
                    E.a.this.f(jVar, t);
                }
            });
        }
    }

    E(ax.la.i<T> iVar, Executor executor) {
        this.q = iVar;
        this.c0 = executor;
    }

    @Override // ax.la.i
    public void A(ax.la.j<T> jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("Callback argument cannot be null.");
        }
        this.q.A(new a(jVar));
    }

    @Override // ax.la.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public E<T> m4clone() {
        return new E<>(this.q.m4clone(), this.c0);
    }

    @Override // ax.la.i
    public T execute() throws IOException, C2492b {
        return this.q.execute();
    }
}
