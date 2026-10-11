/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import java.security.SecureRandom;

public class Random
implements com.jcraft.jsch.Random {
    private byte[] a = new byte[16];
    private SecureRandom b = new SecureRandom();

    @Override
    public void a(byte[] byArray, int n8, int n9) {
        if (n9 > this.a.length) {
            this.a = new byte[n9];
        }
        this.b.nextBytes(this.a);
        System.arraycopy(this.a, 0, byArray, n8, n9);
    }
}

