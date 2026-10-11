/*
 * Decompiled with CFR 0.152.
 */
package ax.a9;

import ax.Xd.d;
import ax.a9.a;
import ax.a9.c;
import ax.a9.f;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class e<V, T extends Throwable> {
    private final d a = ax.Xd.f.k(this.getClass());
    private final String b;
    private final c<T> c;
    private final ReentrantLock d;
    private final Condition e;
    private V f;
    private T g;

    public e(String string, c<T> c8) {
        this(string, c8, null);
    }

    public e(String object, c<T> c8, ReentrantLock reentrantLock) {
        this.b = object;
        this.c = c8;
        object = reentrantLock;
        if (reentrantLock == null) {
            object = new ReentrantLock();
        }
        this.d = object;
        this.e = ((ReentrantLock)object).newCondition();
    }

    public void a(V v8) {
        this.d.lock();
        try {
            this.a.d("Setting << {} >> to `{}`", this.b, v8);
            this.f = v8;
            this.e.signalAll();
            return;
        }
        finally {
            this.d.unlock();
        }
    }

    public void b(Throwable throwable) {
        this.d.lock();
        try {
            this.g = this.c.a(throwable);
            this.e.signalAll();
            return;
        }
        finally {
            this.d.unlock();
        }
    }

    public a<V> c() {
        return new f(this);
    }

    public boolean d() {
        Throwable throwable2;
        block2: {
            boolean bl;
            this.d.lock();
            try {
                V v8;
                bl = this.g == null && (v8 = this.f) != null;
            }
            catch (Throwable throwable2) {
                break block2;
            }
            this.d.unlock();
            return bl;
        }
        this.d.unlock();
        throw throwable2;
    }

    public V e() throws T {
        return this.g(0L, TimeUnit.SECONDS);
    }

    public V f(long l8, TimeUnit timeUnit) throws T {
        Object object = this.g(l8, timeUnit);
        if (object != null) {
            return object;
        }
        object = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Timeout expired :");
        stringBuilder.append(l8);
        stringBuilder.append(" ");
        stringBuilder.append(timeUnit.name());
        throw object.a(new TimeoutException(stringBuilder.toString()));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public V g(long l8, TimeUnit timeUnit) throws T {
        block11: {
            block10: {
                block9: {
                    this.d.lock();
                    Object object = this.g;
                    if (object != null) throw object;
                    object = this.f;
                    if (object == null) break block9;
                    this.d.unlock();
                    return (V)object;
                }
                this.a.s("Awaiting << {} >>", this.b);
                if (l8 == 0L) {
                    while (this.f == null && this.g == null) {
                        this.e.await();
                    }
                    break block10;
                }
                boolean bl = this.e.await(l8, timeUnit);
                if (bl) break block10;
                this.d.unlock();
                return null;
            }
            timeUnit = this.g;
            if (timeUnit != null) break block11;
            timeUnit = this.f;
            this.d.unlock();
            return (V)((Object)timeUnit);
        }
        try {
            this.a.p("<< {} >> woke to: {}", this.b, (Object)timeUnit);
            throw this.g;
        }
        catch (Throwable throwable) {}
        this.d.unlock();
        throw throwable;
        catch (InterruptedException interruptedException) {
            throw this.c.a(interruptedException);
        }
    }

    public String toString() {
        return this.b;
    }
}

