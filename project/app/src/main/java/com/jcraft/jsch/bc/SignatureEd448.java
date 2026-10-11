/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.bc;

import com.jcraft.jsch.bc.SignatureEdDSA;

public class SignatureEd448
extends SignatureEdDSA {
    @Override
    String k() {
        return "Ed448";
    }

    @Override
    String l() {
        return "ssh-ed448";
    }
}

