/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import ax.y9.a;
import com.jcraft.jsch.Cipher;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AES256CBC
implements Cipher {
    private javax.crypto.Cipher a;

    @Override
    public void a(byte[] byArray, int n8, int n9, byte[] byArray2, int n10) throws Exception {
        this.a.update(byArray, n8, n9, byArray2, n10);
    }

    @Override
    public int d() {
        return 32;
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
        return true;
    }

    @Override
    public /* synthetic */ boolean j() {
        return ax.y9.a.d(this);
    }

    @Override
    public void k(int n8, byte[] object, byte[] object2) throws Exception {
        byte[] byArray = object2;
        if (((byte[])object2).length > 16) {
            byArray = new byte[16];
            System.arraycopy(object2, 0, byArray, 0, 16);
        }
        object2 = object;
        if (((byte[])object).length > 32) {
            object2 = new byte[32];
            System.arraycopy(object, 0, object2, 0, 32);
        }
        try {
            object = new SecretKeySpec;
            object((byte[])object2, "AES");
            object2 = new StringBuilder;
            ((StringBuilder)object2)();
            ((StringBuilder)object2).append("AES/CBC/");
            ((StringBuilder)object2).append("NoPadding");
            this.a = object2 = javax.crypto.Cipher.getInstance(((StringBuilder)object2).toString());
            n8 = n8 == 0 ? 1 : 2;
        }
        catch (Exception exception) {
            this.a = null;
            throw exception;
        }
        IvParameterSpec ivParameterSpec = new IvParameterSpec(byArray);
        ((javax.crypto.Cipher)object2).init(n8, (Key)object, ivParameterSpec);
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

