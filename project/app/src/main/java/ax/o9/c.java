/*
 * Decompiled with CFR 0.152.
 */
package ax.o9;

import ax.Z8.a;
import ax.k9.d;
import java.io.Closeable;
import java.io.IOException;

public abstract class c
implements Closeable,
AutoCloseable {
    protected int c0 = 65536;
    private int d0;
    protected long q;

    public abstract int a();

    protected abstract int b(byte[] var1) throws IOException;

    public int c() {
        return this.d0;
    }

    @Override
    public void close() throws IOException {
    }

    public long d() {
        return this.q;
    }

    public abstract boolean e();

    public abstract void f(int var1);

    public void g(a<?> a8) {
        this.d0 = 0;
        byte[] byArray = new byte[this.c0];
        try {
            int n8 = this.b(byArray);
            a8.p(byArray, 0, n8);
            this.q += (long)n8;
            this.d0 += n8;
            return;
        }
        catch (IOException iOException) {
            throw new d(iOException);
        }
    }

    public void j(a<?> a8, int n8) {
        this.d0 = 0;
        byte[] byArray = new byte[this.c0];
        for (int i8 = 0; i8 < n8; ++i8) {
            try {
                int n9 = this.b(byArray);
                a8.p(byArray, 0, n9);
                this.q += (long)n9;
                this.d0 += n9;
                continue;
            }
            catch (IOException iOException) {
                throw new d(iOException);
            }
        }
    }
}

