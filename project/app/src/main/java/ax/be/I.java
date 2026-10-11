/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.L;
import ax.be.P;
import ax.be.s;
import ax.je.f;
import java.io.IOException;

class I
extends s {
    private final f c0;
    private final byte[] d0 = new byte[4096];
    private int e0 = 0;
    private int f0 = 0;
    private IOException g0 = null;
    private boolean h0 = false;
    private final byte[] i0 = new byte[1];
    private s q;

    I(s s8, f f8) {
        s8.getClass();
        this.q = s8;
        this.c0 = f8;
    }

    private void a() throws IOException {
        IOException iOException = this.g0;
        if (iOException == null) {
            try {
                this.q.write(this.d0, this.e0, this.f0);
                this.h0 = true;
                return;
            }
            catch (IOException iOException2) {
                this.g0 = iOException2;
                throw iOException2;
            }
        }
        throw iOException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws IOException {
        IOException iOException;
        if (this.q != null) {
            block7: {
                if (!this.h0) {
                    try {
                        this.a();
                    }
                    catch (IOException iOException2) {}
                }
                try {
                    this.q.close();
                }
                catch (IOException iOException3) {
                    if (this.g0 != null) break block7;
                    this.g0 = iOException3;
                }
            }
            this.q = null;
        }
        if ((iOException = this.g0) == null) {
            return;
        }
        throw iOException;
    }

    @Override
    public void flush() throws IOException {
        throw new L("Flushing is not supported");
    }

    @Override
    public void write(int n8) throws IOException {
        byte[] byArray = this.i0;
        byArray[0] = (byte)n8;
        this.write(byArray, 0, 1);
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        int n10;
        if (n8 >= 0 && n9 >= 0 && (n10 = n8 + n9) >= 0 && n10 <= byArray.length) {
            Object object = this.g0;
            if (object == null) {
                if (!this.h0) {
                    while (n9 > 0) {
                        int n11;
                        int n12 = Math.min(n9, 4096 - (this.e0 + this.f0));
                        System.arraycopy(byArray, n8, this.d0, this.e0 + this.f0, n12);
                        n10 = n8 + n12;
                        int n13 = n9 - n12;
                        this.f0 = n8 = this.f0 + n12;
                        n8 = this.c0.a(this.d0, this.e0, n8);
                        this.f0 -= n8;
                        try {
                            this.q.write(this.d0, this.e0, n8);
                            this.e0 = n12 = this.e0 + n8;
                            n11 = this.f0;
                            n8 = n10;
                            n9 = n13;
                            if (n12 + n11 != 4096) continue;
                        }
                        catch (IOException iOException) {
                            this.g0 = iOException;
                            throw iOException;
                        }
                        object = this.d0;
                        System.arraycopy(object, n12, object, 0, n11);
                        this.e0 = 0;
                        n8 = n10;
                        n9 = n13;
                    }
                    return;
                }
                throw new P("Stream finished or closed");
            }
            throw object;
        }
        throw new IndexOutOfBoundsException();
    }
}

