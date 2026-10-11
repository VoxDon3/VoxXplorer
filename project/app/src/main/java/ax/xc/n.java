/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.l;
import ax.xc.C;
import ax.xc.D;
import ax.xc.e;
import ax.xc.g;
import ax.xc.p;
import ax.xc.x;
import ax.xc.y;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class n
implements C,
AutoCloseable {
    private final Inflater c0;
    private int d0;
    private boolean e0;
    private final g q;

    public n(C c8, Inflater inflater) {
        l.f(c8, "source");
        l.f(inflater, "inflater");
        this(p.d(c8), inflater);
    }

    public n(g g8, Inflater inflater) {
        l.f(g8, "source");
        l.f(inflater, "inflater");
        this.q = g8;
        this.c0 = inflater;
    }

    private final void c() {
        int n8 = this.d0;
        if (n8 == 0) {
            return;
        }
        this.d0 -= (n8 -= this.c0.getRemaining());
        this.q.skip(n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a(e object, long l8) throws IOException {
        x x8;
        l.f(object, "sink");
        long l9 = l8 - 0L;
        long l10 = l9 == 0L ? 0 : (l9 < 0L ? -1 : 1);
        if (l10 < 0) {
            object = new StringBuilder();
            ((StringBuilder)object).append("byteCount < 0: ");
            ((StringBuilder)object).append(l8);
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }
        if (this.e0) throw new IllegalStateException("closed");
        if (l10 == false) {
            return 0L;
        }
        try {
            x8 = ((e)object).e1(1);
            l10 = (int)Math.min(l8, (long)(8192 - x8.c));
            this.b();
            l10 = this.c0.inflate(x8.a, x8.c, (int)l10);
            this.c();
            if (l10 > 0) {
                x8.c += l10;
                long l11 = ((e)object).size();
                l8 = l10;
                ((e)object).b1(l11 + l8);
                return l8;
            }
        }
        catch (DataFormatException dataFormatException) {
            throw new IOException(dataFormatException);
        }
        if (x8.b != x8.c) return 0L;
        ((e)object).q = x8.b();
        y.b(x8);
        return 0L;
    }

    public final boolean b() throws IOException {
        if (!this.c0.needsInput()) {
            return false;
        }
        if (this.q.P()) {
            return true;
        }
        x x8 = this.q.k().q;
        l.c(x8);
        int n8 = x8.c;
        int n9 = x8.b;
        this.d0 = n8 -= n9;
        this.c0.setInput(x8.a, n9, n8);
        return false;
    }

    @Override
    public void close() throws IOException {
        if (this.e0) {
            return;
        }
        this.c0.end();
        this.e0 = true;
        this.q.close();
    }

    @Override
    public long read(e e8, long l8) throws IOException {
        block2: {
            l.f(e8, "sink");
            do {
                long l9;
                if ((l9 = this.a(e8, l8)) > 0L) {
                    return l9;
                }
                if (this.c0.finished() || this.c0.needsDictionary()) break block2;
            } while (!this.q.P());
            throw new EOFException("source exhausted prematurely");
        }
        return -1L;
    }

    @Override
    public D timeout() {
        return this.q.timeout();
    }
}

