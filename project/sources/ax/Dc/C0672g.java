package ax.Dc;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ax.Dc.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C0672g extends InputStream implements ax.Kc.o, InputStreamRetargetInterface, AutoCloseable {
    private C0669d c0;
    private final int d0;
    private final int e0;
    private final int f0;
    private C0668c g0;
    private C0668c h0;
    private C0668c i0;
    private final C0671f j0 = new C0671f(32768);
    private long k0;
    private long l0;
    private final InputStream q;

    public C0672g(int i, int i2, InputStream inputStream) {
        if (i != 4096 && i != 8192) {
            throw new IllegalArgumentException("The dictionary size must be 4096 or 8192");
        }
        if (i2 != 2 && i2 != 3) {
            throw new IllegalArgumentException("The number of trees must be 2 or 3");
        }
        this.d0 = i;
        this.e0 = i2;
        this.f0 = i2;
        this.q = inputStream;
    }

    private void b() throws IOException {
        c();
        int o = this.c0.o();
        if (o == -1) {
            return;
        }
        if (o == 1) {
            C0668c c0668c = this.g0;
            int c = c0668c != null ? c0668c.c(this.c0) : this.c0.q();
            if (c == -1) {
                return;
            }
            this.j0.d(c);
            return;
        }
        int i = this.d0 == 4096 ? 6 : 7;
        int p = (int) this.c0.p(i);
        int c2 = this.i0.c(this.c0);
        if (c2 != -1 || p > 0) {
            int i2 = (c2 << i) | p;
            int c3 = this.h0.c(this.c0);
            if (c3 == 63) {
                long p2 = this.c0.p(8);
                if (p2 == -1) {
                    return;
                } else {
                    c3 = (int) (c3 + p2);
                }
            }
            this.j0.b(i2 + 1, c3 + this.f0);
        }
    }

    private void c() throws IOException {
        if (this.c0 == null) {
            ax.Kc.j jVar = new ax.Kc.j(new ax.Kc.i(this.q));
            try {
                if (this.e0 == 3) {
                    this.g0 = C0668c.b(jVar, 256);
                }
                this.h0 = C0668c.b(jVar, 64);
                this.i0 = C0668c.b(jVar, 64);
                this.l0 += jVar.c();
                jVar.close();
                this.c0 = new C0669d(this.q);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        jVar.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }

    @Override // ax.Kc.o
    public long a() {
        return this.c0.f() + this.l0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.q.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.j0.a()) {
            try {
                b();
            } catch (IllegalArgumentException e) {
                throw new IOException("bad IMPLODE stream", e);
            }
        }
        int c = this.j0.c();
        if (c > -1) {
            this.k0++;
        }
        return c;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
