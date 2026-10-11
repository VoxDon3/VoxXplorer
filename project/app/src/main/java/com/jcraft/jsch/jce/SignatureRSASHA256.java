/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import com.jcraft.jsch.jce.SignatureRSAN;

public class SignatureRSASHA256
extends SignatureRSAN {
    @Override
    String k() {
        return "rsa-sha2-256";
    }
}

