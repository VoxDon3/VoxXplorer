/*
 * Decompiled with CFR 0.152.
 */
package ax.k2;

import ax.Gb.l;
import ax.k2.B;
import ax.sb.t;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class C
implements Executor {
    private final ArrayDeque<Runnable> c0;
    private Runnable d0;
    private final Object e0;
    private final Executor q;

    public C(Executor executor) {
        l.f(executor, "executor");
        this.q = executor;
        this.c0 = new ArrayDeque();
        this.e0 = new Object();
    }

    public static /* synthetic */ void a(Runnable runnable2, C c8) {
        C.b(runnable2, c8);
    }

    private static final void b(Runnable runnable2, C c8) {
        l.f(runnable2, "$command");
        l.f(c8, "this$0");
        try {
            runnable2.run();
            return;
        }
        finally {
            c8.c();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        Object object = this.e0;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                block3: {
                    try {
                        Runnable runnable2;
                        object2 = this.c0.poll();
                        this.d0 = runnable2 = object2;
                        if (object2 == null) break block3;
                        this.q.execute(runnable2);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object2 = t.a;
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
    @Override
    public void execute(Runnable object) {
        l.f(object, "command");
        Object object2 = this.e0;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        ArrayDeque<Runnable> arrayDeque = this.c0;
                        B b8 = new B((Runnable)object, this);
                        arrayDeque.offer(b8);
                        if (this.d0 != null) break block3;
                        this.c();
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
}

