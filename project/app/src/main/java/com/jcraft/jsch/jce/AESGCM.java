/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import ax.y9.a;
import com.jcraft.jsch.Cipher;
import java.nio.ByteBuffer;
import java.security.Key;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

abstract class AESGCM
implements Cipher {
    private javax.crypto.Cipher a;
    private SecretKeySpec b;
    private int c;
    private ByteBuffer d;
    private long e;

    AESGCM() {
    }

    @Override
    public void a(byte[] byArray, int n8, int n9, byte[] byArray2, int n10) throws Exception {
        this.a.update(byArray, n8, n9, byArray2, n10);
    }

    @Override
    public /* synthetic */ void e(int n8) {
        ax.y9.a.e(this, n8);
    }

    @Override
    public void f(byte[] byArray, int n8, int n9) throws Exception {
        this.a.updateAAD(byArray, n8, n9);
    }

    @Override
    public int g() {
        return 16;
    }

    @Override
    public void h(byte[] byArray, int n8, int n9, byte[] byArray2, int n10) throws Exception {
        this.a.doFinal(byArray, n8, n9, byArray2, n10);
        long l8 = this.d.getLong(4) + 1L;
        if (l8 != this.e) {
            this.d.putLong(4, l8);
            this.a.init(this.c, (Key)this.b, new GCMParameterSpec(128, this.d.array()));
            return;
        }
        throw new IllegalStateException("GCM IV would be reused");
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public /* synthetic */ boolean j() {
        return ax.y9.a.d(this);
    }

    @Override
    public void k(int n8, byte[] object, byte[] object2) throws Exception {
        byte[] byArray = object2;
        if (((byte[])object2).length > 12) {
            byArray = new byte[12];
            System.arraycopy(object2, 0, byArray, 0, 12);
        }
        int n9 = this.d();
        object2 = object;
        if (((byte[])object).length > n9) {
            object2 = new byte[n9];
            System.arraycopy(object, 0, object2, 0, n9);
        }
        n8 = n8 == 0 ? 1 : 2;
        this.c = n8;
        object = ByteBuffer.wrap(byArray);
        this.d = object;
        this.e = ((ByteBuffer)object).getLong(4);
        try {
            this.b = object = new SecretKeySpec((byte[])object2, "AES");
            object = new StringBuilder();
            ((StringBuilder)object).append("AES/GCM/");
            ((StringBuilder)object).append("NoPadding");
            object2 = javax.crypto.Cipher.getInstance(((StringBuilder)object).toString());
            this.a = object2;
            n8 = this.c;
            object = this.b;
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, byArray);
            ((javax.crypto.Cipher)object2).init(n8, (Key)object, gCMParameterSpec);
            return;
        }
        catch (Exception exception) {
            this.a = null;
            this.b = null;
            this.d = null;
            throw exception;
        }
    }

    @Override
    public int l() {
        return 16;
    }

    @Override
    public boolean m() {
        return true;
    }
}

