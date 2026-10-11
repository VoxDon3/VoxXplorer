package ax.xc;

import java.io.IOException;
import java.util.zip.Deflater;

/* loaded from: classes3.dex */
public final class i implements InterfaceC3482A, AutoCloseable {
    private final Deflater c0;
    private boolean d0;
    private final InterfaceC3488f q;

    public i(InterfaceC3488f interfaceC3488f, Deflater deflater) {
        ax.Gb.l.f(interfaceC3488f, "sink");
        ax.Gb.l.f(deflater, "deflater");
        this.q = interfaceC3488f;
        this.c0 = deflater;
    }

    private final void a(boolean z) {
        x e1;
        int deflate;
        C3487e k = this.q.k();
        while (true) {
            e1 = k.e1(1);
            if (z) {
                try {
                    Deflater deflater = this.c0;
                    byte[] bArr = e1.a;
                    int i = e1.c;
                    deflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                Deflater deflater2 = this.c0;
                byte[] bArr2 = e1.a;
                int i2 = e1.c;
                deflate = deflater2.deflate(bArr2, i2, 8192 - i2);
            }
            if (deflate > 0) {
                e1.c += deflate;
                k.b1(k.size() + deflate);
                this.q.R();
            } else if (this.c0.needsInput()) {
                break;
            }
        }
        if (e1.b == e1.c) {
            k.q = e1.b();
            y.b(e1);
        }
    }

    public final void b() {
        this.c0.finish();
        a(false);
    }

    @Override // ax.xc.InterfaceC3482A, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
        if (this.d0) {
            return;
        }
        try {
            b();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.c0.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.q.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.d0 = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // ax.xc.InterfaceC3482A, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.q.flush();
    }

    @Override // ax.xc.InterfaceC3482A
    public D timeout() {
        return this.q.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.q + ')';
    }

    @Override // ax.xc.InterfaceC3482A
    public void write(C3487e c3487e, long j) throws IOException {
        ax.Gb.l.f(c3487e, "source");
        C3484b.b(c3487e.size(), 0L, j);
        while (j > 0) {
            x xVar = c3487e.q;
            ax.Gb.l.c(xVar);
            int min = (int) Math.min(j, xVar.c - xVar.b);
            this.c0.setInput(xVar.a, xVar.b, min);
            a(false);
            long j2 = min;
            c3487e.b1(c3487e.size() - j2);
            int i = xVar.b + min;
            xVar.b = i;
            if (i == xVar.c) {
                c3487e.q = xVar.b();
                y.b(xVar);
            }
            j -= j2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(InterfaceC3482A interfaceC3482A, Deflater deflater) {
        this(p.c(interfaceC3482A), deflater);
        ax.Gb.l.f(interfaceC3482A, "sink");
        ax.Gb.l.f(deflater, "deflater");
    }
}
