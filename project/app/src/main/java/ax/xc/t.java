/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.l;
import ax.xc.A;
import ax.xc.D;
import ax.xc.b;
import ax.xc.e;
import ax.xc.x;
import ax.xc.y;
import java.io.OutputStream;

final class t
implements A,
AutoCloseable {
    private final D c0;
    private final OutputStream q;

    public t(OutputStream outputStream, D d8) {
        l.f(outputStream, "out");
        l.f(d8, "timeout");
        this.q = outputStream;
        this.c0 = d8;
    }

    @Override
    public void close() {
        this.q.close();
    }

    @Override
    public void flush() {
        this.q.flush();
    }

    @Override
    public D timeout() {
        return this.c0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sink(");
        stringBuilder.append(this.q);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    @Override
    public void write(e e8, long l8) {
        l.f(e8, "source");
        b.b(e8.size(), 0L, l8);
        while (l8 > 0L) {
            this.c0.throwIfReached();
            x x8 = e8.q;
            l.c(x8);
            int n8 = (int)Math.min(l8, (long)(x8.c - x8.b));
            this.q.write(x8.a, x8.b, n8);
            x8.b += n8;
            long l9 = n8;
            long l10 = l8 - l9;
            e8.b1(e8.size() - l9);
            l8 = l10;
            if (x8.b != x8.c) continue;
            e8.q = x8.b();
            y.b(x8);
            l8 = l10;
        }
    }
}

