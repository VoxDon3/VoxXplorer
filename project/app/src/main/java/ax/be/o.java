/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.P;
import ax.be.n;
import ax.be.s;
import ax.ee.c;
import java.io.IOException;
import java.io.OutputStream;

class o
extends s {
    private final c c0;
    private final byte[] d0 = new byte[4096];
    private boolean e0 = false;
    private IOException f0 = null;
    private final byte[] g0 = new byte[1];
    private s q;

    o(s s8, n n8) {
        this.q = s8;
        this.c0 = new c(n8.h());
    }

    @Override
    public void close() throws IOException {
        Object object = this.q;
        if (object != null) {
            block4: {
                try {
                    ((OutputStream)object).close();
                }
                catch (IOException iOException) {
                    if (this.f0 != null) break block4;
                    this.f0 = iOException;
                }
            }
            this.q = null;
        }
        if ((object = this.f0) == null) {
            return;
        }
        throw object;
    }

    @Override
    public void flush() throws IOException {
        IOException iOException = this.f0;
        if (iOException == null) {
            if (!this.e0) {
                try {
                    this.q.flush();
                    return;
                }
                catch (IOException iOException2) {
                    this.f0 = iOException2;
                    throw iOException2;
                }
            }
            throw new P("Stream finished or closed");
        }
        throw iOException;
    }

    @Override
    public void write(int n8) throws IOException {
        byte[] byArray = this.g0;
        byArray[0] = (byte)n8;
        this.write(byArray, 0, 1);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        int n10;
        if (n8 >= 0 && n9 >= 0 && (n10 = n8 + n9) >= 0 && n10 <= byArray.length) {
            IOException iOException3;
            block7: {
                IOException iOException2 = this.f0;
                if (iOException2 != null) {
                    throw iOException2;
                }
                if (this.e0) {
                    throw new P("Stream finished");
                }
                while (n9 > 4096) {
                    try {
                        this.c0.a(byArray, n8, 4096, this.d0);
                        this.q.write(this.d0);
                        n8 += 4096;
                        n9 -= 4096;
                    }
                    catch (IOException iOException3) {
                        break block7;
                    }
                }
                {
                    this.c0.a(byArray, n8, n9, this.d0);
                    this.q.write(this.d0, 0, n9);
                    return;
                }
            }
            this.f0 = iOException3;
            throw iOException3;
        }
        throw new IndexOutOfBoundsException();
    }
}

