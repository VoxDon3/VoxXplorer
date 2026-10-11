/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.P;
import ax.be.c;
import ax.be.s;
import java.io.DataOutputStream;
import java.io.IOException;

class K
extends s {
    private s c0;
    private final DataOutputStream d0;
    private final byte[] e0;
    private int f0 = 0;
    private boolean g0 = true;
    private boolean h0 = false;
    private IOException i0 = null;
    private final byte[] j0 = new byte[1];
    private final c q;

    K(s s8, c c8) {
        s8.getClass();
        this.c0 = s8;
        this.d0 = new DataOutputStream(s8);
        this.q = c8;
        this.e0 = c8.a(65536, false);
    }

    private void a() throws IOException {
        DataOutputStream dataOutputStream = this.d0;
        int n8 = this.g0 ? 1 : 2;
        dataOutputStream.writeByte(n8);
        this.d0.writeShort(this.f0 - 1);
        this.d0.write(this.e0, 0, this.f0);
        this.f0 = 0;
        this.g0 = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void b() throws IOException {
        IOException iOException3;
        block5: {
            block4: {
                IOException iOException2 = this.i0;
                if (iOException2 != null) {
                    throw iOException2;
                }
                if (this.h0) {
                    throw new P("Stream finished or closed");
                }
                try {
                    if (this.f0 <= 0) break block4;
                    this.a();
                }
                catch (IOException iOException3) {
                    break block5;
                }
            }
            this.c0.write(0);
            this.h0 = true;
            this.q.d(this.e0);
            return;
        }
        this.i0 = iOException3;
        throw iOException3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws IOException {
        IOException iOException;
        if (this.c0 != null) {
            block7: {
                if (!this.h0) {
                    try {
                        this.b();
                    }
                    catch (IOException iOException2) {}
                }
                try {
                    this.c0.close();
                }
                catch (IOException iOException3) {
                    if (this.i0 != null) break block7;
                    this.i0 = iOException3;
                }
            }
            this.c0 = null;
        }
        if ((iOException = this.i0) == null) {
            return;
        }
        throw iOException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void flush() throws IOException {
        IOException iOException3;
        block5: {
            block4: {
                IOException iOException2 = this.i0;
                if (iOException2 != null) {
                    throw iOException2;
                }
                if (this.h0) {
                    throw new P("Stream finished or closed");
                }
                try {
                    if (this.f0 <= 0) break block4;
                    this.a();
                }
                catch (IOException iOException3) {
                    break block5;
                }
            }
            this.c0.flush();
            return;
        }
        this.i0 = iOException3;
        throw iOException3;
    }

    @Override
    public void write(int n8) throws IOException {
        byte[] byArray = this.j0;
        byArray[0] = (byte)n8;
        this.write(byArray, 0, 1);
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        int n10;
        if (n8 >= 0 && n9 >= 0 && (n10 = n8 + n9) >= 0 && n10 <= byArray.length) {
            IOException iOException = this.i0;
            if (iOException == null) {
                if (!this.h0) {
                    while (n9 > 0) {
                        int n11;
                        try {
                            n11 = Math.min(65536 - this.f0, n9);
                            System.arraycopy(byArray, n8, this.e0, this.f0, n11);
                            n10 = n9 - n11;
                        }
                        catch (IOException iOException2) {
                            this.i0 = iOException2;
                            throw iOException2;
                        }
                        this.f0 = n11 = this.f0 + n11;
                        n9 = n10;
                        if (n11 != 65536) continue;
                        this.a();
                        n9 = n10;
                    }
                    return;
                }
                throw new P("Stream finished or closed");
            }
            throw iOException;
        }
        throw new IndexOutOfBoundsException();
    }
}

