/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jbcrypt;

import com.jcraft.jsch.jbcrypt.BCrypt;

public class JBCrypt
implements com.jcraft.jsch.BCrypt {
    private BCrypt a;
    private byte[] b;
    private int c;

    @Override
    public void a(byte[] byArray, int n8) throws Exception {
        this.a = new BCrypt();
        this.b = byArray;
        this.c = n8;
    }

    @Override
    public byte[] c(byte[] byArray, int n8) {
        byte[] byArray2 = new byte[n8];
        this.a.f(byArray, this.b, this.c, byArray2);
        return byArray2;
    }
}

