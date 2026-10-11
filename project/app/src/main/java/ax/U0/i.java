/*
 * Decompiled with CFR 0.152.
 */
package ax.U0;

import ax.S0.a;
import ax.U0.g;
import ax.U0.k;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class i
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private final k c0;
    private final byte[] d0;
    private boolean e0 = false;
    private boolean f0 = false;
    private long g0;
    private final g q;

    public i(g g8, k k8) {
        this.q = g8;
        this.c0 = k8;
        this.d0 = new byte[1];
    }

    private void a() throws IOException {
        if (!this.e0) {
            this.q.f(this.c0);
            this.e0 = true;
        }
    }

    public void b() throws IOException {
        this.a();
    }

    @Override
    public void close() throws IOException {
        if (!this.f0) {
            this.q.close();
            this.f0 = true;
        }
    }

    @Override
    public int read() throws IOException {
        if (this.read(this.d0) == -1) {
            return -1;
        }
        return this.d0[0] & 0xFF;
    }

    @Override
    public int read(byte[] byArray) throws IOException {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        a.g(this.f0 ^ true);
        this.a();
        n8 = this.q.c(byArray, n8, n9);
        if (n8 == -1) {
            return -1;
        }
        this.g0 += (long)n8;
        return n8;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

