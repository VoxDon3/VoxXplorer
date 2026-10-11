/*
 * Decompiled with CFR 0.152.
 */
package ax.qc;

import ax.qc.g;
import ax.rc.f;
import ax.sc.c;
import ax.tc.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

abstract class b<T extends ax.lc.c>
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private T c0;
    private byte[] d0;
    private byte[] e0 = new byte[1];
    private f f0;
    private g q;

    public b(g g8, f f8, char[] cArray, int n8, boolean bl) throws IOException {
        this.q = g8;
        this.c0 = this.e(f8, cArray, bl);
        this.f0 = f8;
        if (((Object)((Object)e.d(f8))).equals((Object)c.d0)) {
            this.d0 = new byte[n8];
        }
    }

    private void a(byte[] byArray, int n8) {
        byte[] byArray2 = this.d0;
        if (byArray2 != null) {
            System.arraycopy(byArray, 0, byArray2, 0, n8);
        }
    }

    protected void b(InputStream inputStream, int n8) throws IOException {
    }

    public T c() {
        return this.c0;
    }

    @Override
    public void close() throws IOException {
        this.q.close();
    }

    public byte[] d() {
        return this.d0;
    }

    protected abstract T e(f var1, char[] var2, boolean var3) throws IOException;

    protected int f(byte[] byArray) throws IOException {
        return this.q.a(byArray);
    }

    @Override
    public int read() throws IOException {
        if (this.read(this.e0) == -1) {
            return -1;
        }
        return this.e0[0] & 0xFF;
    }

    @Override
    public int read(byte[] byArray) throws IOException {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        if ((n9 = e.f(this.q, byArray, n8, n9)) > 0) {
            this.a(byArray, n9);
            this.c0.a(byArray, n8, n9);
        }
        return n9;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

