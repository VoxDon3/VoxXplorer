/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.a0;
import ax.pb.b0;
import ax.pb.d;
import ax.pb.d0;
import ax.pb.g0;
import ax.qb.e;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

class F0
extends d0 {
    private byte[] h0 = new byte[4096];
    private int i0;
    private int j0;
    private int k0;
    private boolean l0;
    Object m0;

    F0(g0 g02) throws a0, MalformedURLException, UnknownHostException {
        super(g02, g02.G0 & 0xFFFF00FF | 0x20);
        boolean bl = (g02.G0 & 0x600) != 1536;
        this.l0 = bl;
        this.m0 = new Object();
    }

    @Override
    public int available() throws IOException {
        d d8 = b0.D0;
        if (e.c0 >= 3) {
            b0.A0.println("Named Pipe available() does not apply to TRANSACT Named Pipes");
        }
        return 0;
    }

    int c(byte[] byArray, int n8, int n9) {
        byte[] byArray2;
        int n10;
        byte[] byArray3 = this.h0;
        int n11 = byArray3.length;
        int n12 = this.k0;
        if (n9 > n11 - n12) {
            n11 = n10 = byArray3.length * 2;
            if (n9 > n10 - n12) {
                n11 = n9 + n12;
            }
            this.h0 = byArray2 = new byte[n11];
            n10 = byArray3.length;
            n11 = this.i0;
            if (n12 > (n10 -= n11)) {
                System.arraycopy(byArray3, n11, byArray2, 0, n10);
                System.arraycopy(byArray3, 0, this.h0, n10, this.k0 - n10);
            } else {
                System.arraycopy(byArray3, n11, byArray2, 0, n12);
            }
            this.i0 = 0;
            this.j0 = this.k0;
        }
        byArray2 = this.h0;
        n10 = byArray2.length;
        n11 = this.j0;
        if (n9 > (n10 -= n11)) {
            System.arraycopy(byArray, n8, byArray2, n11, n10);
            System.arraycopy(byArray, n8 + n10, this.h0, 0, n9 - n10);
        } else {
            System.arraycopy(byArray, n8, byArray2, n11, n9);
        }
        this.j0 = (this.j0 + n9) % this.h0.length;
        this.k0 += n9;
        return n9;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int read() throws IOException {
        Object object = this.m0;
        synchronized (object) {
            Throwable throwable2;
            block8: {
                InterruptedException interruptedException2;
                block7: {
                    int n8;
                    byte[] byArray;
                    try {
                        try {
                            while (this.k0 == 0) {
                                this.m0.wait();
                            }
                        }
                        catch (InterruptedException interruptedException2) {
                            break block7;
                        }
                        byArray = this.h0;
                        n8 = this.i0;
                    }
                    catch (Throwable throwable2) {}
                    byte by = byArray[n8];
                    this.i0 = (n8 + 1) % byArray.length;
                    return by & 0xFF;
                    break block8;
                }
                IOException iOException = new IOException(interruptedException2.getMessage());
                throw iOException;
            }
            throw throwable2;
        }
    }

    @Override
    public int read(byte[] byArray) throws IOException {
        return this.read(byArray, 0, byArray.length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int read(byte[] object, int n8, int n9) throws IOException {
        if (n9 <= 0) {
            return 0;
        }
        Object object2 = this.m0;
        synchronized (object2) {
            Throwable throwable22;
            block12: {
                InterruptedException interruptedException22;
                block9: {
                    int n11;
                    block11: {
                        int n12;
                        byte[] byArray;
                        block10: {
                            try {
                                int n10;
                                try {
                                    while ((n10 = this.k0) == 0) {
                                        this.m0.wait();
                                    }
                                }
                                catch (InterruptedException interruptedException22) {
                                    break block9;
                                }
                                byArray = this.h0;
                                n11 = byArray.length;
                                n12 = this.i0;
                                int n13 = n11 - n12;
                                n11 = n9;
                                if (n9 > n10) {
                                    n11 = n10;
                                }
                                if (n10 <= n13 || n11 <= n13) break block10;
                                System.arraycopy(byArray, n12, object, n8, n13);
                                System.arraycopy(this.h0, 0, object, n8 + n13, n11 - n13);
                                break block11;
                            }
                            catch (Throwable throwable22) {
                                break block12;
                            }
                        }
                        System.arraycopy(byArray, n12, object, n8, n11);
                    }
                    this.k0 -= n11;
                    this.i0 = (this.i0 + n11) % this.h0.length;
                    return n11;
                }
                object = new IOException(interruptedException22.getMessage());
                throw object;
            }
            throw throwable22;
        }
    }
}

