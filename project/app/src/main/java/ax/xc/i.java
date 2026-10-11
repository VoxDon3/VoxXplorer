/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.l;
import ax.xc.A;
import ax.xc.D;
import ax.xc.b;
import ax.xc.e;
import ax.xc.f;
import ax.xc.p;
import ax.xc.x;
import ax.xc.y;
import java.io.IOException;
import java.util.zip.Deflater;

public final class i
implements A,
AutoCloseable {
    private final Deflater c0;
    private boolean d0;
    private final f q;

    public i(A a8, Deflater deflater) {
        l.f(a8, "sink");
        l.f(deflater, "deflater");
        this(p.c(a8), deflater);
    }

    public i(f f8, Deflater deflater) {
        l.f(f8, "sink");
        l.f(deflater, "deflater");
        this.q = f8;
        this.c0 = deflater;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void a(boolean bl) {
        x x8;
        e e8 = this.q.k();
        while (true) {
            int n8;
            Object object;
            Object object2;
            x8 = e8.e1(1);
            if (bl) {
                try {
                    object2 = this.c0;
                    object = x8.a;
                    n8 = x8.c;
                    n8 = ((Deflater)object2).deflate((byte[])object, n8, 8192 - n8, 2);
                }
                catch (NullPointerException nullPointerException) {
                    throw new IOException("Deflater already closed", nullPointerException);
                }
            } else {
                object = this.c0;
                object2 = x8.a;
                n8 = x8.c;
                n8 = ((Deflater)object).deflate((byte[])object2, n8, 8192 - n8);
            }
            if (n8 > 0) {
                x8.c += n8;
                e8.b1(e8.size() + (long)n8);
                this.q.R();
                continue;
            }
            if (this.c0.needsInput()) break;
        }
        if (x8.b != x8.c) return;
        e8.q = x8.b();
        y.b(x8);
    }

    public final void b() {
        this.c0.finish();
        this.a(false);
    }

    @Override
    public void close() throws IOException {
        Throwable throwable;
        block11: {
            block10: {
                block9: {
                    Throwable throwable2;
                    block8: {
                        if (this.d0) break block10;
                        try {
                            this.b();
                            throwable = null;
                        }
                        catch (Throwable throwable3) {
                            // empty catch block
                        }
                        try {
                            this.c0.end();
                            throwable2 = throwable;
                        }
                        catch (Throwable throwable4) {
                            throwable2 = throwable;
                            if (throwable != null) break block8;
                            throwable2 = throwable4;
                        }
                    }
                    try {
                        this.q.close();
                        throwable = throwable2;
                    }
                    catch (Throwable throwable5) {
                        throwable = throwable2;
                        if (throwable2 != null) break block9;
                        throwable = throwable5;
                    }
                }
                this.d0 = true;
                if (throwable != null) break block11;
            }
            return;
        }
        throw throwable;
    }

    @Override
    public void flush() throws IOException {
        this.a(true);
        this.q.flush();
    }

    @Override
    public D timeout() {
        return this.q.timeout();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DeflaterSink(");
        stringBuilder.append(this.q);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    @Override
    public void write(e e8, long l8) throws IOException {
        l.f(e8, "source");
        b.b(e8.size(), 0L, l8);
        while (l8 > 0L) {
            x x8 = e8.q;
            l.c(x8);
            int n8 = (int)Math.min(l8, (long)(x8.c - x8.b));
            this.c0.setInput(x8.a, x8.b, n8);
            this.a(false);
            long l9 = e8.size();
            long l10 = n8;
            e8.b1(l9 - l10);
            x8.b = n8 = x8.b + n8;
            if (n8 == x8.c) {
                e8.q = x8.b();
                y.b(x8);
            }
            l8 -= l10;
        }
    }
}

