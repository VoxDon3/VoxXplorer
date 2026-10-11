/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import com.jcraft.jsch.jce.HMAC;

public class HMACSHA512
extends HMAC {
    public HMACSHA512() {
        this.a = "hmac-sha2-512";
        this.b = 64;
        this.c = "HmacSHA512";
    }
}

