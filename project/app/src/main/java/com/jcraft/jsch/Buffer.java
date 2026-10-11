/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.JSchException;

public class Buffer {
    final byte[] a = new byte[4];
    byte[] b;
    int c;
    int d;

    public Buffer() {
        this(20480);
    }

    public Buffer(int n8) {
        this.b = new byte[n8];
        this.c = 0;
        this.d = 0;
    }

    public Buffer(byte[] byArray) {
        this.b = byArray;
        this.c = 0;
        this.d = 0;
    }

    static Buffer b(byte[][] byArray) {
        int n8;
        int n9 = byArray.length * 4;
        int n10 = 0;
        for (n8 = 0; n8 < byArray.length; ++n8) {
            n9 += byArray[n8].length;
        }
        Buffer buffer = new Buffer(n9);
        for (n8 = n10; n8 < byArray.length; ++n8) {
            buffer.y(byArray[n8]);
        }
        return buffer;
    }

    public void A() {
        this.c = 0;
        this.d = 0;
    }

    void B() {
        this.d = 0;
    }

    public void C(int n8) {
        this.d = n8;
    }

    public void D() {
        int n8 = this.d;
        if (n8 == 0) {
            return;
        }
        byte[] byArray = this.b;
        System.arraycopy(byArray, n8, byArray, 0, this.c - n8);
        this.c -= this.d;
        this.d = 0;
    }

    void E(int n8) {
        this.c += n8;
    }

    void a(int n8) {
        byte[] byArray = this.b;
        int n9 = this.c;
        int n10 = n8 + n9 + 128;
        if (byArray.length < n10) {
            n8 = byArray.length * 2;
            if (n8 < n10) {
                n8 = n10;
            }
            byte[] byArray2 = new byte[n8];
            System.arraycopy(byArray, 0, byArray2, 0, n9);
            this.b = byArray2;
        }
    }

    public int c() {
        byte[] byArray = this.b;
        int n8 = this.d;
        this.d = n8 + 1;
        return byArray[n8] & 0xFF;
    }

    public int d(int n8) {
        int n9 = this.d;
        this.d = n8 + n9;
        return n9;
    }

    public void e(byte[] byArray) {
        this.f(byArray, 0, byArray.length);
    }

    void f(byte[] byArray, int n8, int n9) {
        System.arraycopy(this.b, this.d, byArray, n8, n9);
        this.d += n9;
    }

    byte[][] g(int n8, String string) throws JSchException {
        byte[][] byArrayArray = new byte[n8][];
        for (int i8 = 0; i8 < n8; ++i8) {
            int n9 = this.i();
            if (this.j() >= n9) {
                byte[] byArray = new byte[n9];
                byArrayArray[i8] = byArray;
                this.e(byArray);
                continue;
            }
            throw new JSchException(string);
        }
        return byArrayArray;
    }

    byte h() {
        return this.b[5];
    }

    public int i() {
        return this.o() << 16 & 0xFFFF0000 | this.o() & 0xFFFF;
    }

    public int j() {
        return this.c - this.d;
    }

    public long k() {
        return ((long)this.i() & 0xFFFFFFFFL) << 32 | 0xFFFFFFFFL & (long)this.i();
    }

    public byte[] l() {
        int n8;
        block3: {
            block2: {
                int n9 = this.i();
                if (n9 < 0) break block2;
                n8 = n9;
                if (n9 <= 8192) break block3;
            }
            n8 = 8192;
        }
        byte[] byArray = new byte[n8];
        this.f(byArray, 0, n8);
        return byArray;
    }

    public byte[] m() {
        int n8 = (this.i() + 7) / 8;
        byte[] byArray = new byte[n8];
        this.f(byArray, 0, n8);
        if ((byArray[0] & 0x80) != 0) {
            byte[] byArray2 = new byte[n8 + 1];
            byArray2[0] = 0;
            System.arraycopy(byArray, 0, byArray2, 1, n8);
            return byArray2;
        }
        return byArray;
    }

    public int n() {
        return this.d;
    }

    int o() {
        return this.c() << 8 & 0xFF00 | this.c() & 0xFF;
    }

    public byte[] p() {
        int n8;
        block3: {
            block2: {
                int n9 = this.i();
                if (n9 < 0) break block2;
                n8 = n9;
                if (n9 <= 262144) break block3;
            }
            n8 = 262144;
        }
        byte[] byArray = new byte[n8];
        this.f(byArray, 0, n8);
        return byArray;
    }

    byte[] q(int[] nArray, int[] nArray2) {
        int n8 = this.i();
        nArray[0] = this.d(n8);
        nArray2[0] = n8;
        return this.b;
    }

    public long r() {
        return ((long)this.c() << 8 & 0xFF00L | (long)(this.c() & 0xFF)) << 16 & 0xFFFFFFFFFFFF0000L | (0xFF00L & (long)this.c() << 8 | (long)(this.c() & 0xFF)) & 0xFFFFL;
    }

    public void s(byte by) {
        byte[] byArray = this.b;
        int n8 = this.c;
        this.c = n8 + 1;
        byArray[n8] = by;
    }

    public void t(byte[] byArray) {
        this.u(byArray, 0, byArray.length);
    }

    public void u(byte[] byArray, int n8, int n9) {
        System.arraycopy(byArray, n8, this.b, this.c, n9);
        this.c += n9;
    }

    public void v(int n8) {
        byte[] byArray = this.a;
        byArray[0] = (byte)(n8 >>> 24);
        byArray[1] = (byte)(n8 >>> 16);
        byArray[2] = (byte)(n8 >>> 8);
        byArray[3] = (byte)n8;
        System.arraycopy(byArray, 0, this.b, this.c, 4);
        this.c += 4;
    }

    public void w(long l8) {
        byte[] byArray = this.a;
        byArray[0] = (byte)(l8 >>> 56);
        byArray[1] = (byte)(l8 >>> 48);
        byArray[2] = (byte)(l8 >>> 40);
        byArray[3] = (byte)(l8 >>> 32);
        System.arraycopy(byArray, 0, this.b, this.c, 4);
        byArray = this.a;
        byArray[0] = (byte)(l8 >>> 24);
        byArray[1] = (byte)(l8 >>> 16);
        byArray[2] = (byte)(l8 >>> 8);
        byArray[3] = (byte)l8;
        System.arraycopy(byArray, 0, this.b, this.c + 4, 4);
        this.c += 8;
    }

    public void x(byte[] byArray) {
        int n8 = byArray.length;
        if ((byArray[0] & 0x80) != 0) {
            this.v(n8 + 1);
            this.s((byte)0);
        } else {
            this.v(n8);
        }
        this.t(byArray);
    }

    public void y(byte[] byArray) {
        this.z(byArray, 0, byArray.length);
    }

    public void z(byte[] byArray, int n8, int n9) {
        this.v(n9);
        this.u(byArray, n8, n9);
    }
}

