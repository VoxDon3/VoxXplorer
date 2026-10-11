/*
 * Decompiled with CFR 0.152.
 */
package ax.Ba;

import ax.Ba.a;
import ax.Q8.g;
import ax.Q8.q;
import ax.Q8.t;
import ax.i9.d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.EnumSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class b {
    private final ax.r9.b c0;
    private final long d0;
    private final long e0;
    private final g q;

    public b(ax.r9.b b8, d d8) {
        this.q = b8.j().s0().a();
        this.c0 = b8;
        this.d0 = b8.p();
        this.e0 = d8.Q();
    }

    public g a() {
        return this.q;
    }

    public ax.r9.b b() {
        return this.c0;
    }

    public long c() {
        return this.d0;
    }

    public <T extends q> T d(Future<T> object) throws IOException {
        InterruptedException interruptedException2;
        block5: {
            TimeoutException timeoutException2;
            block4: {
                try {
                    object = (q)object.get(this.e0, TimeUnit.MILLISECONDS);
                }
                catch (ExecutionException executionException) {
                }
                catch (TimeoutException timeoutException2) {
                    break block4;
                }
                catch (InterruptedException interruptedException2) {
                    break block5;
                }
                return (T)object;
                throw new IOException(executionException);
            }
            object = new ax.b.a();
            ((Throwable)object).initCause(timeoutException2);
            throw object;
        }
        object = new InterruptedIOException();
        ((Throwable)object).initCause(interruptedException2);
        throw object;
    }

    public <T extends q> Future<T> e(q object) throws IOException {
        IOException iOException2;
        block3: {
            try {
                object = this.b().H((q)object);
                return object;
            }
            catch (Exception exception) {
            }
            catch (IOException iOException2) {
                break block3;
            }
            throw new IOException(exception);
        }
        throw iOException2;
    }

    public <T extends q> T f(q object, EnumSet<ax.K8.a> enumSet) throws IOException {
        Object object2 = this.d(this.e((q)object));
        if (enumSet.contains(ax.K8.a.l(((t)(object = (t)((ax.h9.d)object2).c())).m()))) {
            return object2;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("expected=");
        ((StringBuilder)object2).append(enumSet);
        throw new a((t)object, ((StringBuilder)object2).toString());
    }
}

