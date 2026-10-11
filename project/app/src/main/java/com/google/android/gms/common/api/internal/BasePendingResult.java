/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import ax.K5.g;
import ax.K5.h;
import ax.K5.j;
import ax.K5.l;
import ax.K5.m;
import ax.M5.p;
import ax.Y5.k;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.F;
import com.google.android.gms.common.api.internal.G;
import com.google.android.gms.common.api.internal.w;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends l>
extends h<R> {
    static final ThreadLocal n = new F();
    private final Object a = new Object();
    protected final a b;
    protected final WeakReference c;
    private final CountDownLatch d = new CountDownLatch(1);
    private final ArrayList e = new ArrayList();
    private m f;
    private final AtomicReference g = new AtomicReference();
    private l h;
    private Status i;
    private volatile boolean j;
    private boolean k;
    private boolean l;
    private boolean m = false;
    @KeepName
    private G resultGuardian;

    @Deprecated
    BasePendingResult() {
        this.b = new a(Looper.getMainLooper());
        this.c = new WeakReference<Object>(null);
    }

    protected BasePendingResult(g g8) {
        Looper looper = g8 != null ? g8.c() : Looper.getMainLooper();
        this.b = new a(looper);
        this.c = new WeakReference<g>(g8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final l g() {
        Object object = this.a;
        // MONITORENTER : object
        p.p(this.j ^ true, "Result has already been consumed.");
        p.p(this.e(), "Result is not ready.");
        l l8 = this.h;
        this.h = null;
        this.f = null;
        this.j = true;
        // MONITOREXIT : object
        if ((w)this.g.getAndSet(null) != null) throw null;
        return p.l(l8);
    }

    private final void h(l object) {
        this.h = object;
        this.i = object.e();
        this.d.countDown();
        if (this.k) {
            this.f = null;
        } else {
            object = this.f;
            if (object == null) {
                if (this.h instanceof j) {
                    this.resultGuardian = new G(this, null);
                }
            } else {
                this.b.removeMessages(2);
                this.b.a((m)object, this.g());
            }
        }
        object = this.e;
        int n8 = object.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            ((h.a)object.get(i8)).a(this.i);
        }
        this.e.clear();
    }

    static /* bridge */ /* synthetic */ l i(BasePendingResult basePendingResult) {
        return basePendingResult.h;
    }

    public static void k(l l8) {
        if (l8 instanceof j) {
            try {
                ((j)((Object)l8)).d();
                return;
            }
            catch (RuntimeException runtimeException) {
                Log.w((String)"BasePendingResult", (String)"Unable to release ".concat(String.valueOf(l8)), (Throwable)runtimeException);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(h.a a8) {
        boolean bl = a8 != null;
        p.b(bl, "Callback cannot be null.");
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            if (!this.e()) break block3;
                            a8.a(this.i);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    this.e.add(a8);
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    @ResultIgnorabilityUnspecified
    public final R b(long l8, TimeUnit timeUnit) {
        if (l8 > 0L) {
            p.k("await must not be called on the UI thread when time is greater than zero.");
        }
        p.p(this.j ^ true, "Result has already been consumed.");
        p.p(true, "Cannot await if then() has been called.");
        try {
            if (!this.d.await(l8, timeUnit)) {
                this.d(Status.j0);
            }
        }
        catch (InterruptedException interruptedException) {
            this.d(Status.h0);
        }
        p.p(this.e(), "Result is not ready.");
        return (R)this.g();
    }

    protected abstract R c(Status var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Deprecated
    public final void d(Status status) {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.e()) break block3;
                        this.f(this.c(status));
                        this.l = true;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final boolean e() {
        return this.d.getCount() == 0L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(R r8) {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                try {
                    if (!this.l && !this.k) {
                        this.e();
                        p.p(this.e() ^ true, "Results have already been set");
                        p.p(this.j ^ true, "Result has already been consumed");
                        this.h((l)r8);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                BasePendingResult.k(r8);
                return;
            }
            throw throwable2;
        }
    }

    public final void j() {
        boolean bl;
        boolean bl2 = this.m;
        boolean bl3 = bl = true;
        if (!bl2) {
            bl3 = (Boolean)n.get() != false ? bl : false;
        }
        this.m = bl3;
    }

    public static class a<R extends l>
    extends k {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(m m8, l l8) {
            ThreadLocal threadLocal = n;
            this.sendMessage(this.obtainMessage(1, new Pair((Object)p.l(m8), (Object)l8)));
        }

        public final void handleMessage(Message object) {
            int n8 = ((Message)object).what;
            if (n8 != 1) {
                if (n8 != 2) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Don't know how to handle message: ");
                    ((StringBuilder)object).append(n8);
                    Log.wtf((String)"BasePendingResult", (String)((StringBuilder)object).toString(), (Throwable)new Exception());
                    return;
                }
                ((BasePendingResult)((Message)object).obj).d(Status.j0);
                return;
            }
            Object object2 = (Pair)((Message)object).obj;
            object = (m)object2.first;
            object2 = (l)object2.second;
            try {
                object.a(object2);
                return;
            }
            catch (RuntimeException runtimeException) {
                BasePendingResult.k((l)object2);
                throw runtimeException;
            }
        }
    }
}

