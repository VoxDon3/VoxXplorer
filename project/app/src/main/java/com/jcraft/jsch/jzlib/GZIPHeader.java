/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jzlib;

import com.jcraft.jsch.jzlib.Deflate;

final class GZIPHeader
implements Cloneable {
    private boolean c0 = false;
    int d0;
    int e0 = 255;
    byte[] f0;
    byte[] g0;
    byte[] h0;
    int i0;
    long j0;
    boolean k0 = false;
    long l0 = 0L;
    boolean q = false;

    GZIPHeader() {
    }

    void b(Deflate deflate) {
        int n8;
        int n9 = n8 = this.q;
        if (this.c0) {
            n9 = n8 | 2;
        }
        n8 = n9;
        if (this.f0 != null) {
            n8 = n9 | 4;
        }
        n9 = n8;
        if (this.g0 != null) {
            n9 = n8 | 8;
        }
        int n10 = n9;
        if (this.h0 != null) {
            n10 = n9 | 0x10;
        }
        n8 = (n8 = deflate.H0) == 1 ? 4 : (n8 == 9 ? 2 : 0);
        deflate.L(-29921);
        deflate.J((byte)8);
        deflate.J((byte)n10);
        deflate.J((byte)this.l0);
        deflate.J((byte)(this.l0 >> 8));
        deflate.J((byte)(this.l0 >> 16));
        deflate.J((byte)(this.l0 >> 24));
        deflate.J((byte)n8);
        deflate.J((byte)this.e0);
        byte[] byArray = this.f0;
        if (byArray != null) {
            deflate.J((byte)byArray.length);
            deflate.J((byte)(this.f0.length >> 8));
            byArray = this.f0;
            deflate.K(byArray, 0, byArray.length);
        }
        if ((byArray = this.g0) != null) {
            deflate.K(byArray, 0, byArray.length);
            deflate.J((byte)0);
        }
        if ((byArray = this.h0) != null) {
            deflate.K(byArray, 0, byArray.length);
            deflate.J((byte)0);
        }
    }

    void c(long l8) {
        this.j0 = l8;
    }

    public Object clone() throws CloneNotSupportedException {
        byte[] byArray;
        int n8;
        GZIPHeader gZIPHeader = (GZIPHeader)super.clone();
        byte[] byArray2 = gZIPHeader.f0;
        if (byArray2 != null) {
            n8 = byArray2.length;
            byArray = new byte[n8];
            System.arraycopy(byArray2, 0, byArray, 0, n8);
            gZIPHeader.f0 = byArray;
        }
        if ((byArray2 = gZIPHeader.g0) != null) {
            n8 = byArray2.length;
            byArray = new byte[n8];
            System.arraycopy(byArray2, 0, byArray, 0, n8);
            gZIPHeader.g0 = byArray;
        }
        if ((byArray = gZIPHeader.h0) != null) {
            n8 = byArray.length;
            byArray2 = new byte[n8];
            System.arraycopy(byArray, 0, byArray2, 0, n8);
            gZIPHeader.h0 = byArray2;
        }
        return gZIPHeader;
    }

    void d(long l8) {
        this.l0 = l8;
    }
}

