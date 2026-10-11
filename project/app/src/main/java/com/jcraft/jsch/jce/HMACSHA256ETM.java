/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import com.jcraft.jsch.jce.HMACSHA256;

public class HMACSHA256ETM
extends HMACSHA256 {
    public HMACSHA256ETM() {
        this.a = "hmac-sha2-256-etm@openssh.com";
        this.d = true;
    }
}

