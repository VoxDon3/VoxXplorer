/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

abstract class PBKDF2
implements com.jcraft.jsch.PBKDF2 {
    private SecretKeyFactory a;
    private byte[] b;
    private int c;

    PBKDF2() {
    }

    @Override
    public void a(byte[] byArray, int n8) throws Exception {
        this.a = SecretKeyFactory.getInstance(this.e());
        this.b = byArray;
        this.c = n8;
    }

    @Override
    public byte[] c(byte[] object, int n8) {
        char[] cArray = new char[((byte[])object).length];
        for (int i8 = 0; i8 < ((byte[])object).length; ++i8) {
            cArray[i8] = (char)(object[i8] & 0xFF);
        }
        try {
            object = new PBEKeySpec;
            object(cArray, this.b, this.c, n8 * 8);
            object = this.a.generateSecret((KeySpec)object).getEncoded();
            return object;
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            return null;
        }
    }

    abstract String e();
}

