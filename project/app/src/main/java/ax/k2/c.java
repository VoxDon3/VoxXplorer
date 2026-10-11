/*
 * Decompiled with CFR 0.152.
 */
package ax.k2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import ax.Gb.g;
import ax.Gb.l;
import ax.k2.b;
import ax.o2.h;
import ax.sb.t;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class c {
    public static final a m = new a(null);
    public h a;
    private final Handler b;
    private Runnable c;
    private final Object d;
    private long e;
    private final Executor f;
    private int g;
    private long h;
    private ax.o2.g i;
    private boolean j;
    private final Runnable k;
    private final Runnable l;

    public c(long l8, TimeUnit timeUnit, Executor executor) {
        ax.Gb.l.f((Object)timeUnit, "autoCloseTimeUnit");
        ax.Gb.l.f(executor, "autoCloseExecutor");
        this.b = new Handler(Looper.getMainLooper());
        this.d = new Object();
        this.e = timeUnit.toMillis(l8);
        this.f = executor;
        this.h = SystemClock.uptimeMillis();
        this.k = new ax.k2.a(this);
        this.l = new b(this);
    }

    public static /* synthetic */ void a(c c8) {
        ax.k2.c.f(c8);
    }

    public static /* synthetic */ void b(c c8) {
        ax.k2.c.c(c8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final void c(c object) {
        ax.Gb.l.f(object, "this$0");
        Object object2 = ((c)object).d;
        synchronized (object2) {
            Throwable throwable2;
            block11: {
                Object object3;
                block10: {
                    block9: {
                        block8: {
                            block7: {
                                try {
                                    long l8 = SystemClock.uptimeMillis();
                                    long l9 = ((c)object).h;
                                    long l10 = ((c)object).e;
                                    if (l8 - l9 >= l10) break block7;
                                }
                                catch (Throwable throwable2) {}
                                return;
                            }
                            int n8 = ((c)object).g;
                            if (n8 == 0) break block8;
                            return;
                        }
                        object3 = ((c)object).c;
                        if (object3 == null) break block9;
                        object3.run();
                        object3 = t.a;
                        break block10;
                        break block11;
                    }
                    object3 = null;
                }
                if (object3 == null) {
                    object = new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                    throw object;
                }
                object3 = ((c)object).i;
                if (object3 != null && object3.isOpen()) {
                    object3.close();
                }
                ((c)object).i = null;
                object = t.a;
                return;
            }
            throw throwable2;
        }
    }

    private static final void f(c c8) {
        ax.Gb.l.f(c8, "this$0");
        c8.f.execute(c8.l);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() throws IOException {
        Object object = this.d;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                block3: {
                    try {
                        this.j = true;
                        object2 = this.i;
                        if (object2 == null) break block3;
                        object2.close();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.i = null;
                object2 = t.a;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        Object object = this.d;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                block5: {
                    Object object2;
                    block7: {
                        block8: {
                            int n8;
                            try {
                                n8 = this.g;
                                if (n8 <= 0) break block5;
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                            {
                                this.g = --n8;
                                if (n8 != 0) break block7;
                                object2 = this.i;
                                if (object2 != null) break block8;
                            }
                            return;
                        }
                        this.b.postDelayed(this.k, this.e);
                    }
                    object2 = t.a;
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
                throw illegalStateException;
            }
            throw throwable2;
        }
    }

    public final <V> V g(ax.Fb.l<? super ax.o2.g, ? extends V> l8) {
        ax.Gb.l.f(l8, "block");
        try {
            l8 = l8.invoke(this.j());
            return (V)l8;
        }
        finally {
            this.e();
        }
    }

    public final ax.o2.g h() {
        return this.i;
    }

    public final h i() {
        h h8 = this.a;
        if (h8 != null) {
            return h8;
        }
        ax.Gb.l.t("delegateOpenHelper");
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ax.o2.g j() {
        Object object = this.d;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                block4: {
                    ax.o2.g g8;
                    block5: {
                        try {
                            boolean bl;
                            this.b.removeCallbacks(this.k);
                            ++this.g;
                            if (this.j) break block4;
                            g8 = this.i;
                            if (g8 == null || !(bl = g8.isOpen())) break block5;
                        }
                        catch (Throwable throwable2) {}
                        return g8;
                    }
                    this.i = g8 = this.i().g0();
                    return g8;
                    break block6;
                }
                IllegalStateException illegalStateException = new IllegalStateException("Attempting to open already closed database.");
                throw illegalStateException;
            }
            throw throwable2;
        }
    }

    public final void k(h h8) {
        ax.Gb.l.f(h8, "delegateOpenHelper");
        this.n(h8);
    }

    public final boolean l() {
        return this.j ^ true;
    }

    public final void m(Runnable runnable2) {
        ax.Gb.l.f(runnable2, "onAutoClose");
        this.c = runnable2;
    }

    public final void n(h h8) {
        ax.Gb.l.f(h8, "<set-?>");
        this.a = h8;
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }
}

