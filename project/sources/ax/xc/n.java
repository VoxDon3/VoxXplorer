package ax.xc;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes3.dex */
public final class n implements C, AutoCloseable {
    private final Inflater c0;
    private int d0;
    private boolean e0;
    private final g q;

    public n(g gVar, Inflater inflater) {
        ax.Gb.l.f(gVar, "source");
        ax.Gb.l.f(inflater, "inflater");
        this.q = gVar;
        this.c0 = inflater;
    }

    private final void c() {
        int i = this.d0;
        if (i == 0) {
            return;
        }
        int remaining = i - this.c0.getRemaining();
        this.d0 -= remaining;
        this.q.skip(remaining);
    }

    public final long a(C3487e c3487e, long j) throws IOException {
        ax.Gb.l.f(c3487e, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.e0) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        try {
            x e1 = c3487e.e1(1);
            int min = (int) Math.min(j, 8192 - e1.c);
            b();
            int inflate = this.c0.inflate(e1.a, e1.c, min);
            c();
            if (inflate > 0) {
                e1.c += inflate;
                long j2 = inflate;
                c3487e.b1(c3487e.size() + j2);
                return j2;
            }
            if (e1.b == e1.c) {
                c3487e.q = e1.b();
                y.b(e1);
            }
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    public final boolean b() throws IOException {
        if (!this.c0.needsInput()) {
            return false;
        }
        if (this.q.P()) {
            return true;
        }
        x xVar = this.q.k().q;
        ax.Gb.l.c(xVar);
        int i = xVar.c;
        int i2 = xVar.b;
        int i3 = i - i2;
        this.d0 = i3;
        this.c0.setInput(xVar.a, i2, i3);
        return false;
    }

    @Override // ax.xc.C, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.e0) {
            return;
        }
        this.c0.end();
        this.e0 = true;
        this.q.close();
    }

    @Override // ax.xc.C
    public long read(C3487e c3487e, long j) throws IOException {
        ax.Gb.l.f(c3487e, "sink");
        do {
            long a = a(c3487e, j);
            if (a > 0) {
                return a;
            }
            if (this.c0.finished() || this.c0.needsDictionary()) {
                return -1L;
            }
        } while (!this.q.P());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // ax.xc.C
    public D timeout() {
        return this.q.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(C c, Inflater inflater) {
        this(p.d(c), inflater);
        ax.Gb.l.f(c, "source");
        ax.Gb.l.f(inflater, "inflater");
    }
}
