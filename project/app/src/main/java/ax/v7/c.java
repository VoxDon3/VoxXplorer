/*
 * Decompiled with CFR 0.152.
 */
package ax.v7;

import ax.q7.h;
import ax.q7.n;
import ax.v7.b;
import ax.v7.d;
import ax.v7.e;
import ax.v7.g;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class c
extends d {
    public static <V> void a(e<V> e8, b<? super V> b8, Executor executor) {
        n.n(b8);
        e8.h(new a<V>(e8, b8), executor);
    }

    public static <V> V b(Future<V> future) throws ExecutionException {
        n.v(future.isDone(), "Future was expected to be done: %s", future);
        return g.a(future);
    }

    private static final class a<V>
    implements Runnable {
        final b<? super V> c0;
        final Future<V> q;

        a(Future<V> future, b<? super V> b8) {
            this.q = future;
            this.c0 = b8;
        }

        @Override
        public void run() {
            ExecutionException executionException2;
            block4: {
                Future<V> future = this.q;
                if (future instanceof ax.w7.a && (future = ax.w7.b.a((ax.w7.a)((Object)future))) != null) {
                    this.c0.b((Throwable)((Object)future));
                    return;
                }
                try {
                    future = c.b(this.q);
                    this.c0.a(future);
                    return;
                }
                catch (Throwable throwable) {
                }
                catch (ExecutionException executionException2) {
                    break block4;
                }
                this.c0.b(throwable);
                return;
            }
            this.c0.b(executionException2.getCause());
        }

        public String toString() {
            return h.b(this).c(this.c0).toString();
        }
    }
}

