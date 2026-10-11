package ax.p4;

import ax.p4.C2769f;
import ax.s4.AbstractC3046a;
import ax.v4.AbstractC3276c;
import ax.w4.C3343c;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class o<R, E, X extends C2769f> implements Closeable, AutoCloseable {
    private final AbstractC3276c<R> c0;
    private final AbstractC3276c<E> d0;
    private boolean e0 = false;
    private boolean f0 = false;
    private final String g0;
    private final AbstractC3046a.c q;

    protected o(AbstractC3046a.c cVar, AbstractC3276c<R> abstractC3276c, AbstractC3276c<E> abstractC3276c2, String str) {
        this.q = cVar;
        this.c0 = abstractC3276c;
        this.d0 = abstractC3276c2;
        this.g0 = str;
    }

    private void a() {
        if (this.e0) {
            throw new IllegalStateException("This uploader is already closed.");
        }
        if (this.f0) {
            throw new IllegalStateException("This uploader is already finished and cannot be used to upload more data.");
        }
    }

    public R b() throws C2769f, C2773j {
        a();
        AbstractC3046a.b bVar = null;
        try {
            try {
                AbstractC3046a.b b = this.q.b();
                try {
                    if (b.d() != 200) {
                        if (b.d() == 409) {
                            throw c(p.c(this.d0, b, this.g0));
                        }
                        throw n.A(b);
                    }
                    R b2 = this.c0.b(b.b());
                    C3343c.b(b.b());
                    this.f0 = true;
                    return b2;
                } catch (ax.T4.k e) {
                    throw new C2768e(n.q(b), "Bad JSON in response: " + e, e);
                }
            } catch (IOException e2) {
                throw new t(e2);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                C3343c.b(bVar.b());
            }
            this.f0 = true;
            throw th;
        }
    }

    protected abstract X c(p pVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.e0) {
            return;
        }
        this.q.a();
        this.e0 = true;
    }

    public R d(InputStream inputStream) throws C2769f, C2773j, IOException {
        return f(inputStream, null);
    }

    public R e(InputStream inputStream, long j) throws C2769f, C2773j, IOException {
        return d(C3343c.f(inputStream, j));
    }

    public R f(InputStream inputStream, C3343c.d dVar) throws C2769f, C2773j, IOException {
        try {
            try {
                try {
                    this.q.d(dVar);
                    this.q.e(inputStream);
                    return b();
                } catch (IOException e) {
                    throw new t(e);
                }
            } catch (C3343c.e e2) {
                throw e2.getCause();
            }
        } finally {
            close();
        }
    }
}
