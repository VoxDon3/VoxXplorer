/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import com.jcraft.jsch.jce.HMACSHA512;

public class HMACSHA512ETM
extends HMACSHA512 {
    public HMACSHA512ETM() {
        this.a = "hmac-sha2-512-etm@openssh.com";
        this.d = true;
    }
}

