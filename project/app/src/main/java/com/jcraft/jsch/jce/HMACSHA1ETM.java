/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import com.jcraft.jsch.jce.HMACSHA1;

public class HMACSHA1ETM
extends HMACSHA1 {
    public HMACSHA1ETM() {
        this.a = "hmac-sha1-etm@openssh.com";
        this.d = true;
    }
}

