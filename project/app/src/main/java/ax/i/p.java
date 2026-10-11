/*
 * Decompiled with CFR 0.152.
 */
package ax.i;

import ax.Fb.a;
import ax.Gb.l;
import ax.i.o;
import ax.sb.t;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class p {
    private final Executor a;
    private final a<t> b;
    private final Object c;
    private int d;
    private boolean e;
    private boolean f;
    private final List<a<t>> g;
    private final Runnable h;

    public p(Executor executor, a<t> a8) {
        l.f(executor, "executor");
        l.f(a8, "reportFullyDrawn");
        this.a = executor;
        this.b = a8;
        this.c = new Object();
        this.g = new ArrayList<a<t>>();
        this.h = new o(this);
    }

    public static /* synthetic */ void a(p p8) {
        p.d(p8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final void d(p object) {
        l.f(object, "this$0");
        Object object2 = ((p)object).c;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        ((p)object).e = false;
                        if (((p)object).d != 0 || ((p)object).f) break block3;
                        ((p)object).b.invoke();
                        ((p)object).b();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = t.a;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        Object object = this.c;
        synchronized (object) {
            try {
                this.f = true;
                Object object2 = ((Iterable)this.g).iterator();
                while (true) {
                    if (!object2.hasNext()) {
                        this.g.clear();
                        object2 = t.a;
                        return;
                    }
                    ((a)object2.next()).invoke();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final boolean c() {
        Object object = this.c;
        synchronized (object) {
            boolean bl = this.f;
            return bl;
        }
    }
}

