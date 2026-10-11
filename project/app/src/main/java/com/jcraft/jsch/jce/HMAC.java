/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.MAC;
import java.security.Key;
import javax.crypto.Mac;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

abstract class HMAC
implements MAC {
    protected String a;
    protected int b;
    protected String c;
    protected boolean d;
    private Mac e;
    private final byte[] f = new byte[4];

    HMAC() {
    }

    @Override
    public void a(byte[] object) throws Exception {
        int n8 = ((byte[])object).length;
        int n9 = this.b;
        Object object2 = object;
        if (n8 > n9) {
            object2 = new byte[n9];
            System.arraycopy(object, 0, object2, 0, n9);
        }
        object = new SecretKeySpec((byte[])object2, this.c);
        object2 = Mac.getInstance(this.c);
        this.e = object2;
        ((Mac)object2).init((Key)object);
    }

    @Override
    public void b(byte[] byArray, int n8, int n9) {
        this.e.update(byArray, n8, n9);
    }

    @Override
    public void c(byte[] byArray, int n8) {
        try {
            this.e.doFinal(byArray, n8);
            return;
        }
        catch (ShortBufferException shortBufferException) {
            if (JSch.k().isEnabled(3)) {
                JSch.k().b(3, shortBufferException.getMessage(), shortBufferException);
            }
            return;
        }
    }

    @Override
    public int d() {
        return this.b;
    }

    @Override
    public void e(int n8) {
        byte[] byArray = this.f;
        byArray[0] = (byte)(n8 >>> 24);
        byArray[1] = (byte)(n8 >>> 16);
        byArray[2] = (byte)(n8 >>> 8);
        byArray[3] = (byte)n8;
        this.b(byArray, 0, 4);
    }

    @Override
    public boolean f() {
        return this.d;
    }
}

