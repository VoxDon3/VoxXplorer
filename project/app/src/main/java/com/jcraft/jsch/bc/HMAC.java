/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.bc;

import ax.Dd.k;
import ax.vd.d;
import ax.vd.i;
import ax.zd.c;
import com.jcraft.jsch.MAC;

abstract class HMAC
implements MAC {
    protected int a;
    protected i b;
    protected boolean c;
    private c d;
    private final byte[] e = new byte[4];

    HMAC() {
    }

    @Override
    public void a(byte[] object) throws Exception {
        int n8 = ((byte[])object).length;
        int n9 = this.a;
        Object object2 = object;
        if (n8 > n9) {
            object2 = new byte[n9];
            System.arraycopy(object, 0, object2, 0, n9);
        }
        object2 = new k((byte[])object2, 0, ((byte[])object2).length);
        object = new c(this.b);
        this.d = object;
        ((c)object).e((d)object2);
    }

    @Override
    public void b(byte[] byArray, int n8, int n9) {
        this.d.b(byArray, n8, n9);
    }

    @Override
    public void c(byte[] byArray, int n8) {
        this.d.c(byArray, n8);
    }

    @Override
    public int d() {
        return this.a;
    }

    @Override
    public void e(int n8) {
        byte[] byArray = this.e;
        byArray[0] = (byte)(n8 >>> 24);
        byArray[1] = (byte)(n8 >>> 16);
        byArray[2] = (byte)(n8 >>> 8);
        byArray[3] = (byte)n8;
        this.b(byArray, 0, 4);
    }

    @Override
    public boolean f() {
        return this.c;
    }
}

