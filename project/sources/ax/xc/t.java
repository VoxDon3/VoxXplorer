package ax.xc;

import java.io.OutputStream;

/* loaded from: classes3.dex */
final class t implements InterfaceC3482A, AutoCloseable {
    private final D c0;
    private final OutputStream q;

    public t(OutputStream outputStream, D d) {
        ax.Gb.l.f(outputStream, "out");
        ax.Gb.l.f(d, "timeout");
        this.q = outputStream;
        this.c0 = d;
    }

    @Override // ax.xc.InterfaceC3482A, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        this.q.close();
    }

    @Override // ax.xc.InterfaceC3482A, java.io.Flushable
    public void flush() {
        this.q.flush();
    }

    @Override // ax.xc.InterfaceC3482A
    public D timeout() {
        return this.c0;
    }

    public String toString() {
        return "sink(" + this.q + ')';
    }

    @Override // ax.xc.InterfaceC3482A
    public void write(C3487e c3487e, long j) {
        ax.Gb.l.f(c3487e, "source");
        C3484b.b(c3487e.size(), 0L, j);
        while (j > 0) {
            this.c0.throwIfReached();
            x xVar = c3487e.q;
            ax.Gb.l.c(xVar);
            int min = (int) Math.min(j, xVar.c - xVar.b);
            this.q.write(xVar.a, xVar.b, min);
            xVar.b += min;
            long j2 = min;
            j -= j2;
            c3487e.b1(c3487e.size() - j2);
            if (xVar.b == xVar.c) {
                c3487e.q = xVar.b();
                y.b(xVar);
            }
        }
    }
}
