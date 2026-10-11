package ax.a9;

import java.lang.Throwable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public class e<V, T extends Throwable> {
    private final ax.Xd.d a;
    private final String b;
    private final c<T> c;
    private final ReentrantLock d;
    private final Condition e;
    private V f;
    private T g;

    public e(String str, c<T> cVar) {
        this(str, cVar, null);
    }

    public void a(V v) {
        this.d.lock();
        try {
            this.a.d("Setting << {} >> to `{}`", this.b, v);
            this.f = v;
            this.e.signalAll();
        } finally {
            this.d.unlock();
        }
    }

    public void b(Throwable th) {
        this.d.lock();
        try {
            this.g = this.c.a(th);
            this.e.signalAll();
        } finally {
            this.d.unlock();
        }
    }

    public AbstractFutureC1431a<V> c() {
        return new f(this);
    }

    public boolean d() {
        boolean z;
        this.d.lock();
        try {
            if (this.g == null) {
                if (this.f != null) {
                    z = true;
                    return z;
                }
            }
            z = false;
            return z;
        } finally {
            this.d.unlock();
        }
    }

    public V e() throws Throwable {
        return g(0L, TimeUnit.SECONDS);
    }

    public V f(long j, TimeUnit timeUnit) throws Throwable {
        V g = g(j, timeUnit);
        if (g != null) {
            return g;
        }
        throw this.c.a(new TimeoutException("Timeout expired :" + j + " " + timeUnit.name()));
    }

    public V g(long j, TimeUnit timeUnit) throws Throwable {
        this.d.lock();
        try {
            try {
                T t = this.g;
                if (t != null) {
                    throw t;
                }
                V v = this.f;
                if (v != null) {
                    this.d.unlock();
                    return v;
                }
                this.a.s("Awaiting << {} >>", this.b);
                if (j == 0) {
                    while (this.f == null && this.g == null) {
                        this.e.await();
                    }
                } else if (!this.e.await(j, timeUnit)) {
                    this.d.unlock();
                    return null;
                }
                T t2 = this.g;
                if (t2 != null) {
                    this.a.p("<< {} >> woke to: {}", this.b, t2);
                    throw this.g;
                }
                V v2 = this.f;
                this.d.unlock();
                return v2;
            } catch (InterruptedException e) {
                throw this.c.a(e);
            }
        } catch (Throwable th) {
            this.d.unlock();
            throw th;
        }
    }

    public String toString() {
        return this.b;
    }

    public e(String str, c<T> cVar, ReentrantLock reentrantLock) {
        this.a = ax.Xd.f.k(getClass());
        this.b = str;
        this.c = cVar;
        reentrantLock = reentrantLock == null ? new ReentrantLock() : reentrantLock;
        this.d = reentrantLock;
        this.e = reentrantLock.newCondition();
    }
}
