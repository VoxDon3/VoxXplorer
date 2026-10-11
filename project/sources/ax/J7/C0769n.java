package ax.J7;

import ax.j6.AbstractC2327j;
import ax.j6.InterfaceC2319b;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: ax.J7.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0769n {
    private final Executor a;
    private AbstractC2327j<Void> b = ax.j6.m.e(null);
    private final Object c = new Object();
    private final ThreadLocal<Boolean> d = new ThreadLocal<>();

    /* renamed from: ax.J7.n$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0769n.this.d.set(Boolean.TRUE);
        }
    }

    /* renamed from: ax.J7.n$b */
    class b implements Callable<Void> {
        final /* synthetic */ Runnable a;

        b(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            this.a.run();
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: ax.J7.n$c */
    class c<T> implements InterfaceC2319b<Void, T> {
        final /* synthetic */ Callable a;

        c(Callable callable) {
            this.a = callable;
        }

        @Override // ax.j6.InterfaceC2319b
        public T a(AbstractC2327j<Void> abstractC2327j) throws Exception {
            return (T) this.a.call();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: ax.J7.n$d */
    class d<T> implements InterfaceC2319b<T, Void> {
        d() {
        }

        @Override // ax.j6.InterfaceC2319b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(AbstractC2327j<T> abstractC2327j) throws Exception {
            return null;
        }
    }

    public C0769n(Executor executor) {
        this.a = executor;
        executor.execute(new a());
    }

    private <T> AbstractC2327j<Void> d(AbstractC2327j<T> abstractC2327j) {
        return abstractC2327j.g(this.a, new d());
    }

    private boolean e() {
        return Boolean.TRUE.equals(this.d.get());
    }

    private <T> InterfaceC2319b<Void, T> f(Callable<T> callable) {
        return new c(callable);
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.a;
    }

    AbstractC2327j<Void> g(Runnable runnable) {
        return h(new b(runnable));
    }

    public <T> AbstractC2327j<T> h(Callable<T> callable) {
        AbstractC2327j<T> g;
        synchronized (this.c) {
            g = this.b.g(this.a, f(callable));
            this.b = d(g);
        }
        return g;
    }

    public <T> AbstractC2327j<T> i(Callable<AbstractC2327j<T>> callable) {
        AbstractC2327j<T> h;
        synchronized (this.c) {
            h = this.b.h(this.a, f(callable));
            this.b = d(h);
        }
        return h;
    }
}
