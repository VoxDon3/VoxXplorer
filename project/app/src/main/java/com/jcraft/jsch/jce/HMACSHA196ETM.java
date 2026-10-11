/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import com.jcraft.jsch.jce.HMACSHA196;

public class HMACSHA196ETM
extends HMACSHA196 {
    public HMACSHA196ETM() {
        this.a = "hmac-sha1-96-etm@openssh.com";
        this.d = true;
    }
}

