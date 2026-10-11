/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.bc;

import com.jcraft.jsch.bc.SignatureEdDSA;

public class SignatureEd25519
extends SignatureEdDSA {
    @Override
    String k() {
        return "Ed25519";
    }

    @Override
    String l() {
        return "ssh-ed25519";
    }
}

