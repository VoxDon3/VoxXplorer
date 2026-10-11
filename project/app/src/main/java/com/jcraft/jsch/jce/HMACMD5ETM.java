/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import com.jcraft.jsch.jce.HMACMD5;

public class HMACMD5ETM
extends HMACMD5 {
    public HMACMD5ETM() {
        this.a = "hmac-md5-etm@openssh.com";
        this.d = true;
    }
}

