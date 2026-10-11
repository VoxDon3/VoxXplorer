/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import ax.j6.b;
import ax.j6.j;
import ax.j6.m;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class n {
    private final Executor a;
    private j<Void> b = m.e(null);
    private final Object c = new Object();
    private final ThreadLocal<Boolean> d = new ThreadLocal();

    public n(Executor executor) {
        this.a = executor;
        executor.execute(new Runnable(this){
            final n q;
            {
                this.q = n8;
            }

            @Override
            public void run() {
                this.q.d.set(Boolean.TRUE);
            }
        });
    }

    private <T> j<Void> d(j<T> j8) {
        return j8.g(this.a, new b<T, Void>(this){
            final n a;
            {
                this.a = n8;
            }

            public Void b(j<T> j8) throws Exception {
                return null;
            }
        });
    }

    private boolean e() {
        return Boolean.TRUE.equals(this.d.get());
    }

    private <T> b<Void, T> f(Callable<T> callable) {
        return new b<Void, T>(){
            final Callable a;
            final n b;
            {
                this.b = n8;
                this.a = callable;
            }

            @Override
            public T a(j<Void> j8) throws Exception {
                return this.a.call();
            }
        };
    }

    public void b() {
        if (this.e()) {
            return;
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public Executor c() {
        return this.a;
    }

    j<Void> g(Runnable runnable2) {
        return this.h(new Callable<Void>(){
            final Runnable a;
            final n b;
            {
                this.b = n8;
                this.a = runnable2;
            }

            public Void a() throws Exception {
                this.a.run();
                return null;
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <T> j<T> h(Callable<T> object) {
        Object object2 = this.c;
        synchronized (object2) {
            object = this.b.g(this.a, this.f((Callable<T>)object));
            this.b = this.d((j<T>)object);
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <T> j<T> i(Callable<j<T>> object) {
        Object object2 = this.c;
        synchronized (object2) {
            object = this.b.h(this.a, this.f((Callable<T>)object));
            this.b = this.d((j<T>)object);
            return object;
        }
    }
}

