/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.P;
import ax.je.f;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class H
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private final f c0;
    private final byte[] d0 = new byte[4096];
    private int e0 = 0;
    private int f0 = 0;
    private int g0 = 0;
    private boolean h0 = false;
    private IOException i0 = null;
    private final byte[] j0 = new byte[1];
    private InputStream q;

    H(InputStream inputStream, f f8) {
        inputStream.getClass();
        this.q = inputStream;
        this.c0 = f8;
    }

    static int a() {
        return 5;
    }

    @Override
    public int available() throws IOException {
        if (this.q != null) {
            IOException iOException = this.i0;
            if (iOException == null) {
                return this.f0;
            }
            throw iOException;
        }
        throw new P("Stream closed");
    }

    @Override
    public void close() throws IOException {
        InputStream inputStream = this.q;
        if (inputStream != null) {
            try {
                inputStream.close();
                return;
            }
            finally {
                this.q = null;
            }
        }
    }

    @Override
    public int read() throws IOException {
        if (this.read(this.j0, 0, 1) == -1) {
            return -1;
        }
        return this.j0[0] & 0xFF;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        int n10;
        if (n8 >= 0 && n9 >= 0 && (n10 = n8 + n9) >= 0 && n10 <= byArray.length) {
            IOException iOException2;
            block11: {
                if (n9 == 0) {
                    return 0;
                }
                if (this.q == null) {
                    throw new P("Stream closed");
                }
                Object object = this.i0;
                if (object != null) {
                    throw object;
                }
                int n11 = 0;
                n10 = n8;
                n8 = n11;
                while (true) {
                    int n12;
                    int n13;
                    try {
                        n13 = Math.min(this.f0, n9);
                        System.arraycopy(this.d0, this.e0, byArray, n10, n13);
                        this.e0 = n12 = this.e0 + n13;
                        this.f0 = n11 = this.f0 - n13;
                        n10 += n13;
                        n9 -= n13;
                        n8 += n13;
                    }
                    catch (IOException iOException2) {
                        break block11;
                    }
                    n13 = this.g0;
                    if (n12 + n11 + n13 == 4096) {
                        object = this.d0;
                        System.arraycopy(object, n12, object, 0, n11 + n13);
                        this.e0 = 0;
                    }
                    if (n9 == 0 || this.h0) break;
                    n11 = this.e0;
                    n12 = this.f0;
                    n13 = this.g0;
                    if ((n11 = this.q.read(this.d0, n11 + n12 + n13, 4096 - (n11 + n12 + n13))) == -1) {
                        this.h0 = true;
                        this.f0 = this.g0;
                        this.g0 = 0;
                        continue;
                    }
                    this.g0 = n11 = this.g0 + n11;
                    this.f0 = n11 = this.c0.a(this.d0, this.e0, n11);
                    this.g0 -= n11;
                }
                if (n8 > 0) {
                    return n8;
                }
                return -1;
            }
            this.i0 = iOException2;
            throw iOException2;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

