package ax.Ba;

import ax.Q8.g;
import ax.Q8.q;
import ax.Q8.t;
import ax.b.C1439a;
import ax.i9.C2292d;
import ax.r9.C3016b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.EnumSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public abstract class b {
    private final C3016b c0;
    private final long d0;
    private final long e0;
    private final g q;

    public b(C3016b c3016b, C2292d c2292d) {
        this.q = c3016b.j().s0().a();
        this.c0 = c3016b;
        this.d0 = c3016b.p();
        this.e0 = c2292d.Q();
    }

    public g a() {
        return this.q;
    }

    public C3016b b() {
        return this.c0;
    }

    public long c() {
        return this.d0;
    }

    public <T extends q> T d(Future<T> future) throws IOException {
        try {
            return future.get(this.e0, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            interruptedIOException.initCause(e);
            throw interruptedIOException;
        } catch (ExecutionException e2) {
            throw new IOException(e2);
        } catch (TimeoutException e3) {
            C1439a c1439a = new C1439a();
            c1439a.initCause(e3);
            throw c1439a;
        }
    }

    public <T extends q> Future<T> e(q qVar) throws IOException {
        try {
            return b().H(qVar);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public <T extends q> T f(q qVar, EnumSet<ax.K8.a> enumSet) throws IOException {
        T t = (T) d(e(qVar));
        t tVar = (t) t.c();
        if (enumSet.contains(ax.K8.a.l(tVar.m()))) {
            return t;
        }
        throw new a(tVar, "expected=" + enumSet);
    }
}
