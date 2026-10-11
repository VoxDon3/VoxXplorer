package ax.xc;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
class o implements C, AutoCloseable {
    private final D c0;
    private final InputStream q;

    public o(InputStream inputStream, D d) {
        ax.Gb.l.f(inputStream, "input");
        ax.Gb.l.f(d, "timeout");
        this.q = inputStream;
        this.c0 = d;
    }

    @Override // ax.xc.C, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.q.close();
    }

    @Override // ax.xc.C
    public long read(C3487e c3487e, long j) {
        ax.Gb.l.f(c3487e, "sink");
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        try {
            this.c0.throwIfReached();
            x e1 = c3487e.e1(1);
            int read = this.q.read(e1.a, e1.c, (int) Math.min(j, 8192 - e1.c));
            if (read != -1) {
                e1.c += read;
                long j2 = read;
                c3487e.b1(c3487e.size() + j2);
                return j2;
            }
            if (e1.b != e1.c) {
                return -1L;
            }
            c3487e.q = e1.b();
            y.b(e1);
            return -1L;
        } catch (AssertionError e) {
            if (p.e(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // ax.xc.C
    public D timeout() {
        return this.c0;
    }

    public String toString() {
        return "source(" + this.q + ')';
    }
}
