package ax.D;

import ax.v7.e;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class c {

    public static final class a<T> {
        Object a;
        d<T> b;
        private ax.D.d<Void> c = ax.D.d.G();
        private boolean d;

        a() {
        }

        private void d() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        void a() {
            this.a = null;
            this.b = null;
            this.c.C(null);
        }

        public boolean b(T t) {
            this.d = true;
            d<T> dVar = this.b;
            boolean z = dVar != null && dVar.b(t);
            if (z) {
                d();
            }
            return z;
        }

        public boolean c() {
            this.d = true;
            d<T> dVar = this.b;
            boolean z = dVar != null && dVar.a(true);
            if (z) {
                d();
            }
            return z;
        }

        public boolean e(Throwable th) {
            this.d = true;
            d<T> dVar = this.b;
            boolean z = dVar != null && dVar.c(th);
            if (z) {
                d();
            }
            return z;
        }

        protected void finalize() {
            ax.D.d<Void> dVar;
            d<T> dVar2 = this.b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
            }
            if (this.d || (dVar = this.c) == null) {
                return;
            }
            dVar.C(null);
        }
    }

    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: ax.D.c$c, reason: collision with other inner class name */
    public interface InterfaceC0066c<T> {
        Object a(a<T> aVar) throws Exception;
    }

    private static final class d<T> implements e<T> {
        private final ax.D.a<T> c0 = new a();
        final WeakReference<a<T>> q;

        class a extends ax.D.a<T> {
            a() {
            }

            @Override // ax.D.a
            protected String x() {
                a<T> aVar = d.this.q.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.a + "]";
            }
        }

        d(a<T> aVar) {
            this.q = new WeakReference<>(aVar);
        }

        boolean a(boolean z) {
            return this.c0.cancel(z);
        }

        boolean b(T t) {
            return this.c0.C(t);
        }

        boolean c(Throwable th) {
            return this.c0.D(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            a<T> aVar = this.q.get();
            boolean cancel = this.c0.cancel(z);
            if (cancel && aVar != null) {
                aVar.a();
            }
            return cancel;
        }

        @Override // java.util.concurrent.Future
        public T get() throws InterruptedException, ExecutionException {
            return this.c0.get();
        }

        @Override // ax.v7.e
        public void h(Runnable runnable, Executor executor) {
            this.c0.h(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.c0.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.c0.isDone();
        }

        public String toString() {
            return this.c0.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.c0.get(j, timeUnit);
        }
    }

    public static <T> e<T> a(InterfaceC0066c<T> interfaceC0066c) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.b = dVar;
        aVar.a = interfaceC0066c.getClass();
        try {
            Object a2 = interfaceC0066c.a(aVar);
            if (a2 != null) {
                aVar.a = a2;
                return dVar;
            }
        } catch (Exception e) {
            dVar.c(e);
        }
        return dVar;
    }
}
