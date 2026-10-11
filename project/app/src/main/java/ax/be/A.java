/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.P;
import ax.be.c;
import ax.be.s;
import ax.be.z;
import ax.ie.f;
import java.io.IOException;

class A
extends s {
    private s c0;
    private ax.ge.f d0;
    private f e0;
    private ax.he.c f0;
    private final int g0;
    private boolean h0 = true;
    private boolean i0 = true;
    private boolean j0 = true;
    private int k0 = 0;
    private boolean l0 = false;
    private IOException m0 = null;
    private final byte[] n0 = new byte[6];
    private final byte[] o0 = new byte[1];
    private final c q;

    A(s object, z z8, c c8) {
        object.getClass();
        this.q = c8;
        this.c0 = object;
        this.e0 = new f(65536, c8);
        int n8 = z8.i();
        int n9 = A.a(n8);
        this.f0 = object = ax.he.c.n(this.e0, z8.j(), z8.k(), z8.o(), z8.m(), n8, n9, z8.n(), z8.l(), z8.h(), c8);
        this.d0 = ((ax.he.c)object).o();
        object = z8.r();
        if (object != null && ((Object)object).length > 0) {
            this.d0.u(n8, (byte[])object);
            this.h0 = false;
        }
        this.g0 = (z8.o() * 5 + z8.k()) * 9 + z8.j();
    }

    private static int a(int n8) {
        if (65536 > n8) {
            return 65536 - n8;
        }
        return 0;
    }

    private void b() throws IOException {
        int n8;
        int n9 = this.e0.f();
        if (n9 + 2 < (n8 = this.f0.w())) {
            this.d(n8, n9);
        } else {
            this.f0.b();
            n8 = this.f0.w();
            this.e(n8);
        }
        this.k0 -= n8;
        this.f0.y();
        this.e0.l();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c() throws IOException {
        IOException iOException = this.m0;
        if (iOException != null) {
            throw iOException;
        }
        this.d0.s();
        try {
            while (true) {
                if (this.k0 <= 0) {
                    this.c0.write(0);
                    this.l0 = true;
                    this.f0.x(this.q);
                    this.f0 = null;
                    this.d0 = null;
                    this.e0.o(this.q);
                    this.e0 = null;
                    return;
                }
                this.f0.e();
                this.b();
            }
        }
        catch (IOException iOException2) {}
        this.m0 = iOException2;
        throw iOException2;
    }

    private void d(int n8, int n9) throws IOException {
        boolean bl = this.j0;
        int n10 = bl ? (this.h0 ? 224 : 192) : (this.i0 ? 160 : 128);
        byte[] byArray = this.n0;
        byArray[0] = (byte)(n10 | --n8 >>> 16);
        byArray[1] = (byte)(n8 >>> 8);
        byArray[2] = (byte)n8;
        n8 = n9 - 1;
        byArray[3] = (byte)(n8 >>> 8);
        byArray[4] = (byte)n8;
        if (bl) {
            byArray[5] = (byte)this.g0;
            this.c0.write(byArray, 0, 6);
        } else {
            this.c0.write(byArray, 0, 5);
        }
        this.e0.p(this.c0);
        this.j0 = false;
        this.i0 = false;
        this.h0 = false;
    }

    private void e(int n8) throws IOException {
        while (n8 > 0) {
            int n9 = Math.min(n8, 65536);
            byte[] byArray = this.n0;
            int n10 = this.h0 ? 1 : 2;
            byArray[0] = (byte)n10;
            n10 = n9 - 1;
            byArray[1] = (byte)(n10 >>> 8);
            byArray[2] = (byte)n10;
            this.c0.write(byArray, 0, 3);
            this.d0.a(this.c0, n8, n9);
            n8 -= n9;
            this.h0 = false;
        }
        this.i0 = true;
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
                if (!this.l0) {
                    try {
                        this.c();
                    }
                    catch (IOException iOException2) {}
                }
                try {
                    this.c0.close();
                }
                catch (IOException iOException3) {
                    if (this.m0 != null) break block7;
                    this.m0 = iOException3;
                }
            }
            this.c0 = null;
        }
        if ((iOException = this.m0) == null) {
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
        IOException iOException = this.m0;
        if (iOException != null) {
            throw iOException;
        }
        if (this.l0) {
            throw new P("Stream finished or closed");
        }
        try {
            this.d0.t();
            while (true) {
                if (this.k0 <= 0) {
                    this.c0.flush();
                    return;
                }
                this.f0.e();
                this.b();
            }
        }
        catch (IOException iOException2) {}
        this.m0 = iOException2;
        throw iOException2;
    }

    @Override
    public void write(int n8) throws IOException {
        byte[] byArray = this.o0;
        byArray[0] = (byte)n8;
        this.write(byArray, 0, 1);
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        int n10;
        if (n8 >= 0 && n9 >= 0 && (n10 = n8 + n9) >= 0 && n10 <= byArray.length) {
            IOException iOException = this.m0;
            if (iOException == null) {
                if (!this.l0) {
                    while (n9 > 0) {
                        int n11;
                        int n12;
                        try {
                            n12 = this.d0.b(byArray, n8, n9);
                            n11 = n8 + n12;
                            n10 = n9 - n12;
                        }
                        catch (IOException iOException2) {
                            this.m0 = iOException2;
                            throw iOException2;
                        }
                        this.k0 += n12;
                        n8 = n11;
                        n9 = n10;
                        if (!this.f0.e()) continue;
                        this.b();
                        n8 = n11;
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

