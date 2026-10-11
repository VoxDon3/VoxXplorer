package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import ax.f2.m;
import ax.j6.AbstractC2327j;
import ax.j6.InterfaceC2321d;
import ax.j6.InterfaceC2323f;
import ax.j6.InterfaceC2324g;
import ax.j6.InterfaceC2326i;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public class b {
    private static final Map<String, b> d = new HashMap();
    private static final Executor e = new m();
    private final Executor a;
    private final h b;
    private AbstractC2327j<c> c = null;

    /* renamed from: com.google.firebase.remoteconfig.internal.b$b, reason: collision with other inner class name */
    private static class C0564b<TResult> implements InterfaceC2324g<TResult>, InterfaceC2323f, InterfaceC2321d {
        private final CountDownLatch a;

        private C0564b() {
            this.a = new CountDownLatch(1);
        }

        @Override // ax.j6.InterfaceC2324g
        public void a(TResult tresult) {
            this.a.countDown();
        }

        public boolean b(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.a.await(j, timeUnit);
        }

        @Override // ax.j6.InterfaceC2321d
        public void c() {
            this.a.countDown();
        }

        @Override // ax.j6.InterfaceC2323f
        public void d(Exception exc) {
            this.a.countDown();
        }
    }

    private b(Executor executor, h hVar) {
        this.a = executor;
        this.b = hVar;
    }

    public static /* synthetic */ AbstractC2327j a(b bVar, boolean z, c cVar, Void r3) {
        if (z) {
            bVar.k(cVar);
        } else {
            bVar.getClass();
        }
        return ax.j6.m.e(cVar);
    }

    private static <TResult> TResult c(AbstractC2327j<TResult> abstractC2327j, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C0564b c0564b = new C0564b();
        Executor executor = e;
        abstractC2327j.e(executor, c0564b);
        abstractC2327j.d(executor, c0564b);
        abstractC2327j.a(executor, c0564b);
        if (!c0564b.b(j, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (abstractC2327j.m()) {
            return abstractC2327j.j();
        }
        throw new ExecutionException(abstractC2327j.i());
    }

    public static synchronized b h(Executor executor, h hVar) {
        b bVar;
        synchronized (b.class) {
            try {
                String b = hVar.b();
                Map<String, b> map = d;
                if (!map.containsKey(b)) {
                    map.put(b, new b(executor, hVar));
                }
                bVar = map.get(b);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    private synchronized void k(c cVar) {
        this.c = ax.j6.m.e(cVar);
    }

    public void d() {
        synchronized (this) {
            this.c = ax.j6.m.e(null);
        }
        this.b.a();
    }

    public synchronized AbstractC2327j<c> e() {
        try {
            AbstractC2327j<c> abstractC2327j = this.c;
            if (abstractC2327j != null) {
                if (abstractC2327j.l() && !this.c.m()) {
                }
            }
            Executor executor = this.a;
            final h hVar = this.b;
            Objects.requireNonNull(hVar);
            this.c = ax.j6.m.c(executor, new Callable() { // from class: ax.j8.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return com.google.firebase.remoteconfig.internal.h.this.d();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public c f() {
        return g(5L);
    }

    c g(long j) {
        synchronized (this) {
            try {
                AbstractC2327j<c> abstractC2327j = this.c;
                if (abstractC2327j != null && abstractC2327j.m()) {
                    return this.c.j();
                }
                try {
                    return (c) c(e(), j, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e2);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AbstractC2327j<c> i(c cVar) {
        return j(cVar, true);
    }

    public AbstractC2327j<c> j(final c cVar, final boolean z) {
        return ax.j6.m.c(this.a, new Callable() { // from class: ax.j8.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void e2;
                e2 = com.google.firebase.remoteconfig.internal.b.this.b.e(cVar);
                return e2;
            }
        }).o(this.a, new InterfaceC2326i() { // from class: ax.j8.d
            @Override // ax.j6.InterfaceC2326i
            public final AbstractC2327j a(Object obj) {
                return com.google.firebase.remoteconfig.internal.b.a(com.google.firebase.remoteconfig.internal.b.this, z, cVar, (Void) obj);
            }
        });
    }
}
