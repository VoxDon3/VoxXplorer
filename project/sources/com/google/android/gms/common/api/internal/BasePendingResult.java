package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import ax.K5.h;
import ax.K5.l;
import ax.M5.C0821p;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes3.dex */
public abstract class BasePendingResult<R extends ax.K5.l> extends ax.K5.h<R> {
    static final ThreadLocal n = new F();
    private final Object a;
    protected final a b;
    protected final WeakReference c;
    private final CountDownLatch d;
    private final ArrayList e;
    private ax.K5.m f;
    private final AtomicReference g;
    private ax.K5.l h;
    private Status i;
    private volatile boolean j;
    private boolean k;
    private boolean l;
    private boolean m;

    @KeepName
    private G resultGuardian;

    public static class a<R extends ax.K5.l> extends ax.Y5.k {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(ax.K5.m mVar, ax.K5.l lVar) {
            ThreadLocal threadLocal = BasePendingResult.n;
            sendMessage(obtainMessage(1, new Pair((ax.K5.m) C0821p.l(mVar), lVar)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    ((BasePendingResult) message.obj).d(Status.j0);
                    return;
                }
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i, new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            ax.K5.m mVar = (ax.K5.m) pair.first;
            ax.K5.l lVar = (ax.K5.l) pair.second;
            try {
                mVar.a(lVar);
            } catch (RuntimeException e) {
                BasePendingResult.k(lVar);
                throw e;
            }
        }
    }

    @Deprecated
    BasePendingResult() {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList();
        this.g = new AtomicReference();
        this.m = false;
        this.b = new a(Looper.getMainLooper());
        this.c = new WeakReference(null);
    }

    private final ax.K5.l g() {
        ax.K5.l lVar;
        synchronized (this.a) {
            C0821p.p(!this.j, "Result has already been consumed.");
            C0821p.p(e(), "Result is not ready.");
            lVar = this.h;
            this.h = null;
            this.f = null;
            this.j = true;
        }
        if (((w) this.g.getAndSet(null)) == null) {
            return (ax.K5.l) C0821p.l(lVar);
        }
        throw null;
    }

    private final void h(ax.K5.l lVar) {
        this.h = lVar;
        this.i = lVar.e();
        this.d.countDown();
        ax.L5.F f = null;
        if (this.k) {
            this.f = null;
        } else {
            ax.K5.m mVar = this.f;
            if (mVar != null) {
                this.b.removeMessages(2);
                this.b.a(mVar, g());
            } else if (this.h instanceof ax.K5.j) {
                this.resultGuardian = new G(this, f);
            }
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((h.a) arrayList.get(i)).a(this.i);
        }
        this.e.clear();
    }

    public static void k(ax.K5.l lVar) {
        if (lVar instanceof ax.K5.j) {
            try {
                ((ax.K5.j) lVar).d();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(lVar)), e);
            }
        }
    }

    @Override // ax.K5.h
    public final void a(h.a aVar) {
        C0821p.b(aVar != null, "Callback cannot be null.");
        synchronized (this.a) {
            try {
                if (e()) {
                    aVar.a(this.i);
                } else {
                    this.e.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.K5.h
    @ResultIgnorabilityUnspecified
    public final R b(long j, TimeUnit timeUnit) {
        if (j > 0) {
            C0821p.k("await must not be called on the UI thread when time is greater than zero.");
        }
        C0821p.p(!this.j, "Result has already been consumed.");
        C0821p.p(true, "Cannot await if then() has been called.");
        try {
            if (!this.d.await(j, timeUnit)) {
                d(Status.j0);
            }
        } catch (InterruptedException unused) {
            d(Status.h0);
        }
        C0821p.p(e(), "Result is not ready.");
        return (R) g();
    }

    protected abstract R c(Status status);

    @Deprecated
    public final void d(Status status) {
        synchronized (this.a) {
            try {
                if (!e()) {
                    f(c(status));
                    this.l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        return this.d.getCount() == 0;
    }

    public final void f(R r) {
        synchronized (this.a) {
            try {
                if (this.l || this.k) {
                    k(r);
                    return;
                }
                e();
                C0821p.p(!e(), "Results have already been set");
                C0821p.p(!this.j, "Result has already been consumed");
                h(r);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        boolean z = true;
        if (!this.m && !((Boolean) n.get()).booleanValue()) {
            z = false;
        }
        this.m = z;
    }

    protected BasePendingResult(ax.K5.g gVar) {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList();
        this.g = new AtomicReference();
        this.m = false;
        this.b = new a(gVar != null ? gVar.c() : Looper.getMainLooper());
        this.c = new WeakReference(gVar);
    }
}
