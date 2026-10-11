/*
 * Decompiled with CFR 0.152.
 */
package ax.d5;

import ax.d5.a;
import java.io.IOException;
import java.io.OutputStream;

public class b
extends OutputStream
implements AutoCloseable {
    private a q;

    public b() {
    }

    public b(a a8) throws IOException {
        this.a(a8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(a object) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                if (object != null) {
                    try {
                        if (this.q == null && !((a)object).d0) {
                            this.q = object;
                            ((a)object).h0 = -1;
                            ((a)object).i0 = 0;
                            ((a)object).d0 = true;
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    object = new IOException("Already connected");
                    throw object;
                }
                object = new NullPointerException();
                throw object;
            }
            throw throwable2;
        }
    }

    @Override
    public void close() throws IOException {
        a a8 = this.q;
        if (a8 != null) {
            a8.g();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void flush() throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block7: {
                    try {
                        a a8 = this.q;
                        if (a8 == null) break block7;
                        synchronized (a8) {
                            this.q.notifyAll();
                        }
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public void write(int n8) throws IOException {
        a a8 = this.q;
        if (a8 != null) {
            a8.e(n8);
            return;
        }
        throw new IOException("Pipe not connected");
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        if (this.q != null) {
            int n10;
            byArray.getClass();
            if (n8 >= 0 && n8 <= byArray.length && n9 >= 0 && (n10 = n8 + n9) <= byArray.length && n10 >= 0) {
                if (n9 == 0) {
                    return;
                }
                this.q.f(byArray, n8, n9);
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IOException("Pipe not connected");
    }
}

