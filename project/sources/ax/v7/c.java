package ax.v7;

import ax.q7.C2881h;
import ax.q7.n;
import ax.w7.AbstractC3372a;
import ax.w7.C3373b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public final class c extends d {

    private static final class a<V> implements Runnable {
        final InterfaceC3289b<? super V> c0;
        final Future<V> q;

        a(Future<V> future, InterfaceC3289b<? super V> interfaceC3289b) {
            this.q = future;
            this.c0 = interfaceC3289b;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable a;
            Future<V> future = this.q;
            if ((future instanceof AbstractC3372a) && (a = C3373b.a((AbstractC3372a) future)) != null) {
                this.c0.b(a);
                return;
            }
            try {
                this.c0.a(c.b(this.q));
            } catch (ExecutionException e) {
                this.c0.b(e.getCause());
            } catch (Throwable th) {
                this.c0.b(th);
            }
        }

        public String toString() {
            return C2881h.b(this).c(this.c0).toString();
        }
    }

    public static <V> void a(e<V> eVar, InterfaceC3289b<? super V> interfaceC3289b, Executor executor) {
        n.n(interfaceC3289b);
        eVar.h(new a(eVar, interfaceC3289b), executor);
    }

    public static <V> V b(Future<V> future) throws ExecutionException {
        n.v(future.isDone(), "Future was expected to be done: %s", future);
        return (V) g.a(future);
    }
}
