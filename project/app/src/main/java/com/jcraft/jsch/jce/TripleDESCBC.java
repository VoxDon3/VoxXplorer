/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import ax.y9.a;
import com.jcraft.jsch.Cipher;
import java.security.Key;
import java.security.spec.KeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class TripleDESCBC
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
        return true;
    }

    @Override
    public /* synthetic */ boolean j() {
        return ax.y9.a.d(this);
    }

    @Override
    public void k(int n8, byte[] object, byte[] object2) throws Exception {
        byte[] byArray = object2;
        if (((byte[])object2).length > 8) {
            byArray = new byte[8];
            System.arraycopy(object2, 0, byArray, 0, 8);
        }
        object2 = object;
        if (((byte[])object).length > 24) {
            object2 = new byte[24];
            System.arraycopy(object, 0, object2, 0, 24);
        }
        try {
            object = new StringBuilder;
            ((StringBuilder)object)();
            ((StringBuilder)object).append("DESede/CBC/");
            ((StringBuilder)object).append("NoPadding");
            this.a = javax.crypto.Cipher.getInstance(((StringBuilder)object).toString());
            object = new DESedeKeySpec((byte[])object2);
            object2 = SecretKeyFactory.getInstance("DESede").generateSecret((KeySpec)object);
            object = this.a;
            n8 = n8 == 0 ? 1 : 2;
        }
        catch (Exception exception) {
            this.a = null;
            throw exception;
        }
        IvParameterSpec ivParameterSpec = new IvParameterSpec(byArray);
        ((javax.crypto.Cipher)object).init(n8, (Key)object2, ivParameterSpec);
    }

    @Override
    public int l() {
        return 8;
    }

    @Override
    public /* synthetic */ boolean m() {
        return ax.y9.a.c(this);
    }
}

