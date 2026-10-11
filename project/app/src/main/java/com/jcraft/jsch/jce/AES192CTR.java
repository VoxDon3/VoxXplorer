/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import ax.y9.a;
import com.jcraft.jsch.Cipher;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AES192CTR
implements Cipher {
    private javax.crypto.Cipher a;

    @Override
    public void a(byte[] byArray, int n8, int n9, byte[] byArray2, int n10) throws Exception {
        this.a.update(byArray, n8, n9, byArray2, n10);
    }

    @Override
    public int d() {
        return 24;
    }

    @Override
    public /* synthetic */ void e(int n8) {
        ax.y9.a.e(this, n8);
    }

    @Override
    public /* synthetic */ void f(byte[] byArray, int n8, int n9) {
        ax.y9.a.f(this, byArray, n8, n9);
    }

    @Override
    public /* synthetic */ int g() {
        return ax.y9.a.b(this);
    }

    @Override
    public /* synthetic */ void h(byte[] byArray, int n8, int n9, byte[] byArray2, int n10) {
        ax.y9.a.a(this, byArray, n8, n9, byArray2, n10);
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
        javax.crypto.Cipher cipher;
        byte[] byArray = object2;
        if (((byte[])object2).length > 16) {
            byArray = new byte[16];
            System.arraycopy(object2, 0, byArray, 0, 16);
        }
        object2 = object;
        if (((byte[])object).length > 24) {
            object2 = new byte[24];
            System.arraycopy(object, 0, object2, 0, 24);
        }
        try {
            object = new SecretKeySpec;
            object((byte[])object2, "AES");
            object2 = new StringBuilder;
            ((StringBuilder)object2)();
            ((StringBuilder)object2).append("AES/CTR/");
            ((StringBuilder)object2).append("NoPadding");
            this.a = cipher = javax.crypto.Cipher.getInstance(((StringBuilder)object2).toString());
            n8 = n8 == 0 ? 1 : 2;
        }
        catch (Exception exception) {
            this.a = null;
            throw exception;
        }
        object2 = new IvParameterSpec(byArray);
        cipher.init(n8, (Key)object, (AlgorithmParameterSpec)object2);
    }

    @Override
    public int l() {
        return 16;
    }

    @Override
    public /* synthetic */ boolean m() {
        return ax.y9.a.c(this);
    }
}

