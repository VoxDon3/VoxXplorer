/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jzlib;

import com.jcraft.jsch.jzlib.Deflate;
import com.jcraft.jsch.jzlib.GZIPException;
import com.jcraft.jsch.jzlib.ZStream;

final class Deflater
extends ZStream {
    private boolean n = false;

    Deflater() {
    }

    Deflater(int n8) throws GZIPException {
        this(n8, 15);
    }

    Deflater(int n8, int n9) throws GZIPException {
        this(n8, n9, false);
    }

    Deflater(int n8, int n9, boolean bl) throws GZIPException {
        n8 = this.i(n8, n9, bl);
        if (n8 == 0) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n8);
        stringBuilder.append(": ");
        stringBuilder.append(this.i);
        throw new GZIPException(stringBuilder.toString());
    }

    int f(int n8) {
        Deflate deflate = this.j;
        if (deflate == null) {
            return -2;
        }
        if ((n8 = deflate.m(n8)) == 1) {
            this.n = true;
        }
        return n8;
    }

    int g() {
        this.n = true;
        Deflate deflate = this.j;
        if (deflate == null) {
            return -2;
        }
        int n8 = deflate.n();
        this.j = null;
        this.b();
        return n8;
    }

    boolean h() {
        return this.n;
    }

    int i(int n8, int n9, boolean bl) {
        Deflate deflate;
        this.n = false;
        this.j = deflate = new Deflate(this);
        int n10 = n9;
        if (bl) {
            n10 = -n9;
        }
        return deflate.o(n8, n10);
    }
}

