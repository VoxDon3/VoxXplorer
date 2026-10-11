/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jzlib;

import com.jcraft.jsch.jzlib.Adler32;
import com.jcraft.jsch.jzlib.Checksum;
import com.jcraft.jsch.jzlib.Deflate;
import com.jcraft.jsch.jzlib.Inflate;

class ZStream {
    byte[] a;
    int b;
    int c;
    long d;
    byte[] e;
    int f;
    int g;
    long h;
    String i;
    Deflate j;
    Inflate k;
    int l;
    Checksum m;

    ZStream() {
        this(new Adler32());
    }

    ZStream(Checksum checksum) {
        this.m = checksum;
    }

    void a() {
        Object object = this.j;
        int n8 = ((Deflate)object).g0;
        int n9 = this.g;
        int n10 = n8;
        if (n8 > n9) {
            n10 = n9;
        }
        if (n10 != 0) {
            Object object2 = ((Deflate)object).d0;
            n9 = ((byte[])object2).length;
            n8 = ((Deflate)object).f0;
            if (n9 > n8 && ((Object)(object = (Object)this.e)).length > this.f && ((byte[])object2).length >= n8 + n10) {
                n9 = ((Object)object).length;
            }
            System.arraycopy(object2, n8, this.e, this.f, n10);
            this.f += n10;
            object2 = this.j;
            object2.f0 += n10;
            this.h += (long)n10;
            this.g -= n10;
            object2.g0 = n10 = object2.g0 - n10;
            if (n10 == 0) {
                object2.f0 = 0;
            }
        }
    }

    void b() {
        this.a = null;
        this.e = null;
        this.i = null;
    }

    int c(byte[] byArray, int n8, int n9) {
        int n10 = this.c;
        if (n10 <= n9) {
            n9 = n10;
        }
        if (n9 == 0) {
            return 0;
        }
        this.c = n10 - n9;
        if (this.j.h0 != 0) {
            this.m.b(this.a, this.b, n9);
        }
        System.arraycopy(this.a, this.b, byArray, n8, n9);
        this.b += n9;
        this.d += (long)n9;
        return n9;
    }

    void d(byte[] byArray, int n8, int n9, boolean bl) {
        if (n9 <= 0 && bl && this.a != null) {
            return;
        }
        int n10 = this.c;
        if (n10 > 0 && bl) {
            byte[] byArray2 = new byte[n10 + n9];
            System.arraycopy(this.a, this.b, byArray2, 0, n10);
            System.arraycopy(byArray, n8, byArray2, this.c, n9);
            this.a = byArray2;
            this.b = 0;
            this.c += n9;
            return;
        }
        this.a = byArray;
        this.b = n8;
        this.c = n9;
    }

    void e(byte[] byArray, int n8, int n9) {
        this.e = byArray;
        this.f = n8;
        this.g = n9;
    }
}

