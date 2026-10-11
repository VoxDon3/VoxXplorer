/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import com.jcraft.jsch.jce.HMAC;

public class HMACSHA1
extends HMAC {
    public HMACSHA1() {
        this.a = "hmac-sha1";
        this.b = 20;
        this.c = "HmacSHA1";
    }
}

