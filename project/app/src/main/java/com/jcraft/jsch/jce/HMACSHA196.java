/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import com.jcraft.jsch.jce.HMACSHA1;

public class HMACSHA196
extends HMACSHA1 {
    private final byte[] g = new byte[20];

    public HMACSHA196() {
        this.a = "hmac-sha1-96";
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

