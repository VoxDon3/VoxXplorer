/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import ax.f2.m;
import ax.j6.f;
import ax.j6.g;
import ax.j6.j;
import ax.j8.d;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class b {
    private static final Map<String, b> d = new HashMap<String, b>();
    private static final Executor e = new m();
    private final Executor a;
    private final h b;
    private j<c> c;

    private b(Executor executor, h h8) {
        this.a = executor;
        this.b = h8;
        this.c = null;
    }

    public static /* synthetic */ j a(b b8, boolean bl, c c8, Void void_) {
        if (bl) {
            b8.k(c8);
        } else {
            b8.getClass();
        }
        return ax.j6.m.e(c8);
    }

    public static /* synthetic */ Void b(b b8, c c8) {
        return b8.b.e(c8);
    }

    private static <TResult> TResult c(j<TResult> j8, long l8, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        b b8 = new b();
        Executor executor = e;
        j8.e(executor, b8);
        j8.d(executor, b8);
        j8.a(executor, b8);
        if (b8.b(l8, timeUnit)) {
            if (j8.m()) {
                return j8.j();
            }
            throw new ExecutionException(j8.i());
        }
        throw new TimeoutException("Task await timed out.");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b h(Executor object, h h8) {
        synchronized (b.class) {
            try {
                String string = h8.b();
                Map<String, b> map = d;
                if (map.containsKey(string)) return map.get(string);
                b b8 = new b((Executor)object, h8);
                map.put(string, b8);
                return map.get(string);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void k(c c8) {
        synchronized (this) {
            this.c = ax.j6.m.e(c8);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d() {
        synchronized (this) {
            this.c = ax.j6.m.e(null);
        }
        this.b.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public j<c> e() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                j<c> j8;
                block3: {
                    try {
                        j8 = this.c;
                        if (j8 == null) break block3;
                        if (!j8.l()) return this.c;
                        if (this.c.m()) return this.c;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                j8 = this.a;
                h h8 = this.b;
                j.Objects.requireNonNull((Object)h8);
                ax.j8.b b8 = new ax.j8.b(h8);
                this.c = ax.j6.m.c(j8, b8);
                return this.c;
            }
            throw throwable2;
        }
    }

    public c f() {
        return this.g(5L);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    c g(long l8) {
        Throwable var3_7;
        // MONITORENTER : this
        Object j8 = this.c;
        if (j8 != null && ((j)j8).m()) {
            j8 = this.c.j();
            // MONITOREXIT : this
            return j8;
        }
        try {
            return com.google.firebase.remoteconfig.internal.b.c(this.e(), l8, TimeUnit.SECONDS);
        }
        catch (TimeoutException timeoutException) {
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        Log.d((String)"FirebaseRemoteConfig", (String)"Reading from storage file failed.", (Throwable)var3_7);
        return null;
    }

    public j<c> i(c c8) {
        return this.j(c8, true);
    }

    public j<c> j(c c8, boolean bl) {
        return ax.j6.m.c(this.a, new ax.j8.c(this, c8)).o(this.a, new d(this, bl, c8));
    }

    private static class b<TResult>
    implements g<TResult>,
    f,
    ax.j6.d {
        private final CountDownLatch a = new CountDownLatch(1);

        private b() {
        }

        @Override
        public void a(TResult TResult) {
            this.a.countDown();
        }

        public boolean b(long l8, TimeUnit timeUnit) throws InterruptedException {
            return this.a.await(l8, timeUnit);
        }

        @Override
        public void c() {
            this.a.countDown();
        }

        @Override
        public void d(Exception exception) {
            this.a.countDown();
        }
    }
}

