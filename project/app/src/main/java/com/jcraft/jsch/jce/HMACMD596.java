/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import com.jcraft.jsch.jce.HMACMD5;

public class HMACMD596
extends HMACMD5 {
    private final byte[] g = new byte[16];

    public HMACMD596() {
        this.a = "hmac-md5-96";
    }

    @Override
    public void c(byte[] byArray, int n8) {
        super.c(this.g, 0);
        System.arraycopy(this.g, 0, byArray, n8, 12);
    }

    @Override
    public int d() {
        return 12;
    }
}

