/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import com.jcraft.jsch.jce.SignatureRSAN;

public class SignatureRSA
extends SignatureRSAN {
    @Override
    String k() {
        return "ssh-rsa";
    }
}

