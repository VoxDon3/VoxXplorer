/*
 * Decompiled with CFR 0.152.
 */
package ax.qc;

import ax.qc.b;
import ax.qc.g;
import ax.rc.f;
import ax.tc.e;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

class a
extends b<ax.lc.a> {
    private byte[] g0 = new byte[1];
    private byte[] h0 = new byte[16];
    private int i0 = 0;
    private int j0 = 0;
    private int k0 = 0;
    private int l0 = 0;
    private int m0 = 0;
    private int n0 = 0;
    private int o0 = 0;

    public a(g g8, f f8, char[] cArray, int n8, boolean bl) throws IOException {
        super(g8, f8, cArray, n8, bl);
    }

    private void g(byte[] byArray, int n8) {
        int n9 = this.k0;
        int n10 = this.j0;
        if (n9 >= n10) {
            n9 = n10;
        }
        this.n0 = n9;
        System.arraycopy(this.h0, this.i0, byArray, n8, n9);
        this.p(this.n0);
        this.j(this.n0);
        n9 = this.m0;
        n8 = this.n0;
        this.m0 = n9 + n8;
        this.k0 -= n8;
        this.l0 += n8;
    }

    private void j(int n8) {
        this.j0 = n8 = this.j0 - n8;
        if (n8 <= 0) {
            this.j0 = 0;
        }
    }

    private byte[] m() throws IOException {
        byte[] byArray = new byte[2];
        this.f(byArray);
        return byArray;
    }

    private byte[] o(f object) throws IOException {
        if (((ax.rc.b)object).b() != null) {
            if (((ax.rc.a)(object = ((ax.rc.b)object).b())).b() != null) {
                object = new byte[((ax.rc.a)object).b().n()];
                this.f((byte[])object);
                return object;
            }
            throw new IOException("Invalid aes key strength in aes extra data record");
        }
        throw new IOException("invalid aes extra data record");
    }

    private void p(int n8) {
        this.i0 = n8 = this.i0 + n8;
        if (n8 >= 15) {
            this.i0 = 15;
        }
    }

    private void v(byte[] byArray, int n8) throws IOException {
        byte[] byArray2 = ((ax.lc.a)this.c()).b(n8);
        byte[] byArray3 = new byte[10];
        System.arraycopy(byArray2, 0, byArray3, 0, 10);
        if (Arrays.equals(byArray, byArray3)) {
            return;
        }
        throw new IOException("Reached end of data for this entry, but aes verification failed");
    }

    @Override
    protected void b(InputStream inputStream, int n8) throws IOException {
        this.v(this.u(inputStream), n8);
    }

    protected ax.lc.a q(f f8, char[] cArray, boolean bl) throws IOException {
        return new ax.lc.a(f8.b(), cArray, this.o(f8), this.m(), bl);
    }

    @Override
    public int read() throws IOException {
        if (this.read(this.g0) == -1) {
            return -1;
        }
        return this.g0[0];
    }

    @Override
    public int read(byte[] byArray) throws IOException {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        this.k0 = n9;
        this.l0 = n8;
        this.m0 = 0;
        if (this.j0 != 0) {
            this.g(byArray, n8);
            n8 = this.m0;
            if (n8 == n9) {
                return n8;
            }
        }
        if (this.k0 < 16) {
            byte[] byArray2 = this.h0;
            this.o0 = n8 = super.read(byArray2, 0, byArray2.length);
            this.i0 = 0;
            if (n8 == -1) {
                this.j0 = 0;
                n8 = this.m0;
                if (n8 > 0) {
                    return n8;
                }
                return -1;
            }
            this.j0 = n8;
            this.g(byArray, this.l0);
            n8 = this.m0;
            if (n8 == n9) {
                return n8;
            }
        }
        n8 = this.l0;
        n9 = this.k0;
        if ((n8 = super.read(byArray, n8, n9 - n9 % 16)) == -1) {
            n8 = this.m0;
            if (n8 > 0) {
                return n8;
            }
            return -1;
        }
        return n8 + this.m0;
    }

    protected byte[] u(InputStream inputStream) throws IOException {
        byte[] byArray = new byte[10];
        if (e.e(inputStream, byArray) == 10) {
            return byArray;
        }
        throw new ax.oc.a("Invalid AES Mac bytes. Could not read sufficient data");
    }
}

